package com.seecen.controller;

import com.seecen.entity.Page;
import com.seecen.entity.User;
import com.seecen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by asus on 2018/2/26.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("list")
    public String list(Integer currentPage, User user, Model model){
        Page page=new Page();
        if(currentPage!=null){
            page.setCurrentPage(currentPage);
        }
        page=userService.findUserByPage(page,user);
        model.addAttribute("page",page);
        return "/user/list";

    }

}
