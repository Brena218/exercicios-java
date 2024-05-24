import java.util.Scanner;
public class verificaNum{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args []){
        int num1,num2;
    System.out.print("digite seu primeiro numero: ");
    num1=leia.nextInt ();
    System.out.print("digite seu segundo numero: ");
    num2=leia.nextInt ();
    if(num1>num2){
    System.out.println("o maior numero é:" + num1);
    }else if(num2>num1){
    System.out.println("o maior numero e: " + num2);
    }else{
    System.out.println("sao iguais");
      }
}
}



