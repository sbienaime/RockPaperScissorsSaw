public class Statistics {

    String player_name;
    private int Games_won;
    private int Games_lost;
    private int Games_tied;
    private int Rounds_won;
    private int Rounds_lost;
    private int Rounds_tied;
    private int Rounds_won_currentGame;



    public int getWinsForCurentGame(){


        return Rounds_won_currentGame;
    }
    public String setPlayerName(String name){
        this.player_name=name;
        return name;
    }

    public static void viewStatistics (Player p1, Player p2 ){

        p1.stats.showStatistics(false);
        p2.stats.showStatistics(true);


    }
    public void showStatistics(boolean callmenu) {
        System.out.println("------------- "+player_name+"'s Statistics---------------");
        System.out.println(player_name+" won "+ Games_won+" game(s).");
        System.out.println(player_name+" won "+ Rounds_won+" round(s).");
        System.out.println(player_name+" lost "+ Games_lost+" game(s).");
        System.out.println(player_name+" lost "+ Rounds_lost+" round(s).");
        System.out.println(player_name+" tied "+ Games_tied+" game(s).");
        System.out.println(player_name+" tied "+ Rounds_tied+" round(s).");

        if (callmenu) {
            Menu.OpenMenu();
        }
        return;
    }



    public void updateStatistics(String action ){
        //position 1: stores wins
        //position 2: stores losses
        //position 3: stores ties


        //wr: means won round


        if (action=="rg"){Rounds_won_currentGame=0;}

        if (action =="wg"){
            Games_won++;
        }
        else if (action =="lg"){
            Games_lost++;
        }
        else if(action=="tg") {  Games_tied++; }


        if (action =="wr"){

         Rounds_won_currentGame++;
         Rounds_won++;

         }

        else if (action =="lr"){


            Rounds_lost++;

        }


        if (action =="tr"){


            Rounds_tied++;

        }


        return;
    }

}