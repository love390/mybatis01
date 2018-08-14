package cn.edu.jxufe.entity;

import java.io.Serializable;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-07-25 18:47:10
 * @Description gitee:www.gitee.com/cgggitee/
 */
public class GoodsInfo implements Serializable {
    private static final long serialVersionUID = -2042654917227850572L;
    private Integer goodsId;
    private String goodsName;
    private Integer goodsPrice;
    private Integer stock;

    public GoodsInfo() {
    }

    public GoodsInfo(Integer goodsId, String goodsName, Integer goodsPrice, Integer stock) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.stock = stock;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", stock=" + stock +
                '}';
    }
}
