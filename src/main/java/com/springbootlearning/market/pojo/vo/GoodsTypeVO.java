package com.springbootlearning.market.pojo.vo;

import com.springbootlearning.market.pojo.entity.GoodsType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * GoodsType的传输对象
 * 新增了子商品类型属性,便于分级处理
 * @author YHZ
 * @date 2020/3/28
 */
public class GoodsTypeVO extends GoodsType {
    /**
     * 子商品类型
     */
    @Getter
    @Setter
    List<GoodsTypeVO> children;
}
