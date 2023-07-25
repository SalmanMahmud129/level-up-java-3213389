package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

  public void playGame() {
    // TODO: Implement method
    int points = 10;
    boolean keepPlaying = true;

    Scanner input = new Scanner(System.in);
    System.out.println("Would you like to double your points?");
    String response = input.nextLine();
    
    while(keepPlaying){
      if (response.equalsIgnoreCase("yes")) {
        Random rd = new Random();
        if (rd.nextBoolean()) {
          points = points * 2;
          System.out.println(points);
          System.out.println("YOU WIN");
          
          System.out.println("Keep Playing?");
          String playAgain = input.nextLine();


          if(playAgain.equalsIgnoreCase("yes")){
            keepPlaying = true;
          }else{
            System.out.println("GG. You left with " + points + " points" );
            keepPlaying = false;
            
          }

        } else {
          points = 0;
          System.out.println("Tough luck");
          keepPlaying = false;
        }
      } 
    }
    

  }
}