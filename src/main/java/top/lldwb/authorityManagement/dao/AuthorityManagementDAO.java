package top.lldwb.authorityManagement.dao;

import top.lldwb.authorityManagement.entity.Role;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public interface AuthorityManagementDAO {
    /**
     * 返回用户对应的角色
     * @param userId
     * @return
     */
    Role getRoleIdByUserId(String userId);
    /**
     * 返回权限对应角色id
     * @param purviewUrl
     * @return
     */
    Role getRoleIdByPurviewUrl(String purviewUrl);

}
