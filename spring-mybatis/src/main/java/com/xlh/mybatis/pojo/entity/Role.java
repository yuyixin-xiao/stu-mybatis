package com.xlh.mybatis.pojo.entity;

import java.util.List;

/**
 * 角色：包含多个权限
 */
public class Role {
    private Long id;
    private String name;

    //权限列表
    private List<Permission> permissionList;

    @Override
    public String toString() {
        permissionList.stream().forEach(System.out::println);
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }
}
