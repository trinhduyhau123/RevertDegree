import java.text.DecimalFormat;
import java.util.Scanner;

public class Revert {
    public static double RevertFtoC(double celsius) {
        double f = (5.0 / 9) * (celsius * 32);
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Nhập dộ C: ");
        Scanner scanner = new Scanner(System.in);
        double cDegree = scanner.nextDouble();
        double fDegree= RevertFtoC(cDegree);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println(numberFormat.format(cDegree)  + "la " + numberFormat.format(fDegree) +" do F");
    }
}
