import java.util.Scanner;



public class GameDriver {
    static String Player1_name;
    static String Player2_name;
    static String name;
    static Scanner input = new Scanner(System.in);
    static String W = "";
    static Player P1= new Player();
    static Player P2= new Player();
    private static  Menu newMenu = new Menu();
    private static Game newGame =new Game();
    private static CPU cpu = new CPU("CPU");
    public static void main(String[] args) {

        System.out.println("Please enter the name for player 1");
        Player1_name = input.nextLine();
        Player1_name = Player1_name.replaceAll("\\s+", "");
        P1.setName(Player1_name);
        name = Player1_name;
        while (name.length() < 5 || name.length() > 20) {

            System.out.println("Name must be between 5 and 20 characters, please try again");
            Player1_name = input.nextLine();
            Player1_name = Player1_name.replaceAll("\\s+", "");
            P1.setName(Player1_name);
            name = Player1_name;

        }


        System.out.println("Please enter the name for player 2");
        Player2_name = input.nextLine();
        Player2_name = Player2_name.replaceAll("\\s+", "");
        P2.setName(Player2_name);


        while (Player2_name.length() < 5 || Player2_name.length() > 20 || Player1_name.contentEquals(Player2_name)) {
            String err = "";
            if (Player1_name.contentEquals(Player2_name)) {
                err = "Please enter a different name , player 1 and player 2 cannot have the same name";
            }
            if (Player2_name.length() < 5 || Player2_name.length() > 20) {
                err = "Your name must be between 5 and 20 characters, please try again. Thank You.  ";
            }

            System.out.println(err);
            Player2_name = input.nextLine();
            Player2_name = Player2_name.replaceAll("\\s+", "");
            P2.setName(Player2_name);

        }


        newMenu.OpenMenu();





    }



public static void StartComponent(int component_Number){


    switch( component_Number ) {
        case 1:
            newGame.startGame();
            newGame.checkPlayerWep(P1);
            newGame.checkPlayerWep(P2);
            Game.checkPlayerWep(cpu,cpu.CpuMove());
            break;
        case 2:
            Rules rules = new Rules();
            rules.showRules();
            break;
        case 3:
            Statistics stats =new Statistics();
            stats.showStatistics();
            break;
        case 4:
            exitGame();
            break;
        default:
            System.out.println("Please make a valid menu selection. Thank you");

    }


}


    public static void exitGame(){
        System.out.println("Good Bye");
        return;
    }



}














