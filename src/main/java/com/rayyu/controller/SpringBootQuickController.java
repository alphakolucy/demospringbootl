package com.rayyu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Alphonso
 * 该类必须放在启动类同包或者下级包中才能生效
 */
@Controller
public class SpringBootQuickController {
    @RequestMapping("/quickOne")
    @ResponseBody
    public String  quickOne(){
        return  "快速启动成功";
    }
}
