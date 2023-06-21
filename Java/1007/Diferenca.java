import java.util.Scanner;

public class Diferenca{
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        input.close();
        int diferença = (a*b - c*d);
        System.out.println("DIFERENCA = "+diferença);
    }
}