import java.util.Scanner;
public class Mes{
public static Scanner leia=new Scanner(System.in);
public static void main (String args []){
     int numero;
   System.out.print("digite um valor de 1 a 12 : ");
   numero=leia.nextInt();

    switch(numero){
  case 1: 
     System.out.println("o mês correspondente é janeiro.");
     break;
  case 2:
     System.out.println("o mês correspondente é fevereiro.");
     break;
  case 3:
     System.out.println("o mês correspondente é março. ");
     break;
  case 4:
     System.out.println("o mês correspondente é abril.");
     break;
  case 5:
     System.out.println("o mês correspondente é maio.");
     break;
  case 6:
     System.out.println("o mês correspondente é junho.");
     break;
  case 7:
     System.out.println("o mês correspondente é julio.");
     break;
  case 8:
     System.out.println("o mês correspondente é agosto.");
     break; 
  case 9:
     System.out.println("o mês correspondente é setembro.");
     break;
  case 10:
     System.out.println("o mês correspondente é outubro.");
     break;
  case 11:
     System.out.println("o mês correspondente é novembro.");
     break;
  case 12:
     System.out.println("o mês correspondente é dezembro."); 
     break;

  default:
     System.out.println("não é correspondente ao mês.");   
     } 
}
}     