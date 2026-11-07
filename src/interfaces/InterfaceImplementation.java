package interfaces;

/**
Q5. Create an interface named Logger with a default method log(String msg) that prints a log message in the format:
LOG: <message>

Implement this interface in a class ApplicationLogger and demonstrate calling the default log() method.

Requirements
Define an interface Logger with a default method log(String msg).
The default method should print:
LOG: <message>

Create a class ApplicationLogger that implements Logger.
In the main method, create an ApplicationLogger object and call log() with a sample message.
*/


import java.util.*;

public class InterfaceImplementation {
    public static void main(String[] args) {
        String msg = IO.readln();
        ApplicationLogger application = new ApplicationLogger();
        application.log(msg);
        
    }
}

interface Logger{
    default void log(String msg){
        if(msg.isBlank() || msg == null){
            IO.println("Message Cant be empty or null.");
            System.exit(0);
        }
        IO.println("LOG: "+msg);
    }
}

class ApplicationLogger implements Logger {

}
