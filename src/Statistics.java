public class Statistics {

    String player_name;
    private int Games_won;
    private int Games_lost;
    private int Games_tied;
    private int Rounds_won;
    private int Rounds_lost;
    private int Rounds_tied;




    public void showStatistics() {

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