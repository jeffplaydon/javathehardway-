import java.util.Scanner;

public class BMICategories {
    public static void main( String[] args ) {
        Scanner keybaord = new Scanner(System.in);
        double bmi;

        System.out.print( "Enter your BMI: " );
        bmi = Keyboard.nextDouble();

        System.out.print( "BMI Category: " );
        if ( bmi < 15.0 ) {
            System.out.println( "very severely underweight" );
        }
        else if ( bmi <= 16.0 ) {
            System.out.println( "severely underweight" );
        }
        else if ( bmi < 18.5 ) {
            System.out.println( "underweight" );
        }
        else if ( bmi < 25.0 ) {
            System.out.println( "normal weight" );
        }
        else if ( bmi < 30.0 ) {
            System.out.println( "overweight" );
        }
        else if ( bmi < 35.0 ) {
            System.out.println( "moderately obese" );
        }
        else if ( bmi < 40.0) {
            System.out.println( "severely obese" );
        }
        else {
            System.out.println( "very severely/\"morbidly\" obese" );
        }
    }
}