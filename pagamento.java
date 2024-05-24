import java.util.Scanner;
public class pagamento{
public static Scanner leia=new Scanner(System.in);
public static void main(String args []){
    int codigo,qdcopias,valorrecebido;
System.out.print("digite qual é o seu codigo: ");
codigo=leia.nextInt();    
System.out.print("digite o quanto de copia voçê deseja tirar: ");
qdcopias=leia.nextInt();
System.out.print("quanto vai ser o valor recebido: ");
valorrecebido=leia.nextInt();

switch(codigo){
    case 10:
       System.out.println("o valor da compra é :" + (qdcopias*1.50));
       System.out.println("o valor do recebido :" + valorrecebido );
       if (valorrecebido-(qdcopias*1.50)<=0){
         System.out.println(" a quantidade recebida não é o suficiente para pagar");
         } else {
            System.out.println("o seu troco :" + (valorrecebido-(qdcopias*1.50)));
         }
       break;

    case 20:
       System.out.println("o valor da compra é :" + (qdcopias*0.80)); 
       System.out.println("o valor recebido :" + valorrecebido);
       if (valorrecebido-(qdcopias*0.80)<=0){
         System.out.println(" a quantidade recebida não é o suficiente para pagar");
         }else{
           System.out.println("o seu troco :" + (valorrecebido-(qdcopias*0.80)));
         }
       break;

    case 30:
       System.out.println("o valor da compra é :" + (qdcopias*0.60));
       System.out.println("o valor recebido :" + (valorrecebido));
       if (valorrecebido-(qdcopias*0.60)<=0){
         System.out.println(" a quantidade recebida não é o suficiente para pagar");
         }else{
           System.out.println("o seu troco :" + (valorrecebido-(qdcopias*0.60)));
         }
       break;

    case 40:
       System.out.println("o valor da compra é :" + (qdcopias*2.00));
       System.out.println("o valor recebido :" + valorrecebido);
       if (valorrecebido-(qdcopias*2.00)<=0){
         System.out.println(" a quantidade recebida não é o suficiente para pagar");
         }else{
           System.out.println("o seu troco :" + (valorrecebido-(qdcopias*2.00)));
         }
       break;
       
default:
    System.out.println("Esse código é inválido");       
  }
 } 
} 
   