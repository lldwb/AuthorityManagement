package top.lldwb.authorityManagement.entity;

import lombok.Data;
import org.nf.db.util.Column;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
@Data
public class Role {
    @Column("role_id")
    private Integer roleId;
    @Column("role_level")
    private Integer roleLevel;
    @Column("role_describe")
    private String roleDescribe;

}
