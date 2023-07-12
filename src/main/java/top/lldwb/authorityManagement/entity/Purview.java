package top.lldwb.authorityManagement.entity;

import lombok.Data;
import org.nf.db.util.Column;

@Data
public class Purview {
    @Column("purview_id")
    private Integer purviewId;
    @Column("purview_url")
    private String purviewUrl;
    @Column("purview_describe")
    private String purviewDescribe;
}
