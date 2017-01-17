package com.smartcloud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/17.
 */
@Controller
@RequestMapping("/")
public class LoginController {
    @RequestMapping("/")
    public String welcome(){
        return "login";
    }
}
