package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@RequestMapping("/test")
//@org.springframework.stereotype.Controller
@RestController
public class Controller1 {
    @RequestMapping(value = "/some.do" ,method= RequestMethod.POST)
    public ModelAndView doSome(HttpServletRequest request, HttpServletResponse response,String name,Integer age){
    ModelAndView mv = new ModelAndView();
    mv.addObject("msg","springMVC测试");
    mv.addObject("name",name);
    mv.addObject("age",Integer.valueOf(age));
    mv.setViewName("/show");
    return mv;
    }

}
