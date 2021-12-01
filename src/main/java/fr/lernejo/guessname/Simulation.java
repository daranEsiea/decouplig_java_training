package fr.lernejo.guessname;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final HumanPlayer player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type
    private boolean player_success = true;

    public Simulation(Player player) {
        this.player = (HumanPlayer) player;
        this.initialize(this.numberToGuess);
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
                this.logger.log("Plus petit");
                //this.player.respond(true);
                return false;
            }else if(nb < this.numberToGuess){
                //this.player.respond(false);
                this.logger.log("Plus grand");
                return false;
            }
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while(player_success){
            this.nextRound();
        }
    }
}
