import java.util.Scanner;


public class Menu {
    static Scanner input = new Scanner(System.in);
    static Statistics stats= new Statistics();


    public static int OpenMenu() {
        System.out.println("1. Play game"+"\n"+ "2. Show game rules"+"\n"+ "3. Show statistics"+"\n"+ "4. Exit");
        int choice = input.nextInt();
        GetSelection(choice);
        return choice;
    }




    public static int GetSelection(int component){


        switch(component) {
            case 1:
                GameDriver.StartComponent(component);
               return 1;

            case 2:
                GameDriver.StartComponent(component);
                return 2;
            case 3:
                GameDriver.StartComponent(component);
                return 3;
            case 4:
                GameDriver.StartComponent(component);
                return 4;
            default:
                System.out.println("Please make a valid menu selection. Thank you");
                component=GetSelection(OpenMenu());

        }






     return component ;
    }

    public static void exitGame(){
        System.out.println("Good Bye");
        return;
    }


}
