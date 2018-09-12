package com.hue.user.controllers;

import com.hue.user.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

//hue.pt
@Controller
public class UserController {

    @GetMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @GetMapping(value = "/login")
   public ModelAndView login(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        mav.addObject("user", new UserDTO());
        return mav;
    }

    @PostMapping(value = "/login-process")
    public ModelAndView loginProcess(UserDTO userDTO, HttpSession session){
        System.out.println(userDTO);
        session.setAttribute("user", userDTO);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/");
        return mav;
    }



}
