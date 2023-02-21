package lesson1;

public class VPBank implements Bank {
    @Override
    public Object inTeRestRate(Double deposit) {
        double inTeRestRate;
        inTeRestRate=deposit*0.9;
        return inTeRestRate ;
    }
}
