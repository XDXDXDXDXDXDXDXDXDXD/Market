package com.springbootlearning.market.dao;

import com.springbootlearning.market.pojo.entity.GoodsType;
import com.springbootlearning.market.pojo.vo.GoodsTypeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsTypeDao {
    int deleteByPrimaryKey(Integer goodsTypeId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer goodsTypeId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);

    List<GoodsTypeVO> selectTypeByParentTypeId(Integer pId);

    List<GoodsTypeVO> selectTypeByParentTypeIds(@Param("parents") List parents);
}