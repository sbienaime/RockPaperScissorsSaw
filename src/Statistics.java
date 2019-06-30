public class Statistics {

    String player_name;
    private int Games_won;
    private int Games_lost;
    private int Games_tied;
    private int Rounds_won;
    private int Rounds_lost;
    private int Rounds_tied;



    public String setPlayerName(String name){
        this.player_name=name;
        return name;
    }



    public void showStatistics() {
        System.out.println(player_name+" won "+ Games_won+" games.");
        System.out.println(player_name+" won "+ Rounds_won+" rounds.");
        System.out.println(player_name+" lost "+ Games_lost+" games.");
        System.out.println(player_name+" lost "+ Rounds_lost+" rounds.");
        System.out.println(player_name+" tied "+ Games_tied+" games.");
        System.out.println(player_name+" tied "+ Rounds_tied+" rounds.");
        Menu.OpenMenu();
        return;
    }



    public void updateStatistics(String action ){
        //position 1: stores wins
        //position 2: stores losses
        //position 3: stores ties


        //wr: means won round

        if (action =="wg"){
            Games_won++;
        }
        else if (action =="lg"){
            Games_lost++;
        }
        else{  Games_tied++; }


        if (action =="wr"){


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