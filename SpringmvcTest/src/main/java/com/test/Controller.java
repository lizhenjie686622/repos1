package com.test;


import com.alibaba.fastjson.JSON;
import com.entity.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@RequestMapping("/test")
//@org.springframework.stereotype.Controller
@RestController
public class Controller {
    @RequestMapping(value = "/some.do" ,method= RequestMethod.POST)
    public ModelAndView doSome(HttpServletRequest request, HttpServletResponse response,String name,Integer age){
    ModelAndView mv = new ModelAndView();
    mv.addObject("msg","springMVC测试");
    mv.addObject("name",name);
    mv.addObject("age",Integer.valueOf(age));
    mv.setViewName("/show.html");
    return mv;
    }
    //手动解决乱码, produces = "application/json;charset=utf-8"
    @RequestMapping(value = "/json.do")
//    @ResponseBody
    //加上这个注解不走视图解析，直接返回一个字符串
    public String json() throws JsonProcessingException {
        //创建一个对象
        Student student = new Student("zs",34);
//jacson:ObjectMapper
        ObjectMapper mapper  = new ObjectMapper();
        String stu = mapper.writeValueAsString(student);
        return stu;
    }
    //手动解决乱码, produces = "application/json;charset=utf-8"
    @RequestMapping(value = "/json1.do")
//    @ResponseBody
    //加上这个注解不走视图解析，直接返回一个字符串
    public String json1() throws JsonProcessingException {

     //jacson:ObjectMapper
        ObjectMapper mapper  = new ObjectMapper();
        List<Student> list = new ArrayList<>();
         //创建多个对象
        Student student1 = new Student("zs",34);
         Student student2 = new Student("zs",34);
          Student student3 = new Student("zs",34);
       list.add(student1);
        list.add(student3);
         list.add(student2);
        return mapper.writeValueAsString(list);
    }
    @RequestMapping(value = "/json2.do")
    public String json2() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }
    @RequestMapping(value = "/json3.do")
//    @ResponseBody
    //加上这个注解不走视图解析，直接返回一个字符串
    public List<Student> json3() throws JsonProcessingException {
     //jacson:ObjectMapper
        ObjectMapper mapper  = new ObjectMapper();
        List<Student> list = new ArrayList<>();
         //创建多个对象
        Student student1 = new Student("zs",34);
         Student student2 = new Student("ls",34);
          Student student3 = new Student("ww",34);
       list.add(student1);
        list.add(student3);
         list.add(student2);
         String b=mapper.writeValueAsString(list);
        return list;
    }
    @RequestMapping(value = "/json4.do")
//    @ResponseBody
    //加上这个注解不走视图解析，直接返回一个字符串
    public String json4() throws JsonProcessingException {

        List<Student> list = new ArrayList<>();
         //创建多个对象
        Student student1 = new Student("zs",34);
         Student student2 = new Student("ls",34);
          Student student3 = new Student("ww",34);
       list.add(student1);
        list.add(student3);
         list.add(student2);

        return JsonUtils.getJson(list);
    }
     @RequestMapping(value = "/json5.do")

    public String json5() throws JsonProcessingException {
         List<Student> list = new ArrayList<>();
         Student student1 = new Student("zsq",23);
          Student student2 = new Student("lsq",23);
           Student student3 = new Student("wwq",23);
         list.add(student1);
         list.add(student2);
         list.add(student3);

         String str = JSON.toJSONString(list);
         return str;
     }
}
