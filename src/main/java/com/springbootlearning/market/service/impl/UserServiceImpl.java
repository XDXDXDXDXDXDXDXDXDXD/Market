package com.springbootlearning.market.service.impl;

import com.springbootlearning.market.dao.UserDao;
import com.springbootlearning.market.pojo.entity.User;
import com.springbootlearning.market.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author YHZ
 * @date 2020/3/20
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    UserDao userDao;

    User uDb;

    @Override
    public boolean Login(User user) {

        uDb = userDao.selectByNickName(user.getNickName());
        if(uDb == null){
            return false;
        } else{
            if(uDb.getPassword() == null){
                return false;
            }else{
                return uDb.getPassword().equals(user.getPassword());
            }
        }
    }

    public User getuDb() {
        return uDb;
    }

}
