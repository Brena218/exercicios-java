import java.util.Scanner;
 public class verifica10{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args []){
      int numero;
   System.out.print("digite um numero: ");
   numero=leia.nextInt ();
   if (numero>10) {
       System.out.println("numero maior que 10 ");
   }else{
       System.out.println("o numero não e maior que 10 ");

   }
    }
 }



        
  