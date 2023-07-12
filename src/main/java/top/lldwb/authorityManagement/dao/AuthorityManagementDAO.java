package top.lldwb.authorityManagement.dao;

import top.lldwb.authorityManagement.entity.Purview;
import top.lldwb.authorityManagement.entity.Role;

import java.util.Map;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public interface AuthorityManagementDAO {
    /**
     * 返回用户对应的角色
     *
     * @param userId
     * @return 角色实体类
     */
    Role getRoleIdByUserId(String userId);

    /**
     * 判断是否有权限
     *
     * @param roleId 角色id
     * @param url    访问的url地址
     * @return 判断
     */
    Boolean judge(int roleId, String url);

}
