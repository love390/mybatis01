package cn.edu.jxufe.entity;

import java.io.Serializable;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-07-25 18:42:39
 * @Description gitee:www.gitee.com/cgggitee/
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 5937535596304633734L;
    public static int ROLE_NOMAL = 1;
    public static int ROLE_ADMIN = 0;
    private Integer uid;
    private String uname;
    private String password;
    private Integer roleid;
    private String createtime;
    private Integer score;

    private RoleInfo roleInfo;

    public UserInfo() {
    }

    public UserInfo(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    public UserInfo(Integer uid, String uname, String password, Integer roleid, String createtime, Integer score, RoleInfo roleInfo) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.roleid = roleid;
        this.createtime = createtime;
        this.score = score;
        this.roleInfo = roleInfo;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public RoleInfo getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }
}
