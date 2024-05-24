import java.util.Scanner;
public class area_triangulo{
public static Scanner leia=new Scanner(System.in); 
public static void main(String args[]){
    float base;
    float altura;
    float area;
System.out.print("digite o valor da base: ");
base=leia.nextFloat();
System.out.print("digite o valor da altura: ");
altura=leia.nextFloat();
area=(base*altura)/2 ;
System.out.println("a area do triangulo e: "+area); 
  }
}


