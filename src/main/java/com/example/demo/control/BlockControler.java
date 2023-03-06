package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BlockControler {
    @GetMapping("/block")
    public String bclockMain(Model model){
        return"block-main";

    }
}
