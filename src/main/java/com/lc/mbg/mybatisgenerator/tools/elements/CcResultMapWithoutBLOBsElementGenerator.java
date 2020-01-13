package com.lc.mbg.mybatisgenerator.tools.elements;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.ResultMapWithoutBLOBsElementGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Iterator;
import java.util.List;

public class CcResultMapWithoutBLOBsElementGenerator extends ResultMapWithoutBLOBsElementGenerator {
    private boolean isSimple;

    public CcResultMapWithoutBLOBsElementGenerator(boolean isSimple) {
        super(isSimple);
        this.isSimple = isSimple;
    }

    @Override
    public void addElements(XmlElement parentElement) {
        XmlElement answer = new XmlElement("resultMap");
        answer.addAttribute(new Attribute("id", this.introspectedTable.getBaseResultMapId()));
        String returnType;
        if (this.isSimple) {
            returnType = this.introspectedTable.getBaseRecordType();
        } else if (this.introspectedTable.getRules().generateBaseRecordClass()) {
            returnType = this.introspectedTable.getBaseRecordType();
        } else {
            returnType = this.introspectedTable.getPrimaryKeyType();
        }

        answer.addAttribute(new Attribute("type", returnType));
        this.context.getCommentGenerator().addComment(answer);
        if (this.introspectedTable.isConstructorBased()) {
            this.addResultMapConstructorElements(answer);
        } else {
            this.addResultMapElements(answer);
        }

        if (this.context.getPlugins().sqlMapResultMapWithoutBLOBsElementGenerated(answer, this.introspectedTable)) {
            parentElement.addElement(answer);
        }

    }

    private void addResultMapElements(XmlElement answer) {
        XmlElement resultElement;
        for(Iterator var2 = this.introspectedTable.getPrimaryKeyColumns().iterator(); var2.hasNext(); answer.addElement(resultElement)) {
            IntrospectedColumn introspectedColumn = (IntrospectedColumn)var2.next();
            resultElement = new XmlElement("id");
            resultElement.addAttribute(new Attribute("column", MyBatis3FormattingUtilities.getRenamedColumnNameForResultMap(introspectedColumn)));
            resultElement.addAttribute(new Attribute("property", introspectedColumn.getJavaProperty()));
            resultElement.addAttribute(new Attribute("jdbcType", introspectedColumn.getJdbcTypeName()));
            if (StringUtility.stringHasValue(introspectedColumn.getTypeHandler())) {
                resultElement.addAttribute(new Attribute("typeHandler", introspectedColumn.getTypeHandler()));
            }
        }

        List columns;
        if (this.isSimple) {
            columns = this.introspectedTable.getNonPrimaryKeyColumns();
        } else {
            columns = this.introspectedTable.getBaseColumns();
        }

        for(Iterator var7 = columns.iterator(); var7.hasNext(); answer.addElement(resultElement)) {
            IntrospectedColumn introspectedColumn = (IntrospectedColumn)var7.next();
            resultElement = new XmlElement("result");
            resultElement.addAttribute(new Attribute("column", MyBatis3FormattingUtilities.getRenamedColumnNameForResultMap(introspectedColumn)));
            resultElement.addAttribute(new Attribute("property", introspectedColumn.getJavaProperty()));
            resultElement.addAttribute(new Attribute("jdbcType", introspectedColumn.getJdbcTypeName()));
            if (StringUtility.stringHasValue(introspectedColumn.getTypeHandler())) {
                resultElement.addAttribute(new Attribute("typeHandler", introspectedColumn.getTypeHandler()));
            }
        }

    }

    private void addResultMapConstructorElements(XmlElement answer) {
        XmlElement constructor = new XmlElement("constructor");

        XmlElement resultElement;
        for(Iterator var3 = this.introspectedTable.getPrimaryKeyColumns().iterator(); var3.hasNext(); constructor.addElement(resultElement)) {
            IntrospectedColumn introspectedColumn = (IntrospectedColumn)var3.next();
            resultElement = new XmlElement("idArg");
            resultElement.addAttribute(new Attribute("column", MyBatis3FormattingUtilities.getRenamedColumnNameForResultMap(introspectedColumn)));
            resultElement.addAttribute(new Attribute("jdbcType", introspectedColumn.getJdbcTypeName()));
            resultElement.addAttribute(new Attribute("javaType", introspectedColumn.getFullyQualifiedJavaType().getFullyQualifiedName()));
            if (StringUtility.stringHasValue(introspectedColumn.getTypeHandler())) {
                resultElement.addAttribute(new Attribute("typeHandler", introspectedColumn.getTypeHandler()));
            }
        }

        List columns;
        if (this.isSimple) {
            columns = this.introspectedTable.getNonPrimaryKeyColumns();
        } else {
            columns = this.introspectedTable.getBaseColumns();
        }

        for(Iterator var8 = columns.iterator(); var8.hasNext(); constructor.addElement(resultElement)) {
            IntrospectedColumn introspectedColumn = (IntrospectedColumn)var8.next();
            resultElement = new XmlElement("arg");
            resultElement.addAttribute(new Attribute("column", MyBatis3FormattingUtilities.getRenamedColumnNameForResultMap(introspectedColumn)));
            resultElement.addAttribute(new Attribute("jdbcType", introspectedColumn.getJdbcTypeName()));
            resultElement.addAttribute(new Attribute("javaType", introspectedColumn.getFullyQualifiedJavaType().getFullyQualifiedName()));
            if (StringUtility.stringHasValue(introspectedColumn.getTypeHandler())) {
                resultElement.addAttribute(new Attribute("typeHandler", introspectedColumn.getTypeHandler()));
            }
        }

        answer.addElement(constructor);
    }
}
