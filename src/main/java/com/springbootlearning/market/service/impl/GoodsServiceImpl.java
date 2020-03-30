package com.springbootlearning.market.service.impl;

import com.springbootlearning.market.dao.GoodsDao;
import com.springbootlearning.market.pojo.dto.ResponseDTO;
import com.springbootlearning.market.pojo.entity.Goods;
import com.springbootlearning.market.service.IGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author YHZ
 * @date 2020/3/24
 */
@Service
public class GoodsServiceImpl implements IGoodsService {

    @Resource
    GoodsDao goodsDao;

    @Override
    public ResponseDTO add(Goods goods) {

        int i = goodsDao.insertSelective(goods);
        if (i == 1){
            return ResponseDTO.successWithoutData("添加商品成功");
        } else{
            return ResponseDTO.failWithoutData("添加商品失败");
        }
    }
}
