package lesson1;

public class BIDV implements Bank {
    @Override
    public Object inTeRestRate(Double deposit) {
        double inTeRestRate;
        inTeRestRate=deposit*0.11;
        return inTeRestRate ;
    }
}
