package com.petproject.chatapplication.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChatMessage {
    private String message;
    private String receiverName;
    private String senderName;
    private MessageType type;
}
