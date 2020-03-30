package com.springbootlearning.market.service;

import com.springbootlearning.market.pojo.dto.ResponseDTO;
import com.springbootlearning.market.pojo.entity.Goods;

import java.util.Map;

/**
 * @author YHZ
 * @date 2020/3/24
 */
public interface IGoodsService {

    /**
     * 返回map类型的msg，进行消息提示
     * 插入一条goods
     * @param goods 接受一个goods对象
     * @return 受影响的行数
     */
    ResponseDTO add(Goods goods);

}
