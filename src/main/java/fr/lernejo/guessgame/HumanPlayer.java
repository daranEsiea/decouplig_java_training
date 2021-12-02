package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{

    private Logger logger = LoggerFactory.getLogger("player");
    private Scanner sc = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        System.out.println("Entrer nombre");
        long value = sc.nextLong();

        return value;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            this.logger.log("Echoué; Plus petit");
        }else{
            this.logger.log("Echoué; Plus grand");
        }
    }
}
