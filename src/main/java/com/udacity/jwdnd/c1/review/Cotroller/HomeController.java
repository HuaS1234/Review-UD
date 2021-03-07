package com.udacity.jwdnd.c1.review.Cotroller;

import com.udacity.jwdnd.c1.review.ChatForm;
import com.udacity.jwdnd.c1.review.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHomePage(Model model) {
        model.addAttribute("welcomeMessage", "Hi Hello");
        return "home";
    }

}
