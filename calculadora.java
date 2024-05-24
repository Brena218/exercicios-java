import java.util.Scanner;
public class calculadora{
public static Scanner leia=new Scanner (System.in);
public static void main (String args []){
    int valor1,valor2;
    String operação;
System.out.print("digite o seu primeiro valor: ");
valor1=leia.nextInt();
System.out.print("digite o seu segundo valor: ");
valor2=leia.nextInt();
System.out.print("digite a sua operação desejada: ");
operação=leia.next();
 
   switch(operação){
case ("soma"):
   System.out.println(valor1+valor2);
   break;
case ("subtração"):
   System.out.println(valor1-valor2);
   break; 
case ("mutiplicação"):
   System.out.println(valor1*valor2);
   break;
case ("divisão"):
   System.out.println(valor1/valor2);
   break;

default:
    System.out.println("essa opereção é invalida.");
    }
  }
}