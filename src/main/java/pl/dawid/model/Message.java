package pl.dawid.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    private String author;
    private String message;

    public Message(String author, String message) {
        this.author = author;
        this.message = message;
    }
}
