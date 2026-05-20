public class Bottle {
    // instance variables
    private double capacity;

    public Bottle(double maxCap) {
        capacity = maxCap;


    }

    public double updateAmount(double removed) {
        double currAmount = 0.0;
        currAmount = capacity - removed;
        if (currAmount == capacity*0.25) {
            currAmount = capacity;
        }

        return currAmount;



    }



}
