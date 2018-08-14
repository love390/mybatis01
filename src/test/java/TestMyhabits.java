import cn.edu.jxufe.DBTools;
import cn.edu.jxufe.dao.RoleInfoDAO;
import cn.edu.jxufe.entity.RoleInfo;
import cn.edu.jxufe.entity.UserInfo;
import cn.edu.jxufe.dao.UserInfoDAO;
import cn.edu.jxufe.utils.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-07-31 13:40:16
 * @Description gitee:www.gitee.com/cgggitee/
 */
public class TestMyhabits {

    private SqlSession session;
    private UserInfoDAO userInfoDAO;
    private RoleInfoDAO roleInfoDAO;

    @Before
    public void init() {
        session = new DBTools().getSession();
        userInfoDAO = session.getMapper(UserInfoDAO.class);
        roleInfoDAO=session.getMapper(RoleInfoDAO.class);
    }

    @After
    public void destroy() {
        session.commit();
        session.close();
    }

    @Test
    public void testDBConnect() {
        System.out.println(new DBTools().getSession());
    }

    @Test
    public void testUserInfoSelect() {
//        List list = session.selectList("cj4.userMapper.selectAll");
        List list = userInfoDAO.findAll();
        for (Object obj : list) System.out.println(obj+" "+((UserInfo)obj).getRoleInfo());
        list = userInfoDAO.findAllAssociation1();
        for (Object obj : list) System.out.println(obj+" "+((UserInfo)obj).getRoleInfo());
        list = userInfoDAO.findAllAssociation2();
        for (Object obj : list) System.out.println(obj+" "+((UserInfo)obj).getRoleInfo());
    }

    @Test
    public void testUserInfoUpdate() {
        UserInfo userInfo=new UserInfo();
        userInfo.setPassword("123456");
        userInfo.setUname("123456");
        userInfo.setUid(113);
        System.out.println(StringUtils.isNotNULL(userInfo.getScore()));
        int num = userInfoDAO.updateUser(userInfo);
        System.out.println("影响行数" + num);
    }

    @Test
    public void testStringUtils(){
        System.out.println(StringUtils.isNotNULL("    "));
    }

    @Test
    public void testRoleInfoSelect() {
        List list = roleInfoDAO.findAll();
        for (Object obj : list) System.out.println(obj+" "+((RoleInfo)obj).getList());
    }

    @Test
    public void testUserInfoInsert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUname(UUID.randomUUID().toString().substring(0, 10).replace("-", ""));
        userInfo.setPassword(UUID.randomUUID().toString().substring(0, 20).replace("-", ""));
        userInfo.setScore(new Random().nextInt(100));
//        int num = session.insert("cj4.userMapper.addUser", userInfo);
        int num = userInfoDAO.addUser(userInfo);
        System.out.println("影响行数" + num);
    }

    @Test
    public void testUserInfoDelete() {
        int num = userInfoDAO.deleteUser(17);
//        int num = session.delete("cj4.userMapper.deleteUser", 14);
        System.out.println("影响行数" + num);
    }
}
