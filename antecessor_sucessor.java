import java.util.Scanner;
 public class antecessor_sucessor{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int x;
        int a;
        int b;
    System.out.print("digite um numero: ");
    x=leia.nextInt ();
    a= x-1;
    b= x+1;
    System.out.println("o antecessor e: " +a);
    System.out.println("o sucessor e: " +b);
   
    }
 }    