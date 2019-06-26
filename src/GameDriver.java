import java.util.Scanner;



public class GameDriver {
    public static String Player1_name;
    static String Player2_name;



   public static void main(String[] args) {

       System.out.println("Please enter the name for player 1");
       Scanner input =new Scanner(System.in);
       Player1_name=input.nextLine();

       String name;
       name=Player1_name;
       while(name.length() < 5 || name.length() >20 ){

           System.out.println("Please enter the name for player 1");
           Player1_name=input.nextLine();
           name=Player1_name;

       }


       System.out.println("Please enter the name for player 2");

       name=Player2_name;
       while(name.length() < 5 || name.length() > 20 ){

           System.out.println("Please enter the name for player 1");
           Player1_name=input.nextLine();
           name=Player2_name;

           while(Player1_name==Player2_name){
           System.out.println("Please enter a different name for player two , players must have different names ");

           }

       }



       





   }













}
