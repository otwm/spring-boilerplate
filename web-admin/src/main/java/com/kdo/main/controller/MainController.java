package com.kdo.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kdo on 16. 7. 29.
 */
@Controller
public class MainController {

    /**
     * 메인 콘트롤러
     *
     * @return
     */
    @RequestMapping(value = {"/", ""})
    String home() {
        System.out.print("123");
        return "site.homepage";
    }
}
