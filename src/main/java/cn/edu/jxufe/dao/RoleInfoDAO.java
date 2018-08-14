package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.RoleInfo;
import cn.edu.jxufe.entity.UserInfo;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-07-31 15:12:08
 * @Description gitee:www.gitee.com/cgggitee/
 */
public interface RoleInfoDAO {
    public List<RoleInfo> findAll();

    public RoleInfo findById();

}
