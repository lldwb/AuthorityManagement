package top.lldwb.authorityManagement.service;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public interface AuthorityManagementService {
    /**
     * 判断是否有权限
     *
     * @param userId
     * @param url
     * @return
     */
    Boolean judge(String userId, String url);
}
