# Chatbot Java

A simple **Java-based console chatbot** built using core Java and Maven.  
It demonstrates natural user input handling, keyword-based response mapping, and modular design following OOP principles.

---

## Features

- Console-based interactive chatbot  
- Handles greetings, farewells, and small talk  
- Graceful fallback for unknown inputs  
- Modular structure (`Chatbot.java` + `Main.java`)  
- Maven-based build and execution  

---

## Run the App

```bash
mvn clean compile exec:java



You: Hello
Bot: Hi there! How can I help you today?
You: bye
Bot: Goodbye! Have a great day!


##  Project Structure

Chatbot-Java/
 ├── pom.xml
 ├── README.md
 └── src/
     └── main/
         └── java/
             └── com/
                 └── hariish/
                     └── chatbot/
                         ├── Chatbot.java
                         └── Main.java



##  Tech Stack 


| Layer      | Technology        |
| :--------- | :---------------- |
| Language   | Java 11           |
| Build Tool | Maven             |
| Execution  | exec-maven-plugin |
| Paradigm   | OOP, Console I/O  |


Example Interaction


Welcome to Hariish's Java Chatbot! Type 'bye' to exit.
You: Hi
Bot: I'm sorry, I don't understand that yet. Try asking something else!
You: bye
Bot: Goodbye! Have a great day!


Author

Hariish Srinivasan
Built as part of Java mini projects for SDE-1 Role.
Demonstrates clean code, OOP principles, and Maven build proficiency.
