package com.seecen.service;

import com.seecen.entity.Page;
import com.seecen.entity.User;

/**
 * Created by asus on 2018/2/26.
 */
public interface UserService {
    public Page findUserByPage(Page page,User user);
}
