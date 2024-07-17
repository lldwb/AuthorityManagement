-- Role 表  
CREATE TABLE Role
(
    role_id       INT PRIMARY KEY comment '角色ID',
    role_level    INT comment '角色等级',
    role_describe VARCHAR(255) comment '角色描述'
) COMMENT ='角色信息';

-- Purview 表  
CREATE TABLE Purview
(
    purview_id       INT PRIMARY KEY comment '权限ID',
    purview_url      VARCHAR(255) comment '权限URL',
    purview_describe VARCHAR(255) comment '权限描述'
) COMMENT ='权限信息';

-- User 表  
CREATE TABLE User
(
    user_name VARCHAR(255) PRIMARY KEY comment '用户名',
    password  VARCHAR(255) comment '密码'
) COMMENT ='用户信息';  
