import java.util.Scanner;
public class media4notas{
    public static Scanner leia=new Scanner (System.in);
    public static void main (String args []){
        float nota1,nota2,nota3,nota4,media;
    System.out.print("primeira nota: ");
    nota1= leia.nextFloat();
    System.out.print("segunda nota: ");
    nota2= leia.nextFloat();
    System.out.print("terceira nota: " );
    nota3= leia.nextFloat();
    System.out.print("quarta nota: ");
    nota4= leia.nextFloat();

    media=((nota1+nota2+nota3+nota4)/4);
    System.out.println("sua media é: "+ media);
   
    }
}