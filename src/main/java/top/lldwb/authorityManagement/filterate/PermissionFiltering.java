package top.lldwb.authorityManagement.filterate;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class PermissionFiltering implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("过滤中...");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(11);
        System.out.println(((HttpServletRequest)request).getRequestURI());

        /**
         如果请求的URI以"xx.html"、"xx.do"或"xx.do"结尾,
         则表示用户正在登录或执行在线操作，此时通过filterChain.doFilter(request, response)方法直接放行，让请求继续向目标资源进行处理。
         */
        //请求获取url地址
        String url = request.getLocalName();
        System.out.println(url);
        if (true) {
            System.out.println("1");
            chain.doFilter(request, response);
        } else {
            throw new RemoteException("没有权限");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("过滤结束!");
    }
}
