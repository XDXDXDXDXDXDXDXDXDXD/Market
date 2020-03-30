package com.springbootlearning.market.config;

import com.springbootlearning.market.consts.GoodsConsts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 自定义的配置类
 * @author YHZ
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/pages/front/login1");
        registry.addViewController("/backHome").setViewName("/pages/back/backhome");
    }

    /**
     * 配置上传文件在项目中的虚拟路径映射到的磁盘真实路径
     * 上传文件后将虚拟路径存放至数据库，以后使用访问虚拟路径会映射到磁盘路径取出文件
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/image/**").addResourceLocations("classpath:/static/image/");
        Logger logger = LoggerFactory.getLogger(WebMvcConfigurer.class);    //获取日志对象
        String docPath = GoodsConsts.getConfigUploadPath();
        logger.info("图片上传路径为：" + docPath);  //记录日志
        registry.addResourceHandler("/upload/**").addResourceLocations(docPath);    //项目中的/upload/**路径都会指向磁盘真实路径

    }
}
