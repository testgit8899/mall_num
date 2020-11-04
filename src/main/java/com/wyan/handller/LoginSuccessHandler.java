package com.wyan.handller;

import com.alibaba.fastjson.JSON;
import com.wyan.common.CommonValue;
import com.wyan.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2020-05-15 14:33
 * @Description:
 */
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    private static final Logger log = LoggerFactory.getLogger(LoginSuccessHandler.class);
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)  {
        /* 默认：会帮我们跳转到上一次请求的页面上 */
        //super.onAuthenticationSuccess(request, response, authentication);
        PrintWriter writer = null;
        Result result =null;
        try {
            writer = response.getWriter();
            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            //登录成功返回json数据
            User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            Collection<GrantedAuthority> authorities = user.getAuthorities();
            for(GrantedAuthority authority:authorities){
                String role = authority.getAuthority();
                if(role.equals("ROLE_ADMIN")){
                     result = new Result(true,"登录成功", CommonValue.ADMIN_SUCCESS);
                }else if(role.equals("ROLE_AGENT")){
                     result = new Result(true,"登录成功", CommonValue.AGENT_SUCCESS);
                }else{
                     result = new Result(true,"登录成功", CommonValue.USER_SUCCESS);
                }
                String resultStr = JSON.toJSONString(result);
                writer.write(resultStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
            result = new Result(false,"服务器繁忙",CommonValue.EXCEPTION);
            String resultStr = JSON.toJSONString(result);
            writer.write(resultStr);
        }finally {
            writer.flush();
            writer.close();
        }
    }
}
