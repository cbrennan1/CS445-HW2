//Colin Brennan Improved Random 
package main.java;
//Import Random
import java.util.Random;

public class ImprovedRandom extends Random {

    //Random class constructor that takes in a long value
    public ImprovedRandom(long seed){
        super(seed);
    }

    //Default Constructor
    public ImprovedRandom() {
        super();
    }

    // Random does not have a method that will generate a random integer between two specified integers (until now see below)
    public int randomIntInsideBounds(int lowerBound, int upperBound) {
        int range = upperBound - lowerBound + 1;
        return (int) (super.nextDouble() * range) + lowerBound;
    }
}
