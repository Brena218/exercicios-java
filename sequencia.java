import java.util.Scanner;
public class sequencia {
    public static Scanner leia=new Scanner (System.in);
    public static void main (String args []) 
    { 
        int b;
        int ant= 0;

        System.out.print("qual posição da sequencia voçê quer mostrar: ");
        b=leia.nextInt ();
        
        int valord[] = new int[b];
        valord[0] = 1;
        for(int i= 0; i < b - 1; i++)
        {
            valord[i + 1] = valord[i] + ant;
            ant= valord[i];
 }
 for (int i :  valord) {
    System.out.println(i);
     }

        
      }
}    
