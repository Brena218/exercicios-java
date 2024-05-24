import java.util.Scanner;
public class diaSemana{
public static Scanner leia=new Scanner(System.in);
public static void main(String args []){
    int numero;
   System.out.print("digite um valor de 1 a 7 : ");
   numero=leia.nextInt();

    switch(numero){
  case 1: 
     System.out.println("o dia da semana é domingo.");
     break;
  case 2:
     System.out.println("o dia da semana é segunda feira.");
     break;
  case 3:
     System.out.println("o dia da semana é terça feira. ");
     break;
  case 4:
     System.out.println("o dia da semana é quarta feira.");
     break;
  case 5:
     System.out.println("o dia da semana é quinta feira.");
     break;
  case 6:
     System.out.println("o dia da semana é sexta feira.");
     break;
  case 7:
     System.out.println("o dia da semana é sabado.");
     break;
  default:
     System.out.println("não é correspondente a um dia da semana.");   
     }
  }
}    
                  


     
