package fr.lernejo.guessname;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{

    void HumanPLayer(){

        Logger logger = LoggerFactory.getLogger("player");
    }

    @Override
    public long askNextGuess() {
        System.out.println("Entrer nombre");
        Scanner sc = new Scanner(System.in);
        long value = sc.nextInt();

        return value;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            System.out.println("Plus petit");
        }else{
            System.out.println("Plus grand");
        }
    }
}
