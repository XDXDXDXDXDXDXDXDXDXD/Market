package com.springbootlearning.market.dao;

import com.springbootlearning.market.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据昵称查询用户
     * @param nickName 查询参数
     * @return 数据库中的记录
     */
    User selectByNickName(String nickName);
}