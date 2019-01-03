package com.honor.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by rongyaowen
 * on 2019/1/3.
 */
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器开始");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("过滤器结束");

    }

    @Override
    public void destroy() {

    }
}
