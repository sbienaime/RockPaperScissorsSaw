
import java.util.Scanner;
public class Game {
static Scanner input = new Scanner(System.in);







public void startGame(){

System.out.println("Choose your weapon by typing Rock, Paper, Scissors, or Saw into the console and pressing enter ");


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
    w.toLowerCase().replace("\\s+", "");

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
            System.out.println("Please make a valid menu selection. Try again.");
            w =input.nextLine();
            w.toLowerCase().replace("\\s+", "");
            }
}
}


public static  void printWeapon(String name,String wep ){

System.out.println(name+" selected "+wep);


}


public void  checkWinner(Player cpu, Player player, int p_number ){

   String cpu_wep = cpu.getWeapon();
   String player_wep= player.getWeapon();
   String player_name=player.getName();
   String cpuName =player.getName();
if (cpu_wep=="rock"){
    if (player_wep != "paper"){

       System.out.println(player_name+" lost.");
       GameDriver.getPlayer(p_number).stats.updateStatistics("lr");

    }

}









}












}