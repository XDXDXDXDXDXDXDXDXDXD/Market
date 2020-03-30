package com.springbootlearning.market.controller;

import com.springbootlearning.market.dao.GoodsTypeDao;
import com.springbootlearning.market.dao.UserDao;
import com.springbootlearning.market.pojo.vo.GoodsTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {

    @Resource
    GoodsTypeDao goodsTypeDao;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        List<GoodsTypeVO> p = goodsTypeDao.selectTypeByParentTypeId(-1);
        return goodsTypeDao.selectTypeByParentTypeIds(p).toString();
    }
}
