package com.springbootlearning.market.controller.goodsType;

import com.springbootlearning.market.pojo.dto.ResponseDTO;
import com.springbootlearning.market.pojo.entity.Goods;
import com.springbootlearning.market.pojo.entity.GoodsType;
import com.springbootlearning.market.service.impl.GoodsTypeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author YHZ
 * @date 2020/3/27
 */
@Controller
@RequestMapping("/pages/back")
public class GoodTypeController {

    @Resource
    GoodsTypeServiceImpl goodsTypeService;

    @RequestMapping("/goodsType-add")
    public String toGoodsTypeAdd(Model model){

        model.addAttribute("type",goodsTypeService.selectTypeByParentTypeId(-1));
        return "/pages/back/goods/goodsType-add";
    }

    @RequestMapping("/goodsType")
    @ResponseBody
    ResponseDTO goodsTypeAdd(GoodsType record){

        return goodsTypeService.add(record);
    }
}
