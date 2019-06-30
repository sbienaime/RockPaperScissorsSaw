import java.util.Random;

public class CPU extends Player {


Random CpuWepGenerator = new Random();


public CPU(String name){

   this.setName(name);



}
public String CpuMove(){

    int wep_number =CpuWepGenerator.nextInt(4)+1;

    switch(wep_number) {
        case 1:
            this.setWeapon("rock");
            return "rock";

        case 2:
            this.setWeapon("paper");
            return "paper";
        case 3:
            this.setWeapon("scissors");
            return "scissors";
        case 4:
            this.setWeapon( "scissors");
            return "saw";
        default:
            System.out.println("Error: Please check CPU random number Generator");
            return "Error: Please check CPU random number Generator";
    }


}





}
