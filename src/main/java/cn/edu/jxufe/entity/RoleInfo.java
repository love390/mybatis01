package cn.edu.jxufe.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-01 10:09:03
 * @Description gitee:www.gitee.com/cgggitee/
 */
public class RoleInfo implements Serializable {
    private static final long serialVersionUID = 625571633545991306L;

    private Integer roleId;
    private String roleName;

    private List<UserInfo> list;

    public RoleInfo() {
        list=new ArrayList<UserInfo>();
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public List<UserInfo> getList() {
        return list;
    }

    public void setList(List<UserInfo> list) {
        this.list = list;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
