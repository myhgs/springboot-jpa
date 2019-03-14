package com.test.jpa.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kiseokhong on 2019. 3. 10..
 */
@RestController
@AllArgsConstructor
public class LoginController {

    @RequestMapping("/test")
    public String test(){
        return "aaa";
    }

}
