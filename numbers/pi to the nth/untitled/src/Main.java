import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        int length;

        System.out.println("How many numbers of pi after the decimal point do you want to see? : ");
        try{
            length = scanner.nextInt();
            String format = ("%."+length+"f\n");
            System.out.println(String.format(format, pi));
        }
        catch (Exception a){
            System.out.println("Error, did you input a positive integer for the input?");
        }








        // if(!(scanner.hasNextInt())){
       //        System.out.println("Input is not an integer");
       // }
       // else if (scanner.hasNextInt()) {
       //     System.out.println("Input is an integer");
       //     length = scanner.nextInt();
       //     System.out.println(length);
       // }


    }
}