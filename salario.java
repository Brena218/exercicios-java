import java.util.Scanner;
public class salario{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args []){
        int qtdanos,horast,valorhora,salario;
        System.out.print("digite seu tempo de trabalho:");
        qtdanos=leia.nextInt();
        System.out.print("digite quantas horas voce trabalha:");
        horast=leia.nextInt();
        System.out.print("digite o quanto voce ganha por hora: ");
        valorhora=leia.nextInt();
        salario=(horast*valorhora);
    if(qtdanos<=1){
        System.out.println("o seu salario e:" +(1500+salario));
    }else if ((qtdanos>1)&&(qtdanos<3)){
        System.out.println("o seu salario e:" +(2000+salario));
    }else{
        System.out.println("o seu salario e:" +(3000+salario));
    }

    }
}    
