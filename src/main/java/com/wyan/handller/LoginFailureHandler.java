package com.wyan.handller;

import com.alibaba.fastjson.JSON;
import com.wyan.common.CommonValue;
import com.wyan.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther: wyan
 * @Date: 2020-05-15 14:53
 * @Description:
 */
public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginFailureHandler.class);
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        LOGGER.error("登录错误 [{}] ",exception.getMessage());
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            Result result = new Result(false,"账号密码有误",CommonValue.FAILE);
            String resultStr = JSON.toJSONString(result);
            writer.write(resultStr);
        } catch (IOException e) {
            e.printStackTrace();
            Result result = new Result(false,"服务器繁忙",CommonValue.EXCEPTION);
            String resultStr = JSON.toJSONString(result);
            writer.write(resultStr);
        }finally {
            writer.flush();
            writer.close();
        }

    }


}

