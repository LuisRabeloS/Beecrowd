import java.util.Scanner;

public class Media{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();
        double media = a*0.2 + b*0.3 + c*0.5;
        System.out.printf("MEDIA = %.1f%n", media);
    }
}