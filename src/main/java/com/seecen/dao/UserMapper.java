package com.seecen.dao;

import com.seecen.entity.Page;
import com.seecen.entity.User;
import com.seecen.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**
     * 分页查询
     */
    public List<User> findUserByPage(@Param("user") User user,@Param("page") Page page);
    /**
     * 统计数量
     */
    public int countUserByPage(User user);
}