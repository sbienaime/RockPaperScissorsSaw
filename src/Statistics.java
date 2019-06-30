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
//#
    public static  void CheckGameWinner(Player p1,  Player p2){

        if (p1.stats.Rounds_won_currentGame==p2.stats.Rounds_won_currentGame){


            p1.stats.updateStatistics("tg");
            p2.stats.updateStatistics("tg");

        }

        if (p1.stats.Rounds_won_currentGame> p2.stats.Rounds_won_currentGame )
        {


            p1.stats.updateStatistics("wg");
            p2.stats.updateStatistics("lg");
        }
        else if (p1.stats.Rounds_won_currentGame<p2.stats.Rounds_won_currentGame){


            p1.stats.updateStatistics("lg");
            p2.stats.updateStatistics("wg");

        }

        p1.stats.updateStatistics("rg");

    }

    public void showStatistics(boolean callmenu) {
        System.out.println("------------ "+player_name+"Statistics---------------");
        System.out.println(player_name+" won "+ Games_won+" games.");
        System.out.println(player_name+" won "+ Rounds_won+" rounds.");
        System.out.println(player_name+" lost "+ Games_lost+" games.");
        System.out.println(player_name+" lost "+ Rounds_lost+" rounds.");
        System.out.println(player_name+" tied "+ Games_tied+" games.");
        System.out.println(player_name+" tied "+ Rounds_tied+" rounds.");

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
        else if(action=="td") {  Games_tied++; }


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