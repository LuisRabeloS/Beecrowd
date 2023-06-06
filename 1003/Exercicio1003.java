import java.util.Scanner;

public class Exercicio1003{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        int soma = a+b;
        System.out.print(soma);
    }
}