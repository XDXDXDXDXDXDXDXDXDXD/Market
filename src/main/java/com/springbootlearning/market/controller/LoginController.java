package com.springbootlearning.market.controller;

import com.springbootlearning.market.pojo.entity.User;
import com.springbootlearning.market.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 登录控制器
 * @author YHZ
 */
@Controller
@RequestMapping("/pages/front")
public class LoginController {

    @Resource
    UserServiceImpl userService;

    @RequestMapping("/login")
    public String login(User user, RedirectAttributes redirectAttributes, HttpSession session){

        boolean status = userService.Login(user);
        if(status){
            session.setAttribute("user",userService.getuDb());
            return "redirect:/backHome";
        }else{
            redirectAttributes.addFlashAttribute("errorMsg","用户名或密码错误,请重试!");
            return "redirect:/";
        }
    }

}
