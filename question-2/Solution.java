public class Bottle {
    // instance variables
    private double capacity;
    private double currAmt;

    public Bottle(double maxCap) {
        capacity = maxCap;
        currAmt = maxCap;


    }

    public double updateAmount(double removed) {
        currAmt = currAmt - removed;
        
        if (currAmt < capacity*0.25) {
            currAmt = capacity;
        }

        return currAmt;



    }







}
