package com.springbootlearning.market.service;

import com.springbootlearning.market.pojo.entity.User;

/**
 * @author YHZ
 * @date 2020/3/20
 */
public interface IUserService {

    /**
     * 登录验证
     * @param user 接受到的user对象
     * @return true验证成功，false验证失败
     */
    boolean Login(User user);

}
