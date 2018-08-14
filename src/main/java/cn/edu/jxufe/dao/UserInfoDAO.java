package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.UserInfo;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-07-31 15:12:08
 * @Description gitee:www.gitee.com/cgggitee/
 */
public interface UserInfoDAO {
    public List<UserInfo> findAll();
    public List<UserInfo> findAllAssociation1();
    public List<UserInfo> findAllAssociation2();
    public int deleteUser(int uid);
    public int addUser(UserInfo userInfo);
    public int updateUser(UserInfo userInfo);

}
