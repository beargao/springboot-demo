package com.honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by rongyaowen
 * on 2019/1/3.
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.honor.mapper"})
@EnableScheduling
@ImportAutoConfiguration
public class SpringbootDemoApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootDemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class);
    }
}
