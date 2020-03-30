package com.springbootlearning.market.pojo.entity;

import java.io.Serializable;

/**
 * order_info
 * @author 
 */
public class OrderInfo implements Serializable {
    private Integer orderInfoId;

    /**
     * 关联订单表的order_id
     */
    private String orderId;

    /**
     * 原来的商品连接
     */
    private Integer originGoodsId;

    /**
     * 下单时的价格
     */
    private Double price;

    /**
     * 下单时的数量
     */
    private Integer count;

    /**
     * 下单时的图片
     */
    private String img;

    /**
     * 下单时的原价
     */
    private Double oldPrice;

    private static final long serialVersionUID = 1L;

    public Integer getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(Integer orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOriginGoodsId() {
        return originGoodsId;
    }

    public void setOriginGoodsId(Integer originGoodsId) {
        this.originGoodsId = originGoodsId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderInfo other = (OrderInfo) that;
        return (this.getOrderInfoId() == null ? other.getOrderInfoId() == null : this.getOrderInfoId().equals(other.getOrderInfoId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOriginGoodsId() == null ? other.getOriginGoodsId() == null : this.getOriginGoodsId().equals(other.getOriginGoodsId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getOldPrice() == null ? other.getOldPrice() == null : this.getOldPrice().equals(other.getOldPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderInfoId() == null) ? 0 : getOrderInfoId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOriginGoodsId() == null) ? 0 : getOriginGoodsId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getOldPrice() == null) ? 0 : getOldPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderInfoId=").append(orderInfoId);
        sb.append(", orderId=").append(orderId);
        sb.append(", originGoodsId=").append(originGoodsId);
        sb.append(", price=").append(price);
        sb.append(", count=").append(count);
        sb.append(", img=").append(img);
        sb.append(", oldPrice=").append(oldPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}