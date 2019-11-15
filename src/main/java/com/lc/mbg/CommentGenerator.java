package com.lc.mbg;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.List;
import java.util.Properties;

/**
 * 自定义注释生成器
 * Created by LiCai on 2019/11/12.
 */
public class CommentGenerator extends DefaultCommentGenerator {

    @Override
    public void addComment(XmlElement xmlElement) {

    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        topLevelClass.addJavaDocLine("/**");
        String format = "* %s实体类";
        String comment = String.format(format, new Object[] { introspectedTable.getRemarks()});
        topLevelClass.addJavaDocLine(comment);
        topLevelClass.addJavaDocLine(" * <p>");

        List<IntrospectedColumn> allColumns = introspectedTable.getAllColumns();
        for (IntrospectedColumn introspectedColumn : allColumns) {
            format = " * %s %s<br>";
            comment = String.format(format, new Object[] { introspectedColumn.getJavaProperty(), introspectedColumn.getRemarks()});
            topLevelClass.addJavaDocLine(comment);
        }
        topLevelClass.addJavaDocLine(" */");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String format = "/** %s */";
        String comment = String.format(format, new Object [] { introspectedColumn.getRemarks()});
        field.addJavaDocLine(comment);
    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        if(method.isConstructor()) {
            if(method.getParameters().size() == 0 ) {
                method.addJavaDocLine("/**");

                String format = " * %s构造函数";
                String comment = String.format(format, new Object[] { introspectedTable.getRemarks()});
                method.addJavaDocLine(comment);
                method.addJavaDocLine(" * <p>");
                method.addJavaDocLine(" * ");

                method.addJavaDocLine(" */ ");
            } else {
                method.addJavaDocLine("/**");

                String format = " * %s构造函数";
                String comment = String.format(format, new Object[] { introspectedTable.getRemarks()});
                method.addJavaDocLine(comment);
                method.addJavaDocLine(" * <p>");
                method.addJavaDocLine(" * ");

                List<IntrospectedColumn> allColumns = introspectedTable.getAllColumns();

                for (IntrospectedColumn introspectedColumn : allColumns) {
                    format = " * @param %s";
                    comment = String.format(format, new Object[]{ introspectedColumn.getJavaProperty()});
                    method.addJavaDocLine(comment);

                    format = " *               %s";
                    comment = String.format(format, new Object[]{introspectedColumn.getRemarks()});
                    method.addJavaDocLine(comment);
                }
                method.addJavaDocLine(" */");
            }


        }
        else {
            super.addGeneralMethodComment(method, introspectedTable);
        }
    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        method.addJavaDocLine("/**");

        String  format = " * 获取%s";
        String comment = String.format(format, new Object[]{introspectedColumn.getRemarks()});
        method.addJavaDocLine(comment);
        method.addJavaDocLine(" * <p>");
        method.addJavaDocLine(" * ");
        format = " * @return %s";
        comment = String.format(format, new Object[]{introspectedColumn.getRemarks()});
        method.addJavaDocLine(comment);
        method.addJavaDocLine(" */");
    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        method.addJavaDocLine("/**");

        String  format = " * 设置%s";
        String comment = String.format(format, new Object[]{introspectedColumn.getRemarks()});
        method.addJavaDocLine(comment);
        method.addJavaDocLine(" * <p>");
        method.addJavaDocLine(" * ");
        format = " * @param %s";
        comment = String.format(format, new Object[]{method.getParameters().get(0).getName()});
        method.addJavaDocLine(comment);

        format = " *               %s";
        comment = String.format(format, new Object[]{introspectedColumn.getRemarks()});
        method.addJavaDocLine(comment);
        method.addJavaDocLine(" */");
    }


}