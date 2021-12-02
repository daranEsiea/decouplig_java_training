package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {
        if(args[0].equals("-interactive")){
            HumanPlayer humanPlayer = new HumanPlayer();
            Simulation sim = new Simulation(humanPlayer);

            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextLong(1, 101); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE-1

            sim.initialize(randomNumber);
            sim.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }else if((args[0].equals("-auto")) && (args[1].matches("-?\\d+(\\.\\d+)?"))){ // si c'est numeric
            ComputerPlayer computerPlayer = new ComputerPlayer();
            Simulation sim = new Simulation(computerPlayer);
            sim.initialize(Long.parseLong(args[1]));
            sim.loopUntilPlayerSucceed(1000);
        }else{
            System.out.println("Deux façons de lancer le programme : ");
            System.out.println("-interactive");
            System.out.println("Ou");
            System.out.println("-auto 'nombre'");

        }

    }

}
