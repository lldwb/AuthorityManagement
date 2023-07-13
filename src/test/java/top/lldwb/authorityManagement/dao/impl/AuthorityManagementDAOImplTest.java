package top.lldwb.authorityManagement.dao.impl;

import org.junit.jupiter.api.Test;
import top.lldwb.authorityManagement.dao.AuthorityManagementDAO;
import top.lldwb.authorityManagement.entity.Role;
import top.lldwb.authorityManagement.service.AuthorityManagementService;
import top.lldwb.authorityManagement.service.impl.AuthorityManagementServiceImpl;
import top.lldwb.authorityManagement.utils.MySqlUtil;

import javax.servlet.http.HttpServletRequest;
import java.rmi.RemoteException;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class AuthorityManagementDAOImplTest {
    @Test
    public void dao(){
//        AuthorityManagementDAO dao = new AuthorityManagementDAOImpl();
//        Role userRole = dao.getRoleIdAllByUserId("1");
////        Role userRole = dao.getRoleIdAllByUserId(null);
//        System.out.println(userRole);
//        Role purviewRole = dao.getRoleIdByPurviewUrl("/CityInfo/getCityInfo");
//        System.out.println(purviewRole);


//        //请求获取(相对路径)url地址
//        String url = "/CityInfo/getCityInfoByCityName";
//        AuthorityManagementService service = new AuthorityManagementServiceImpl();
//        System.out.println(url);
//        System.out.println("1");
//        System.out.println(service.getRoleIdAllByPurviewUrl("1",url));


//        String str = MySqlUtil.queryColumn(1,"select purview_describe from purview join role_purview where purview.purview_id = role_purview.purview_id and role_id = 1 and purview_url = '/CityInfo/getCityInfo'");
//        System.out.println(str);
//
//        str = MySqlUtil.queryColumn(1,"select purview_describe from purview join role_purview where purview.purview_id = role_purview.purview_id and role_id = 1 and purview_url = '/CityInfo/getCityIcnfo'");
//        System.out.println(str==null);
    }
}
