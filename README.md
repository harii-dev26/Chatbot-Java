![Java](https://img.shields.io/badge/Java-11-orange?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-lightgrey)


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

##  Example Interaction

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




### Author
**Hariish Srinivasan**  
Built as part of ** Java Mini Projects for SDE-1 preparation**.  
Demonstrates clean OOP, modular design, and Maven build proficiency.  

 [GitHub: harii-dev26](https://github.com/harii-dev26)

