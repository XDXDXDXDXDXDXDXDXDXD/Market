package com.springbootlearning.market.consts;

/**
 * 上传文件时根据不同系统获取不同上传路径的常量类
 * @author YHZ
 * @date 2020/3/26
 */
public class GoodsConsts {

    //没有上传或上传大小为0使用此路径（项目中的路径，默认图片）
    public static final String NO_UPLOAD_IMG = "/images/logo2.png";

    //磁盘路径
    public static final String WINDOWS_UPLOAD_PATH = "G:\\";
    public static final String LINUX_UPLOAD_PATH = "/";

    //静态资源映射的资源路径
    public static final String WINDOWS_CONFIG_UPLOAD_PATH = "file:G:\\upload\\";
    public static final String LINUX_CONFIG_UPLOAD_PATH = "file:/upload/";


    /**
     * 获取上传文件路径
     * @return
     */
    public static String getUploadPath(){

        String realPath = GoodsConsts.LINUX_UPLOAD_PATH;
        String systemType = System.getProperty("os.name");  //获取系统的类别
        if(systemType.toLowerCase().contains("windows")){
            realPath = GoodsConsts.WINDOWS_UPLOAD_PATH;
        }
        return realPath;
    }

    public static String getConfigUploadPath(){

        String realPath = GoodsConsts.LINUX_CONFIG_UPLOAD_PATH;
        String systemType = System.getProperty("os.name");  //获取系统类别
        if (systemType.toLowerCase().contains("windows")){
            realPath = GoodsConsts.WINDOWS_CONFIG_UPLOAD_PATH;
        }
        return realPath;
    }
}
