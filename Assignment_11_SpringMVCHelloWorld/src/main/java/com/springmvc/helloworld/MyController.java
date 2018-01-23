package com.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView getHelloPage()
    {
        //Map<String,String> m = new HashMap<String, String>();
        String str = "Hello World from spring mvc using maven!!!";
        //m.put("message",str);
        return new ModelAndView("helloworld","message",str);
    }
}