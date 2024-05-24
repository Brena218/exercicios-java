import java.util.Scanner;
public class crescenteOuDecrescente{
public static Scanner leia=new Scanner(System.in);
public static void main (String args []){
    int qtdNum, listagem;
    System.out.print ("Digite a quantitade de repetições:");
    qtdNum=leia.nextInt ();
    System.out.print ("Digite 1 para crescente ou 2 para decrescente:");
    listagem=leia.nextInt ();
    switch(listagem){
        case 1:
    for (int x = 0; x <= qtdNum; x++){
        System.out.println (x);
    }
    break;

        case 2:

    for (int x = 0; qtdNum >=x; qtdNum--){
        System.out.println (qtdNum);
    }
    break;
        
    default:
        System.out.println("essa opção é inexistente");     
        }
    }
}