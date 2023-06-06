import java.util.Scanner;

public class Exercicio1004{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        input.close();
        int prod = numero1 * numero2;
        System.out.print(prod);
    }
}