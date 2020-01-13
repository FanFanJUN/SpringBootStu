package com.lc.mbg.mybatisgenerator.tools.impl;

import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.codegen.AbstractJavaClientGenerator;
import org.mybatis.generator.codegen.AbstractJavaGenerator;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;
import org.mybatis.generator.runtime.dynamic.sql.DynamicSqlMapperGenerator;
import org.mybatis.generator.runtime.dynamic.sql.DynamicSqlModelGenerator;

import java.util.List;

public class CcIntrospectedTableMyBatis3SimpleImpl extends IntrospectedTableMyBatis3Impl {

    @Override
    protected void calculateXmlMapperGenerator(AbstractJavaClientGenerator javaClientGenerator, List<String> warnings, ProgressCallback progressCallback) {
        this.xmlMapperGenerator = null;
        initializeAbstractGenerator(xmlMapperGenerator, warnings, progressCallback);
    }

    @Override
    protected void calculateJavaModelGenerators(List<String> warnings, ProgressCallback progressCallback) {
            AbstractJavaGenerator javaGenerator = new DynamicSqlModelGenerator();
        this.initializeAbstractGenerator(javaGenerator, warnings, progressCallback);
        this.javaModelGenerators.add(javaGenerator);
    }

}
