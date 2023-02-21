package lesson1;

public class VTinBank implements Bank {
    @Override
    public Object inTeRestRate(Double deposit) {
        double inTeRestRate;
        inTeRestRate=deposit*0.12;
        return inTeRestRate ;
    }
}
