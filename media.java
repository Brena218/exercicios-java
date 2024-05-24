import java.util.Scanner;
 public class media{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args []){
        int nota1;
        int nota2;
        int nota3;
        int media;
    System.out.print("digite a primeira nota: ");
    nota1=leia.nextInt ();
    System.out.print("digite a segunda nota: ");
    nota2=leia.nextInt ();
    System.out.print("digite a terceira nota: ");
    nota3=leia.nextInt ();
    media=(nota1*2+nota2*3+nota3*5)/10; 
    System.out.println("a media final do aluno e: " +media);
    }
 }  
