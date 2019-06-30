public class Rules {





public void showRules(){



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
