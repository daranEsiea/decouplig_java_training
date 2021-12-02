package fr.lernejo.guessname;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{

    Logger logger = LoggerFactory.getLogger("player");
    Scanner sc = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        System.out.println("Entrer nombre");
        long value = sc.nextLong();

        return value;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            this.logger.log("Plus petit");
        }else{
            this.logger.log("Plus grand");
        }
    }
}
