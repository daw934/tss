package pl.dawid.webSocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import pl.dawid.service.RandomService;

@Component
public class MyWebSocketHandler extends TextWebSocketHandler {

    @Autowired
    private RandomService randomService;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        session.sendMessage(new TextMessage(randomService.generateRandomNumber()));
    }
}


