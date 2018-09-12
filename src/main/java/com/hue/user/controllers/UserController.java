package com.hue.user.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//hue.pt
@Controller
public class UserController {

    @GetMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

}
