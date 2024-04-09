import java.util.Scanner;

public class SomaSimples{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int valorA = input.nextInt();
        int b = input.nextInt();
        input.close();
        int soma = valorA+b;
        System.out.print("SOMA = "+soma);
    }
}