import java.util.Scanner;
public class display
 {
  public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in); 
      System.out.println("Unscramble the word neplat");
      System.out.println("You have 3 guesses");
      int count=1;
      while(count<=3)
       {
        String word=sc.nextLine();
        word=word.toLowerCase();
        if((word).equals("planet"))
         {
          System.out.println("Correct");
          break;
         }   
        else
         {
          System.out.println("Try again");
         }
        count++;
        }
      if(count>3)
       {
        System.out.println("You have exhausted all your guesses");
        System.out.println("The correct answer is Planet");
       }
    }
  }

