package top.lldwb.authorityManagement.service.impl;

import top.lldwb.authorityManagement.dao.AuthorityManagementDAO;
import top.lldwb.authorityManagement.dao.impl.AuthorityManagementDAOImpl;
import top.lldwb.authorityManagement.entity.Role;
import top.lldwb.authorityManagement.service.AuthorityManagementService;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class AuthorityManagementServiceImpl implements AuthorityManagementService {
    @Override
    public Boolean judge(String userId, String url) {
        System.out.println(074);
        AuthorityManagementDAO dao = new AuthorityManagementDAOImpl();
        Role userRole = dao.getRoleIdByUserId(userId);
        System.out.println(userRole);
        Role purviewRole = dao.getRoleIdByPurviewUrl(url);
        System.out.println(purviewRole);
        System.out.println(userRole.getRoleId() == purviewRole.getRoleId());
        System.out.println(userRole.getRoleLevel() > purviewRole.getRoleLevel());
        System.out.println(userRole.getRoleId() == purviewRole.getRoleId() || userRole.getRoleLevel() > purviewRole.getRoleLevel());
        Boolean judgeRole = userRole.getRoleId() == purviewRole.getRoleId() || userRole.getRoleLevel() > purviewRole.getRoleLevel();
        return judgeRole;
    }
}
