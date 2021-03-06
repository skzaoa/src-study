package com.sk.study.demo.springcloud.simple.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义过滤器
 * @author sk
 * create on  2020/6/13:10:05
 */
@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER -1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        //获取request
        HttpServletRequest request = ctx.getRequest();
        //判断请求参数
        String token = request.getParameter("access-token");
        //判断是否存在
        if (StringUtils.isBlank(token)) {
            //不存在，拦截
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(HttpStatus.FORBIDDEN.value());
        }

        return null;
    }
}
