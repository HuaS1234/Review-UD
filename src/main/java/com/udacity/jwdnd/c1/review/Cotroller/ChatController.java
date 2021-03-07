package com.udacity.jwdnd.c1.review.Cotroller;

import com.udacity.jwdnd.c1.review.ChatForm;
import com.udacity.jwdnd.c1.review.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {

    MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String getChatPage(@ModelAttribute("chatForm") ChatForm chatForm, Model model){
        model.addAttribute("chatMessages", this.messageService.getMessage());
        return "chat";
    }

    @PostMapping
    public String postChatPage(@ModelAttribute("chatForm") ChatForm chatForm, Model model){
        this.messageService.addMessage(chatForm);
        model.addAttribute("chatMessages", this.messageService.getMessage());
        return "chat";
    }
    @ModelAttribute("allMessageTypes")
    public String[] allMessageTypes() {
        return new String[] {"Say", "Shout", "Whisper"};
    }
}
