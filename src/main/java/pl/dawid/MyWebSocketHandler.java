package pl.dawid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.thymeleaf.expression.Strings;
import pl.dawid.service.RandomService;

import java.time.LocalTime;
import java.util.Arrays;

@Component
public class MyWebSocketHandler extends TextWebSocketHandler {

    @Autowired
    private RandomService randomService;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message)
            throws Exception {

        String clientMessage = message.getPayload();
        session.sendMessage(new TextMessage(randomService.generateRandomNumber()));
//        if (clientMessage.startsWith("Hello") || clientMessage.startsWith("Hi")) {
//            session.sendMessage(new TextMessage("Hello! What can i do for you?"));
//        } else {
//            session.sendMessage(
//                    new TextMessage("This is a simple hello world example of using Spring WebSocket."));
//        }
    }
}


