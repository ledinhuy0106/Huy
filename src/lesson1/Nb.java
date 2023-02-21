package lesson1;

public class Nb implements Bank {
    @Override
    public Object inTeRestRate(Double deposit) {
        double inTeRestRate;
        inTeRestRate=deposit*0.19;
        return inTeRestRate ;
    }
}
