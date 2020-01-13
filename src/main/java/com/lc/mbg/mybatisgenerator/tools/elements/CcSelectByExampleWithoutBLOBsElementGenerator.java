package com.lc.mbg.mybatisgenerator.tools.elements;

import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.SelectByExampleWithoutBLOBsElementGenerator;
import org.mybatis.generator.internal.util.StringUtility;

public class CcSelectByExampleWithoutBLOBsElementGenerator extends SelectByExampleWithoutBLOBsElementGenerator {

    @Override
    public void addElements(XmlElement parentElement) {
        XmlElement answer = new XmlElement("select");
        answer.addAttribute(new Attribute("id", "selectList"));
        answer.addAttribute(new Attribute("resultMap", this.introspectedTable.getBaseResultMapId()));

        this.context.getCommentGenerator().addComment(answer);
        answer.addElement(new TextElement("select"));
        XmlElement ifElement = new XmlElement("if");
        ifElement.addAttribute(new Attribute("test", "distinct"));
        ifElement.addElement(new TextElement("distinct"));
        answer.addElement(ifElement);
        StringBuilder sb = new StringBuilder();
        if (StringUtility.stringHasValue(this.introspectedTable.getSelectByExampleQueryId())) {
            sb.append('\'');
            sb.append(this.introspectedTable.getSelectByExampleQueryId());
            sb.append("' as QUERYID,");
            answer.addElement(new TextElement(sb.toString()));
        }

        answer.addElement(this.getBaseColumnListElement());
        sb.setLength(0);
        sb.append("from ");
        sb.append(this.introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime());
        answer.addElement(new TextElement(sb.toString()));
        answer.addElement(this.getExampleIncludeElement());
        ifElement = new XmlElement("if");
        ifElement.addAttribute(new Attribute("test", "orderByClause != null"));
        ifElement.addElement(new TextElement("order by ${orderByClause}"));
        answer.addElement(ifElement);
        if (this.context.getPlugins().sqlMapSelectByExampleWithoutBLOBsElementGenerated(answer, this.introspectedTable)) {
            parentElement.addElement(answer);
        }

    }
}
