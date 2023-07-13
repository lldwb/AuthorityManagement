package top.lldwb.authorityManagement.filterate;

import com.fasterxml.jackson.databind.ObjectMapper;
import top.lldwb.authorityManagement.controller.BaseController;
import top.lldwb.authorityManagement.service.AuthorityManagementService;
import top.lldwb.authorityManagement.service.impl.AuthorityManagementServiceImpl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

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
        System.out.println("客户端发起请求");
        System.out.println();

        /**
         如果请求的URI以"xx.html"、"xx.do"或"xx.do"结尾,
         则表示用户正在登录或执行在线操作，此时通过filterChain.doFilter(request, response)方法直接放行，让请求继续向目标资源进行处理。
         */
        // 请求获取(相对路径)url地址
        HttpServletRequest servletRequest = (HttpServletRequest) request;
        String url = servletRequest.getRequestURI();
        System.out.println(url);

        // 使用传参
        String userId = request.getParameter("userId");
        // 使用会话
//        String userId = (String) servletRequest.getSession().getAttribute("userId");
        System.out.println(userId);

        // 判断是否有权限
        AuthorityManagementService service = new AuthorityManagementServiceImpl();
        if (service.judge(userId, url)) {
            System.out.println("有权限");
            // 转发到对应的接口
            chain.doFilter(request, response);
        } else {
            // 设置请求和响应为utf-8编码
//            request.setCharacterEncoding("utf-8");
//            response.setCharacterEncoding("utf-8");

            if (userId == null){
                // 如果没有登录并且游客没有权限
                response.getWriter().println(new ObjectMapper().writeValueAsString(new BaseController().error(401, "not logged on")));
            }else {
                // 如果已经登录但是没有权限
                response.getWriter().println(new ObjectMapper().writeValueAsString(new BaseController().error(403, "do not have permission")));
            }
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("过滤结束!");
    }
}
