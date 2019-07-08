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

        getPlayerName();

            newMenu.OpenMenu();


        //P1.stats.updateStatistics("wr");


    }


public static void getPlayerName(){



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






}
public static void StartComponent(String component_Number){


    switch( component_Number ) {
        case "1":


            for(int i=0; i<3;i++) {
               int Round =i+1;
                System.out.println("----------- Round "+Round+" ---------------");
                newGame.startGame();
                newGame.checkPlayerWep(P1);
                newGame.checkPlayerWep(P2);
                Game.checkPlayerWep(cpu, cpu.CpuMove());
                newGame.checkWinner(cpu, P1, 1);
                newGame.checkWinner(cpu, P2, 2);
            }
            newGame.checkGameWinner(P1,P2);

            break;
        case "2":
            showRules();
            break;
        case "3":
            Statistics.viewStatistics(P1 ,P2);
            break;
        case "4":
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




    public static Player getPlayer(int player_number)

    {
        if(player_number==1) {

            return P1;
        }
        else{

            return P2;
        }

    }


    public static  void showRules(){

        System.out.println("Winner of the round will be determined as follow:");
        System.out.println("Rock breaks scissors and Saw therefore rock wins over scissors and saw. Rock loses against paper");
        System.out.println("Scissors cut paper therefore scissors win over paper. Scissors lose against rock and Saw" );
        System.out.println("Paper covers rock therefore paper wins over rock. Paper loses against scissors and saw");
        System.out.println("Saw cuts through scissors and paper therefore saw wins over scissors and paper. Saw loses against rock.");
        System.out.println("If player and computer make the same selection, there is a tie.");
        System.out.println("Winner of the game against the computer is one who won more rounds (must account for ties)");
        System.out.println("Overall human winner is based on the greater number of won games against the computer and least games lost (must account for tie between human players");

        Menu.OpenMenu();

        return;
    }





















}














