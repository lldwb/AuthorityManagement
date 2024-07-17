package top.lldwb.authorityManagement.entity;

import lombok.Data;
import org.nf.db.util.Column;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
@Data
public class User {
    @Column("user_name")
    private String userName;
    @Column("password")
    private String password;
}
