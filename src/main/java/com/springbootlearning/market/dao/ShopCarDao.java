package com.springbootlearning.market.dao;

import com.springbootlearning.market.pojo.entity.ShopCar;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopCarDao {
    int deleteByPrimaryKey(Integer shopCarId);

    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    ShopCar selectByPrimaryKey(Integer shopCarId);

    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);
}