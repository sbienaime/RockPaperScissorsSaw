
import java.util.Scanner;
public class Game {
static Scanner input = new Scanner(System.in);







public void startGame(){

System.out.println("Choose your weapon by typing rock, paper, scissors, or saw into the console and pressing enter ");


return ;
}



    public  static void checkPlayerWep(Player player, String w){
        String p=player.getName();
        boolean notvalidated=true;

        while(notvalidated){

            switch(w) {
                case "rock":
                    player.setWeapon(w);
                    printWeapon( p,w );
                    notvalidated=false;
                    break;
                case "paper":
                    player.setWeapon(w);
                    printWeapon( p,w );
                    notvalidated=false;
                    break;
                case "scissors":
                    player.setWeapon(w);
                    printWeapon( p,w );
                    notvalidated=false;
                    break;
                case "saw":
                    player.setWeapon(w);
                    printWeapon( p,w );
                    notvalidated=false;
                    break;
                default:
                    System.out.println("Error: Check CPU random number generator");

            }
        }




    }


public  static void checkPlayerWep(Player player){
    String p=player.getName();
    System.out.println(p+" please chose your weapon");
    String w =input.nextLine();
    w.toLowerCase().replaceAll("\\s+", "");

    boolean notvalidated=true;

    while(notvalidated){

    switch(w) {
        case "rock":
            player.setWeapon(w);
            printWeapon( p,w );
            notvalidated=false;
            break;
        case "paper":
            player.setWeapon(w);
            printWeapon( p,w );
            notvalidated=false;
            break;
        case "scissors":
            player.setWeapon(w);
            printWeapon( p,w );
            notvalidated=false;
            break;
        case "saw":
            player.setWeapon(w);
            printWeapon( p,w );
            notvalidated=false;
            break;
        default:
            System.out.println("Please make a valid weapon selection. Try again.");
            w =input.nextLine();
            w.toLowerCase().replaceAll("\\s+", "");
            }
}
}


public static  void printWeapon(String name,String wep ){

System.out.println(name+" selected "+wep);


}


public String  checkWinner(Player cpu, Player player, int p_number ) {

    String cpu_wep = cpu.getWeapon();
    String player_wep = player.getWeapon();
    String player_name = player.getName();
    String cpuName = player.getName();
    if (cpu_wep.contentEquals("rock")) {
        if (!player_wep.contentEquals("paper") && !player_wep.contentEquals("rock")) {

            System.out.println(player_name + " lost.");
            GameDriver.getPlayer(p_number).stats.updateStatistics("lr");

        } else if (player_wep.contentEquals("paper")) {

            System.out.println(player_name + " won.");
            GameDriver.getPlayer(p_number).stats.updateStatistics("wr");

        }
    }

    //
    if (cpu_wep.contentEquals(player_wep)) {

        System.out.println(player_name + " is tied with CPU");
        GameDriver.getPlayer(p_number).stats.updateStatistics("tr");
    }


    if (cpu_wep == "paper") {

        if (!player_wep.contentEquals("rock") && !player_wep.contentEquals("paper")) {


            System.out.println(player_name + " won.");
            GameDriver.getPlayer(p_number).stats.updateStatistics("wr");


        } else if (player_wep.contentEquals("rock")) {


            System.out.println(player_name + " lost.");
            GameDriver.getPlayer(p_number).stats.updateStatistics("lr");

        }
    }

    if (cpu_wep.contentEquals("scissors")) {


        if (player_wep.contentEquals("rock") || player_wep.contentEquals("saw")) {


            System.out.println(player_name + " won.");
            GameDriver.getPlayer(p_number).stats.updateStatistics("wr");

        } else if (player_name.contentEquals("paper")) {
            System.out.println(player_name + " lost.");
            GameDriver.getPlayer(p_number).stats.updateStatistics("lr");
        }

    }


 if(cpu_wep.contentEquals("saw")) {

     if (player_wep.contentEquals("rock")) {


         System.out.println(player_name + " won.");
         GameDriver.getPlayer(p_number).stats.updateStatistics("wr");

     } else if (player_wep.contentEquals("paper") || player_wep.contentEquals("scissors")) {

         System.out.println(player_name + " lost.");
         GameDriver.getPlayer(p_number).stats.updateStatistics("lr");


     }


 }


return cpu_wep;
}

public void checkGameWinner(Player p1,Player p2){


    if(p1.stats.getWinsForCurentGame()> p2.stats.getWinsForCurentGame()){
        p1.stats.updateStatistics("wg");
        p2.stats.updateStatistics("lg");


    }
    else if (p1.stats.getWinsForCurentGame()< p2.stats.getWinsForCurentGame()){

        p1.stats.updateStatistics("lg");
        p2.stats.updateStatistics("wg"); }
    else{

        p1.stats.updateStatistics("tg");
        p2.stats.updateStatistics("tg"); }

    p1.stats.updateStatistics("rg");
    p2.stats.updateStatistics("rg");
    Menu.OpenMenu();
}


}