package top.lldwb.authorityManagement.dao;

import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public interface AuthorityManagementDAO {
    /**
     * 根据用户id获取角色id集合
     *
     * @param userId
     * @return 角色id集合
     */
    List<Integer> getRoleIdAllByUserId(String userId);

    /**
     * 根据url获取角色id集合
     *
     * @param url 访问的url地址
     * @return 角色id集合
     */
    List<Integer> getRoleIdAllByPurviewUrl(String url);

}
