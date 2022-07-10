import java.util.Scanner;
public class HiporenusBulma {
    public static void main(String[] args) {
        double a, b, c;
        Scanner veri = new Scanner(System.in);
        System.out.println("1.Dik Kenarınızı Giriniz: ");
        a = veri.nextDouble();
        System.out.println("2.Dik Kenarını Giriniz: ");
        b = veri.nextDouble();
        c = Math.pow(a , 2) + Math.pow(b , 2);
        System.out.println("Hipotenüs Uzunluuğunuz: " + Math.pow(c , 1.0/2.0));

    }
}
