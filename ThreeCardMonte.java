   import java.util.Scanner;
    import java.util.Random;

    public class Monte {

        public static void main( String[] args ) {

            Scanner keyboard = new Scanner(System.in);
            Random r = new Random();

            int door = 1 + r.nextInt(3);

            System.out.println( "You are on a gameshow." );
            System.out.println( "You have to guess which of three doors has a car behind it." );
            System.out.println( "If you guess right, you get the car." );
            System.out.println();
            System.out.println( "Which door is it?" );
            System.out.println();
            System.out.println( "-------  -------  -------" );
            System.out.println( "|     |  |     |  |     |" );
            System.out.println( "|     |  |     |  |     |" );
            System.out.println( "|  1  |  |  2  |  |  3  |" );
            System.out.println( "|     |  |     |  |     |" );
            System.out.println( "|     |  |     |  |     |" );
            System.out.println( "-------  -------  -------" );
            System.out.println();
            System.out.print( "> " );
            int choice = keyboard.nextInt();
            System.out.println();

            if ( choice == door ) {
                System.out.println( "We have a winner!" );
            }

            else if ( choice > door ) {
                System.out.println( "Mwahaha the car is all mine! You get nothing!" );
            }

            else if ( choice < door ) {
                System.out.println( "Mwahaha the car is all mine! You get nothing!" );
            }

            else {
                System.out.println( "You suck at this game." );
            }


            System.out.println();

            if ( door == 1 ) {
                System.out.println( "-------  -------  -------" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "| car |  |  2  |  |  3  |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "-------  -------  -------" );
            }

            else if ( door == 2 ) {
                System.out.println( "-------  -------  -------" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|  1  |  | car |  |  3  |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "-------  -------  -------" );
            }

            else if ( door == 3 ) {
                System.out.println( "-------  -------  -------" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|  1  |  |  2  |  | car |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "-------  -------  -------" );
            }
        }
    }