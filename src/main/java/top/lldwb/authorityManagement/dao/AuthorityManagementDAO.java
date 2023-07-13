package top.lldwb.authorityManagement.dao;

import top.lldwb.authorityManagement.entity.Role;

import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public interface AuthorityManagementDAO {
    /**
     * 根据用户id获取角色集合
     *
     * @param userId
     * @return 角色集合
     */
    List<Role> getRoleIdAllByUserId(String userId);

    /**
     * 根据url获取角色集合
     *
     * @param url 访问的url地址
     * @return 角色集合
     */
    List<Role> getRoleIdAllByPurviewUrl(String url);

}
