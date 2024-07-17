-- Role 表
CREATE TABLE Role
(
    id         INT PRIMARY KEY comment '角色ID',
    level      INT comment '角色等级',
    `describe` VARCHAR(255) comment '角色描述'
) COMMENT ='角色信息';

-- Purview 表
CREATE TABLE Purview
(
    id         INT PRIMARY KEY comment '权限ID',
    url        VARCHAR(255) comment '权限URL',
    `describe` VARCHAR(255) comment '权限描述'
) COMMENT ='权限信息';

-- User 表
CREATE TABLE User
(
    id       INT PRIMARY KEY comment '用户ID',
    name     VARCHAR(255) comment '用户名',
    password VARCHAR(255) comment '密码'
) COMMENT ='用户信息';
