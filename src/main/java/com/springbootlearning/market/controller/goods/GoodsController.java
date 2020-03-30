package com.springbootlearning.market.controller.goods;

import com.springbootlearning.market.consts.GoodsConsts;
import com.springbootlearning.market.controller.BaseUploadController;
import com.springbootlearning.market.pojo.dto.ResponseDTO;
import com.springbootlearning.market.pojo.entity.Goods;
import com.springbootlearning.market.service.impl.GoodsServiceImpl;
import com.springbootlearning.market.service.impl.GoodsTypeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author YHZ
 * @date 2020/3/23
 */

@Controller
@RequestMapping("/pages/back")
public class GoodsController extends BaseUploadController {

    @Resource
    GoodsServiceImpl goodsService;

    @Resource
    GoodsTypeServiceImpl goodsTypeService;

    @RequestMapping("/goods-add")
    public String toGoodsAdd(Model model) {

        //存放顶级类型供前端显示
        model.addAttribute("topType",goodsTypeService.selectTypeByParentTypeId(-1));
        return "/pages/back/goods/goods-add";
    }

    /**
     * 处理Goods添加的ajax请求，用于添加Goods
     *
     * @param record ajax提交的form表单封装的Goods对象
     * @param pic    上传的图片
     * @return 回显信息
     */
    @PostMapping("/goods")
    @ResponseBody
    public ResponseDTO goodsAdd(Goods record, MultipartFile pic){

        String imgUrl = uploadFile("/upload/goods/", pic);  //上传图片后返回的虚拟路径字符串
        record.setImg(imgUrl);  //设置Goods的img属性为生成的虚拟路径字符串
        return goodsService.add(record);
    }

}
