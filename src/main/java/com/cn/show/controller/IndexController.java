package com.cn.show.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
      @RequestMapping(value="/index")
      public String  getIndex(){
    	  return "index";
      }
      
      @RequestMapping(value="/about")
      public String  getAbout(){
    	  return "about";
      }
      
      @RequestMapping(value="/contact")
      public String  getContact(){
    	  return "contact";
      }
      
      @RequestMapping(value="/services")
      public String  getServices(){
    	  return "services";
      }
      
      @RequestMapping(value="/myResume")
      public String  getMyResume(){
    	  return "myResume";
      }
}
