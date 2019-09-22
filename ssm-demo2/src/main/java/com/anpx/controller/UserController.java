package com.anpx.controller;

import com.anpx.dao.UserMapper;
import com.anpx.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/list")
    public String list(HttpServletRequest request){
        List<User> list = userMapper.findAll();
        request.setAttribute("aa",list.get(0).getName());
        return "index";
    }
}
