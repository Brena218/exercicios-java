import java.util.Scanner;
 public class maiorNumero{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args []){
        int primeiro,segundo,terceira,maior;
        primeiro=4;
        segundo=5;
        terceira=6;
    if(primeiro >= segundo){
        if(primeiro >= terceira){
            maior=primeiro;
        }else{    
            maior=terceira;        
        }
    } 
    else{
        if(segundo >= terceira){
            maior=segundo;
        }
        else{
            maior=terceira;
        }
    }
    System.out.println("o maior numero e: " +maior);
    }
 } 
  