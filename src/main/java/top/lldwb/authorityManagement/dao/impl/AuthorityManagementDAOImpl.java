package top.lldwb.authorityManagement.dao.impl;

import top.lldwb.authorityManagement.dao.AuthorityManagementDAO;
import top.lldwb.authorityManagement.entity.Role;
import top.lldwb.authorityManagement.utils.MySqlUtil;

import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class AuthorityManagementDAOImpl implements AuthorityManagementDAO {
    @Override
    public List<Integer> getRoleIdAllByUserId(String userId) {
        if (userId == null) {
            // 如果没有用户id就返回默认的游客角色id
            return MySqlUtil.queryList(Integer.class, "select role_id from role where role_id = 1;");
        } else {
            // 根据用户id获取角色id集合
            return MySqlUtil.queryList(Integer.class, "select role.role_id from role join role_user where role.role_id = role_user.role_id and user_id = ?", userId);
        }
    }

    @Override
    public List<Integer> getRoleIdAllByPurviewUrl(String url) {
        // 根据url获取角色id集合
        return MySqlUtil.queryList(Integer.class, "select role.role_id from purview join role_purview where purview.purview_id = role_purview.purview_id and role_id = ? an d purview_url = ?", url);
    }
}
