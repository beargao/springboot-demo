package com.honor.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 代码生成器
 *
 * @author rongyaowen
 * @create 2019-01-13 11:58
 **/
public class Generator {
    public static void main(String[] args) throws Exception {
        List<String> warnIngs = new ArrayList<>();
        boolean overwright = true;
        InputStream inputStream = Generator.class.getResourceAsStream("genetator/generatorConfig.xml");
        ConfigurationParser configurationParser = new ConfigurationParser(warnIngs);
        Configuration configuration = configurationParser.parseConfiguration(inputStream);
        inputStream.close();
        DefaultShellCallback callback = new DefaultShellCallback(overwright);
        MyBatisGenerator myBatisGenerator =  new MyBatisGenerator(configuration,callback,warnIngs);
        myBatisGenerator.generate(null);
        for (String warnIng : warnIngs){
            System.out.println(warnIng);
        }
    }
}
