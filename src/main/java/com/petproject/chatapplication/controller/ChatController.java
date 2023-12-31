package com.petproject.chatapplication.controller;

import com.petproject.chatapplication.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;


@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/message")
    @SendTo("/chatroom/public")
    public ChatMessage receivePublicMessage (@Payload ChatMessage chatMessage) {
        return chatMessage;
    }

    @MessageMapping("/private-message")
    public ChatMessage receivePrivateMessage (@Payload ChatMessage chatMessage) {
        messagingTemplate.convertAndSendToUser(chatMessage.getReceiverName(), "/private", chatMessage);
        return chatMessage;
    }

}
