package sindre;

import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {

    public Randomizer(){}

    public int randomNumber (int maxVal){
        return ThreadLocalRandom.current().nextInt(0, maxVal);
    }
}
