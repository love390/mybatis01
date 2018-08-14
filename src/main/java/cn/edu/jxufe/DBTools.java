package cn.edu.jxufe;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-07-31 10:50:30
 * @Description gitee:www.gitee.com/cgggitee/
 */
public class DBTools {

    private static SqlSessionFactory factory;

    static {
        Reader read = null;
        try {
            read = Resources.getResourceAsReader("config.xml");
            factory = new SqlSessionFactoryBuilder().build(read);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SqlSession getSession() {
        SqlSession sess = factory.openSession();
        return sess;
    }

    public void closeSession(SqlSession session) {
        session.close();
    }

    public static void main(String[] args) throws IOException {

    }
}
