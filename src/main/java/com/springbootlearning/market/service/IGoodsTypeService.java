package com.springbootlearning.market.service;

import com.springbootlearning.market.pojo.dto.ResponseDTO;
import com.springbootlearning.market.pojo.entity.GoodsType;
import com.springbootlearning.market.pojo.vo.GoodsTypeVO;

import java.util.List;

/**
 * @author YHZ
 * @date 2020/3/27
 */
public interface IGoodsTypeService {
    /**
     * 添加商品类型，返回msg作为回显信息
     * @param record 接受到的一个GoodsType对象
     * @return ajax回显信息
     */
    ResponseDTO add(GoodsType record);


    List<GoodsTypeVO> selectTypeByParentTypeId(Integer pId);
}
