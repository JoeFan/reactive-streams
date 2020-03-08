package com.sandbox;

import io.reactivex.functions.Consumer;


public class MessageConsumer implements Consumer<String> {

    final String type;

    public MessageConsumer(String type) {
        this.type = type;
    }

    @Override
    public void accept(String message) {
        // do something with the Data
        if (message.startsWith("Error:"))
            System.err.println("type=" + type + " message=" + message);
        else
            System.out.println("type=" + type + " message=" + message);
    }

}
