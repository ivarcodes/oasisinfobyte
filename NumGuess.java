import java.util.Random;
import java.util.Scanner;

public class NumGuess {
  public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
    
   int input ;

   while (true) {
    System.out.println("MAIN MENU:");
    System.out.println("1. Start Game");
    System.out.println("2. Exit Game");
    System.out.println("3. Rules");
    System.out.println("4. Back");

    System.out.print("Enter your choice: ");
    input = sc.nextInt();

    switch (input) {
        case 1:
            System.out.println("GAME IS GOING TO START!!!");
            NumGame();
            
            break;
        case 2:
            System.out.println("EXITING GAME!!!");
            System.exit(0);
            break;
        case 3:
            System.out.println("GUESS THE NUMBER TO WIN!!");
            System.out.println("NUMBER MUST BE BETWEEN 1 & 3");
            System.out.println("DON'T ENTER INVALID NUMBERS");
            
            break;
        case 4:
            
            System.out.println("Going back to the main menu...");
            continue;
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}
 
}
public static void NumGame(){
    int count=0;
     int totalScore=0;

    boolean flag=true;
    while (flag) {

    Random ran =new Random();
    Scanner sc =new Scanner(System.in);
    System.out.println("Guess number number between 1 to 10");
    int human=sc.nextInt();
    int c=10;
    int comp = ran.nextInt(c);
   
    if(human == comp && human <c){
      System.out.println("You won!");
      count++;
      totalScore++;
      
    }
    else if(human<comp && human <c){
      System.out.println("Guess Higher!");
      count++;
    }
    else if(human>comp){
      System.out.println("Guess Lower!");
      count++;
    
  }
 if(count>5 ){
  flag = false;
  System.out.println("Limit exceeded...");
  System.out.println("Good Luck next time :)");
  System.out.println("Your total score is " +totalScore);
  System.out.println("No of tries :"+count);
 }
  
}
}
}
