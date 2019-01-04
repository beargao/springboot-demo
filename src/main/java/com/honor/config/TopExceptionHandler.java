package com.honor.config;

import com.honor.util.GsonUtil;
import com.honor.util.LogUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一处理异常
 * <p>
 * Created by rongyaowen
 * on 2018/12/17.
 */
@ControllerAdvice
public class TopExceptionHandler {

    /**
     * 最顶层的异常处理
     *
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(Exception e) {
        LogUtil.info(e);
        return GsonUtil.failJson("系统资源异常，不妨将您的操作告知管理员");
    }
}