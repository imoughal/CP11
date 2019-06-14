import java.util.Scanner;

public class Craps {
   public static void main(String [] args){
     System.out.print("Let's Play Craps!");

     	int d1 = (int)(Math.random()* 6 +1);
     	int d2 = (int)(Math.random()* 6 +1);
     	int roll = d1+d2;

   	 if (roll == 7 || roll == 11){

    	System.out.println("You win!");
	
    	}
    	else if (roll == 2||roll == 3||roll ==12){

    	System.out.println("Sorry, you lose.");

    }

  	System.out.println("You rolled "+d1+" + "+d2+" = "+roll);

  }
}


