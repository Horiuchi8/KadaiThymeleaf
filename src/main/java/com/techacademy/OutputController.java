package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam(name="previous", required= false) String val, Model model) {
        //フォームから送られてきた値をModelに登録
        model.addAttribute("previous", val);

        //output.htmlに画面遷移
        return "output";
        }
}
