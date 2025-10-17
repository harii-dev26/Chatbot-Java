package com.hariish.chatbot;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chatbot bot = new Chatbot();

        System.out.println("Welcome to Hariish's Java Chatbot! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("bye")) {
                System.out.println("Bot: " + bot.getResponse(input));
                break;
            }
            System.out.println("Bot: " + bot.getResponse(input));
        }

        scanner.close();
    }
}
