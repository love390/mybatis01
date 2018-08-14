import cn.edu.jxufe.DBTools;
import cn.edu.jxufe.dao.GoodsInfoDao;
import cn.edu.jxufe.entity.GoodsInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-07-31 13:40:16
 * @Description gitee:www.gitee.com/cgggitee/
 */
public class TestGoodsInfoDao {

    private SqlSession session;
    private GoodsInfoDao goodsInfoDao;

    @Before
    public void init() {
        session = new DBTools().getSession();
        goodsInfoDao=session.getMapper(GoodsInfoDao.class);
    }

    @After
    public void destroy() {
        session.commit();
        session.close();
    }

    @Test
    public void test1(){
        List list=goodsInfoDao.findGoodsByPage(0,4);
        for(Object obj:list) System.out.println(obj);
    }

    @Test
    public void test2(){
        GoodsInfo goodsInfo=new GoodsInfo();
        goodsInfo.setGoodsName("test");
        goodsInfo.setGoodsPrice(780);
        goodsInfo.setStock(10);
        System.out.println(goodsInfoDao.saveGoodsInfo(goodsInfo));
    }

    @Test
    public void test3(){
        Integer[] obj=new Integer[]{16,17};
        System.out.println(goodsInfoDao.deleteGoodsByGids(obj));
    }

    @Test
    public void test4(){
        System.out.println(goodsInfoDao.findGoodsByGid(1));
    }

    @Test
    public void test5(){
        for(Object obj:goodsInfoDao.findGoodsByPrice(50,100))
        System.out.println(obj);
    }

    @Test
    public void test6(){
        GoodsInfo goodsInfo=new GoodsInfo();
        goodsInfo.setGoodsId(1);
        for(Object obj:goodsInfoDao.findGoodsByExample(goodsInfo))
            System.out.println(obj);
    }
}
