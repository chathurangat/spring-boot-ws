package lk.zerocode.api;

import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

public class MyWebSocketHandler implements WebSocketHandler {
    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.out.println("transport error");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {

        String payload = (String) message.getPayload();

        System.out.println("== message " + payload);
        session.sendMessage(new TextMessage("Received: " + payload));
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {

    }
    //
//    @Override
//    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws IOException {
//// Handle incoming messages here
//        String receivedMessage = (String) message.getPayload();
//
//        System.out.println("===received "+receivedMessage);
//// Process the message and send a response if needed
//        session.sendMessage(new TextMessage("Received: " + receivedMessage));
//    }
//
//    @Override
//    public void afterConnectionEstablished(WebSocketSession session) {
//// Perform actions when a new WebSocket connection is established
//    }
//
//    @Override
//    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
//// Perform actions when a WebSocket connection is closed
//    }
}