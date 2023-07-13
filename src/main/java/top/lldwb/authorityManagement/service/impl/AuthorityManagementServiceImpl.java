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
        List<Role> roleUser = dao.getRoleIdAllByUserId(userId);
        List<Role> rolePurview = dao.getRoleIdAllByPurviewUrl(url);
        // 遍历集合
        for (Role roleIdUser : roleUser) {
            for (Role roleIdPurview : rolePurview) {
                if (roleIdUser.getRoleId() == roleIdPurview.getRoleId()) {
                    return true;
                }
            }
        }
        return false;
    }
}
