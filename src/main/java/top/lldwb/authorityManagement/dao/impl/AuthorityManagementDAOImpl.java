package top.lldwb.authorityManagement.dao.impl;

import top.lldwb.authorityManagement.dao.AuthorityManagementDAO;
import top.lldwb.authorityManagement.entity.Role;
import top.lldwb.authorityManagement.utils.MySqlUtil;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class AuthorityManagementDAOImpl implements AuthorityManagementDAO {
    @Override
    public Role getRoleIdByUserId(String userId) {
        if (userId == null) {
            return MySqlUtil.queryT(Role.class, "select * from role where role_id = 1;");
        } else {
            return MySqlUtil.queryT(Role.class, "select role.role_id,role_level,role_describe from role join user where role.role_id = user.role_id and user_id = ?", userId);
        }
    }

    @Override
    public Role getRoleIdByPurviewUrl(String purviewUrl) {
        return MySqlUtil.queryT(Role.class, "select role.role_id,role_level,role_describe from role join purview where role.role_id = purview.role_id and purview_url = ?", purviewUrl);
    }
}
