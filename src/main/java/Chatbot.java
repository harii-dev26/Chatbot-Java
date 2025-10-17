package com.hariish.chatbot;
import java.util.HashMap;
import java.util.Map;

public class Chatbot {

    private Map<String, String> responses;

    public Chatbot() {
        responses = new HashMap<>();
        responses.put("hello", "Hi there! How can I help you today?");
        responses.put("how are you", "I'm just a bunch of code, but I'm doing great!");
        responses.put("bye", "Goodbye! Have a great day ahead!");
        responses.put("your name", "I'm a simple Java chatbot created by Hariish Srinivasan.");
        responses.put("help", "You can ask me about my name, how I'm doing, or just say hello!");
    }

    public String getResponse(String input) {
        input = input.toLowerCase().trim();
        for (String keyword : responses.keySet()) {
            if (input.contains(keyword)) {
                return responses.get(keyword);
            }
        }
        return "I'm sorry, I don't understand that yet. Try asking something else!";
    }
}
