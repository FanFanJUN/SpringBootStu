# SpringBoot走过的坑
###### [Mybatis generator mapper文件重新生成不会覆盖原文件](https://blog.csdn.net/zengqiang1/article/details/79381418)

```
使用标题所述的generator，在生成xxxMapper.xml文件后
，再生成一次，新的内容会以追加的方式加入到原来的xxxMapper.xml文件中。
（通常我是希望覆盖的）
```

```
public class OverIsMergeablePlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
        try {
            Field field = sqlMap.getClass().getDeclaredField("isMergeable");
            field.setAccessible(true);
            field.setBoolean(sqlMap, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
```
配置generatorConfig.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
  PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
  "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">

<!-- 详细文档 http://www.mybatis.org/generator/configreference/xmlconfig.html -->
<generatorConfiguration>

    <properties resource="config.properties" />

    <context id="generatorContext" targetRuntime="${targetRuntime}">

        <plugin type="com.wql.customer.OverIsMergeablePlugin" />

        <commentGenerator type="com.wql.customer.CustomerCommentGenerator">
            <property name="suppressDate" value="false" />
            <property name="suppressAllComments" value="false" />
            <property name="addRemarkComments" value="true" />
            <property name="dateFormat" value="yyyy-MM-dd HH:mm:ss" />
        </commentGenerator>

        <jdbcConnection driverClass="${jdbc.driver}" connectionURL="${jdbc.url}" userId="${jdbc.username}" password="${jdbc.password}"></jdbcConnection>

        <javaTypeResolver>
            <property name="forceBigDecimals" value="false" />
        </javaTypeResolver>

        <javaModelGenerator targetPackage="${model.package}" targetProject="${target.project}">
            <property name="enableSubPackages" value="true" />
            <property name="trimStrings" value="true" />
        </javaModelGenerator>

        <sqlMapGenerator targetPackage="${xml.package}" targetProject="${target.project.resources}">
            <property name="enableSubPackages" value="true" />
        </sqlMapGenerator>

        <javaClientGenerator targetPackage="${mapper.package}" targetProject="${target.project}" type="XMLMAPPER">
            <property name="enableSubPackages" value="true" />
        </javaClientGenerator>

        <table tableName="${tableName}" domainObjectName="${domainObjectName}" enableCountByExample="${enableCountByExample}" enableUpdateByExample="${enableUpdateByExample}" enableDeleteByExample="${enableDeleteByExample}" enableSelectByExample="${enableSelectByExample}" selectByExampleQueryId="${selectByExampleQueryId}" />

    </context>
</generatorConfiguration>
```

