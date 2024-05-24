import java.util.Scanner;
public class conversao{
    public static Scanner leia=new Scanner (System.in);
    public static void main (String args []){
        double c,f;
        System.out.print("digite o valor em C°: ");
        c=leia.nextFloat();
        f=(c*1.8+32);
        System.out.println("convertido para °f é: "+ f);
    }
}