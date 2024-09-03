import java.util.Scanner;
import java.util.Random;
public class Chatbot {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    // Define possible responses
    String[] greetings = {"Hello there!", "Hi!", "Greetings!"};
    String[] farewells = {"Goodbye!", "See you later!", "Have a great day!"};
    String[] defaultResponses = {"Interesting...", "Tell me more!", "I see."};
    // Main chatbot loop
    while (true) {
      System.out.print("You: ");
      String userInput = scanner.nextLine();
      // Check for greeting
      if (userInput.toLowerCase().contains("hello") || userInput.toLowerCase().contains("hi")) {
        System.out.println("Chatbot: " + greetings[random.nextInt(greetings.length)]);
      } 
      // Check for farewell
      else if (userInput.toLowerCase().contains("bye") || userInput.toLowerCase().contains("goodbye")) {
        System.out.println("Chatbot: " + farewells[random.nextInt(farewells.length)]);
        break;
      } 
      // Default response
      else {
        System.out.println("Chatbot: " + defaultResponses[random.nextInt(defaultResponses.length)]);
      }
    }
    scanner.close();
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    );
    int numero = sc.nextInt();
  }

  
}