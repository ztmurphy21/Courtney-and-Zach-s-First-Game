
package courtney.and.zachs.game;
//needed import to collect user input
import java.util.Scanner;


/**
 *
 * @author Courtney and Zach 
 */
public class CourtneyAndZachsGame {


    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int code;
       System.out.println("If you want to play Simon Says enter the number 10.");
       code = keyboard.nextInt();
       
        switch(code){
            
            case 10:
                System.out.println("Welcome to Simon says, pay attention carefully." 
                        + "If you do the task, enter the number 1 if you don't do "
                        + "enter the number 2.");
                System.out.println("Simon says spin in a circle and sing as loud as you can "
                        + "at the top of your lungs.");
                int one = keyboard.nextInt();
                if (one == 1){
                    System.out.println("Simion says skip on one foot and tell everyone around you "
                            + "that you love pink ponys.");
                }else{
                    System.out.println("You lost Simion Says :(");
                }
                     int two = keyboard.nextInt();
                    if (two ==1){
                        System.out.println("Say the alphabet backwards while chewing on marshmellows.");
                        int three = keyboard.nextInt();
                        if(three == 2){
                            System.out.println("Good job you won!");
                        }else{
                            System.out.println("You lost Simion says.");
                        }
                    }
                else{
                    System.out.println("You lost Simion Says :(");
                }
                   
                
        
    break;
            case 20:
                System.out.println("Welcome to guess a word");
                String hangmanWord = "caribbean";
                System.out.println("What vacation place am I thinking about?");
                String guessOne = keyboard.nextLine();
                if (guessOne == hangmanWord){
                    System.out.println("Congrajulations you guessed the word!");
                    
                }else{
                   System.out.println("Sorry you didn't guess right this time, think of a beach area south of the USA.");
                   String guessTwo = keyboard.nextLine();
                   if(guessTwo ==hangmanWord){
                       System.out.println("You got it!");
                       else{
                               System.out.println("Nope you got one more short, it starts with a C.");
                               
                               }
                   }
                   
                }
                
                
        }
    }
    
}
