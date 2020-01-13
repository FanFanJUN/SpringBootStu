package com.lc.mbg.mybatisgenerator.tools.xmlmapper;

import com.lc.mbg.mybatisgenerator.tools.elements.CcResultMapWithoutBLOBsElementGenerator;
import com.lc.mbg.mybatisgenerator.tools.elements.CcSelectByPrimaryKeyElementGenerator;
import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.XMLMapperGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.*;
import org.mybatis.generator.internal.util.messages.Messages;

public class CcXMLMapperGenerator extends XMLMapperGenerator {

    @Override
    protected XmlElement getSqlMapElement() {
        FullyQualifiedTable table = introspectedTable.getFullyQualifiedTable();
        progressCallback.startTask(Messages.getString("Progress.12", table.toString()));
        XmlElement answer = new XmlElement("mapper");
        String namespace = introspectedTable.getBaseRecordType();
        namespace = namespace.indexOf('.') != -1? namespace.substring(namespace.lastIndexOf('.')+1): namespace;
        answer.addAttribute(new Attribute("namespace", namespace));

        context.getCommentGenerator().addRootComment(answer);

        addResultMapWithoutBLOBsElement(answer);
        addBaseColumnListElement(answer);

        addSelectByPrimaryKeyElement(answer);
        addSelectByExampleWithoutBLOBsElement(answer);
        addDeleteByPrimaryKeyElement(answer);
        addInsertElement(answer);
        addInsertSelectiveElement(answer);
        addUpdateByParamsSelectiveElement(answer);
        addUpdateByPrimaryKeySelectiveElement(answer);

        return answer;
    }

    @Override
    protected void addResultMapWithoutBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateBaseResultMap()) {
            AbstractXmlElementGenerator elementGenerator = new CcResultMapWithoutBLOBsElementGenerator(false);
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    @Override
    protected void addSelectByExampleWithoutBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateSelectByExampleWithoutBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new SelectByExampleWithoutBLOBsElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    @Override
    protected void addSelectByPrimaryKeyElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateSelectByPrimaryKey()) {
            AbstractXmlElementGenerator elementGenerator = new CcSelectByPrimaryKeyElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    @Override
    protected void addDeleteByPrimaryKeyElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateDeleteByPrimaryKey()) {
            AbstractXmlElementGenerator elementGenerator = new DeleteByPrimaryKeyElementGenerator(false);
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    @Override
    protected void addInsertElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateInsert()) {
            AbstractXmlElementGenerator elementGenerator = new InsertElementGenerator(false);
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    @Override
    protected void addInsertSelectiveElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateInsertSelective()) {
            AbstractXmlElementGenerator elementGenerator = new InsertSelectiveElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addUpdateByParamsSelectiveElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateUpdateByExampleWithoutBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new UpdateByExampleWithoutBLOBsElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    @Override
    protected void addUpdateByPrimaryKeySelectiveElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateUpdateByPrimaryKeySelective()) {
            AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeySelectiveElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

}
