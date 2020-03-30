package com.springbootlearning.market.pojo.entity;

import java.io.Serializable;

/**
 * goods_type
 * @author 
 */
public class GoodsType implements Serializable {
    /**
     * 商品类型
     */
    private Integer goodsTypeId;

    /**
     * 商品父类型id
     */
    private String parentTypeId;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 类型的序号，根据序号排序优先展示
     */
    private Integer sort;

    /**
     * 图标样式
     */
    private String iconClass;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
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
        GoodsType other = (GoodsType) that;
        return (this.getGoodsTypeId() == null ? other.getGoodsTypeId() == null : this.getGoodsTypeId().equals(other.getGoodsTypeId()))
            && (this.getParentTypeId() == null ? other.getParentTypeId() == null : this.getParentTypeId().equals(other.getParentTypeId()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getIconClass() == null ? other.getIconClass() == null : this.getIconClass().equals(other.getIconClass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsTypeId() == null) ? 0 : getGoodsTypeId().hashCode());
        result = prime * result + ((getParentTypeId() == null) ? 0 : getParentTypeId().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getIconClass() == null) ? 0 : getIconClass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsTypeId=").append(goodsTypeId);
        sb.append(", parentTypeId=").append(parentTypeId);
        sb.append(", typeName=").append(typeName);
        sb.append(", sort=").append(sort);
        sb.append(", iconClass=").append(iconClass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}