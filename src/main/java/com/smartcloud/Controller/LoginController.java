package com.smartcloud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/1/17.
 */
@RestController
@RequestMapping(value ="/")
public class LoginController {
    @RequestMapping("/")
    public String welcome(){
        return "login";
    }
}
