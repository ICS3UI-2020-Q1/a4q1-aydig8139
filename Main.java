import java.util.Scanner;

/**
 * counts down by 5 until the users number
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for an integer
    System.out.println("Please enter an integer to count down to");
    int usersNum = input.nextInt();
    System.out.println("Count Down:");

    //create a variable to count down from
    int count = 100;
    
    //create a while loop
    while(usersNum <= count){
      System.out.println(count);
      count = count - 5;
    } 
    }
    
      }
    
    
    
    
  

