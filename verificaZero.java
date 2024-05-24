import java.util.Scanner;
public class verificaZero{
public static Scanner leia=new Scanner(System.in);
public static void main(String args []){
    int numero;
    System.out.print("digite o seu numero: ");
    numero=leia.nextInt();
if(numero>0){
    System.out.println("o numero e maior que 0.");
}else if(numero<0){
    System.out.println("o numero e menor que 0.");
}else{
    System.out.println("o numero e igual a 0.");
}
}
}






            
    