package fr.lernejo.guessname;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type
    private boolean player_success = true;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long nb = this.player.askNextGuess();

        if(nb == this.numberToGuess){
            this.logger.log("Trouvé");
            player_success = false;
            return true;
        }else{
            if(nb > this.numberToGuess){
                this.player.respond(true);
                return false;
            }else if(nb < this.numberToGuess){
                this.player.respond(false);
                return false;
            }
        }
        this.logger.log("Perdu");
        return false;
    }

    public void loopUntilPlayerSucceed(long nb_iter) {
        int essai = 0;
        boolean found = false;
        long time_1 = System.currentTimeMillis();
        while(essai < nb_iter){
            found = this.nextRound();
            if(found){
                break;
            }else{
                essai++;
            }

        }
        if(!found){
            this.logger.log("Perdu ! Le nombre était : " + numberToGuess);
        }

        long time_2 = System.currentTimeMillis();

        this.logger.log("Temps passé : " + (time_2-time_1) + " ms");

    }
}
