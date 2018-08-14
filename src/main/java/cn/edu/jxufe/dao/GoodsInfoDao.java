package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.GoodsInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/8/1-15:37
 * @Description
 */
public interface GoodsInfoDao {

    /**
     * 实现商品的分页查询
     * @param page
     * @param rowcount
     * @return
     */
    public List<GoodsInfo> findGoodsByPage(int page, int rowcount);

    /**
     * 根据传入的商品ID进行商品的查询。属性为空不查询。不为空则按照条件查询
     * @param goodsInfo
     * @return
     */
    public List<GoodsInfo> findGoodsByExample(GoodsInfo goodsInfo);

    /**
     * 根据商品的价格范围进行查询
     * @param minprice 最低价
     * @param maxprice 最高价
     * @return
     */
    public List<GoodsInfo> findGoodsByPrice(int minprice, int maxprice);

    /**
     * 通过商品ID 进行查询
     * @param goodsInfo
     * @return
     */
    public GoodsInfo findGoodsByGid(int goodsInfo);

    /**
     * 根据传入的一组商品ID查询
     * @param gid
     * @return
     */
    public int deleteGoodsByGids(@Param(value = "ids") Integer[] gid);

    /**
     * 添加商品信息
     * @param goodsInfo
     * @return
     */
    public int saveGoodsInfo(GoodsInfo goodsInfo);

}
/*
代码手中走~佛祖心中留！求永无BUG！
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
            \  .-\__  `-`  ___/-. /
          ___`. .'  /--.--\  `. . __
       ."" '<  `.___\_<|>_/___.'  >'"".
      | | :  `- \`.;`\ _ /`;.`/ - ` : | |
      \  \ `-.   \_ __\ /__ _/   .-` /  /
 ======`-.____`-.___\_____/___.-`____.-'======
 */
