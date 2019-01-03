package com.honor.config;

import com.honor.interceptor.InterceptorDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web配置
 *
 * @author rongyaowen
 * @create 2018-10-29 20:41
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public InterceptorDemo getInterceptorDemo() {
        return new InterceptorDemo();
    }

    /**
     * 配置拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(getInterceptorDemo());
        interceptorRegistration.addPathPatterns("/**");
        // 静态资源不拦截
        interceptorRegistration.excludePathPatterns("/static/**");
    }

}
