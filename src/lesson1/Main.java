package lesson1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank nbBank = new Nb();
        Bank bBank = new BIDV();
        Bank vTinBank = new VTinBank();
        Bank vpBank = new VPBank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        double deposit= scanner.nextDouble();
       Double nb= (Double) nbBank.inTeRestRate(deposit);
        Double bBank1= (Double)  bBank.inTeRestRate(deposit);
        Double vTin= (Double)  vTinBank.inTeRestRate(deposit);
        Double vp= (Double) vpBank.inTeRestRate(deposit);
        System.out.println("Lãi xuất một năm của các ngân hàng là:");
        System.out.println("Ngân hàng bankinterest.BIDV: " +NumberFormat.getInstance().format(bBank1)+" VND");
        System.out.println("Ngân hàng VPBANK: "+NumberFormat.getInstance().format(vp)+" VND");
        System.out.println("Ngân hàng VTINBANK: "+NumberFormat.getInstance().format(vTin)+" VND");
        System.out.println("Ngân hàng NB: "+NumberFormat.getInstance().format(nb)+" VND");





    }
}
