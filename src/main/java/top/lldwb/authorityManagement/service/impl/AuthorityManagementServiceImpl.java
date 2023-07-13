package top.lldwb.authorityManagement.service.impl;

import top.lldwb.authorityManagement.dao.AuthorityManagementDAO;
import top.lldwb.authorityManagement.dao.impl.AuthorityManagementDAOImpl;
import top.lldwb.authorityManagement.entity.Role;
import top.lldwb.authorityManagement.service.AuthorityManagementService;

import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class AuthorityManagementServiceImpl implements AuthorityManagementService {
    @Override
    public Boolean judge(String userId, String url) {

        AuthorityManagementDAO dao = new AuthorityManagementDAOImpl();
        // 根据用户id获取角色id集合
        List<Integer> roleUser = dao.getRoleIdAllByUserId(userId);
        // 根据url获取角色id集合
        List<Integer> rolePurview = dao.getRoleIdAllByPurviewUrl(url);
        for (Integer roleIdUser : roleUser) {
            for (Integer roleIdPurview : rolePurview) {
                if (roleIdUser == roleIdPurview) {
                    return true;
                }
            }
        }
        return false;
    }
}
