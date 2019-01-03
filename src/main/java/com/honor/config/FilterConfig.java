package com.honor.config;

import com.honor.filter.FilterDemo;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rongyaowen
 * on 2018/12/13.
 */
@Configuration
public class FilterConfig {

    /**
     * 过滤器demo
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean demoFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new FilterDemo());
        // 过滤器顺序
        registration.setOrder(1);
        return registration;
    }
}
