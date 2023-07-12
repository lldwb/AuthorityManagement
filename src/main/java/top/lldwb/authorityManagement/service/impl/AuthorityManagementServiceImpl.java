package top.lldwb.authorityManagement.service.impl;

import top.lldwb.authorityManagement.dao.AuthorityManagementDAO;
import top.lldwb.authorityManagement.dao.impl.AuthorityManagementDAOImpl;
import top.lldwb.authorityManagement.entity.Role;
import top.lldwb.authorityManagement.service.AuthorityManagementService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class AuthorityManagementServiceImpl implements AuthorityManagementService {
    @Override
    public Boolean judge(String userId, String url) {

        AuthorityManagementDAO dao = new AuthorityManagementDAOImpl();
        Role userRole = dao.getRoleIdByUserId(userId);
        return dao.judge(userRole.getRoleId(),url);
    }
}
