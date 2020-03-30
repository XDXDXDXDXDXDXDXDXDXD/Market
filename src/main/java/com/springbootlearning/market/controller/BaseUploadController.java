package com.springbootlearning.market.controller;

import com.springbootlearning.market.consts.GoodsConsts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 用于上传文件的公共类
 * @author YHZ
 * @date 2020/3/27
 */
public class BaseUploadController {


    /**
     * 文件上传
     * @param uploadDir 以/upload开头，以/结尾
     * @param file 得到的上传文件
     * @return 在项目中访问文件的url
     */
    protected String uploadFile(String uploadDir, MultipartFile file){

        Logger logger = LoggerFactory.getLogger(BaseUploadController.class);

        String realPath = GoodsConsts.getUploadPath();  //从常量类获取存放文件的磁盘路径
        System.out.println(file.getContentType());
        String uploadPath = uploadDir + UUID.randomUUID() + "." + file.getContentType().split("/")[1];    //指定的上传路径（路径+随机存放名+.文件类型）
        File f = new File(realPath+uploadPath); //获取一个文件对象准备存放至本地磁盘
        if (!f.getParentFile().exists()){
            f.getParentFile().mkdirs();
        }
        try {
            if (!file.isEmpty()){
                if (file.getSize() > 0){    //有文件上传并且文件大小不为0，将其存入磁盘
                    file.transferTo(f); //正式将上传的文件存放至本地
                    logger.info("图片已保存至：" + realPath + uploadPath); //打印日志
                    return uploadPath;  //返回上传路径作为访问图片的url(在配置类中添加静态资源映射以访问：url-->磁盘)
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GoodsConsts.NO_UPLOAD_IMG;   //无文件或文件大小为0，返回项目中默认图片的路径
    }
}

