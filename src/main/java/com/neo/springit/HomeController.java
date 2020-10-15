package com.neo.springit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author neo
 * @date 2020-10-14 15:37
 */

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello Spring";
    }
}
