import java.util.Scanner;

    public class SpaceBoxing {

        public static void main( String[] args ) {

            Scanner keyboard = new Scanner(System.in);

            int planet;
            double weight;

            System.out.print( "Please enter your current earth weight: " );
            weight = keyboard.nextInt();

            System.out.println();
            System.out.println( "I have information for the following planets:" );
            System.out.println( "\t 1. Venus\t 2. Mars\t 3. Jupiter" );
            System.out.println( "\t 4. Saturn\t 5. Uranus\t 6. Neptune" );

            System.out.println();
            System.out.println( "Which planet are you visiting?" );
            planet = keyboard.nextInt();
            System.out.println();

            if ( planet == 1 ) {
                weight = weight*0.78;
                System.out.println( "Your weight would be " + weight + " pounds on that planet." );
            }
            else if ( planet == 2 ) {
                weight = weight*0.39;
                System.out.println( "Your weight would be " + weight + " pounds on that planet." );
            }
            else if ( planet == 3 ) {
                weight = weight*2.65;
                System.out.println( "Your weight would be " + weight + " pounds on that planet." );
            }
            else if ( planet == 4 ) {
                weight = weight*1.17;
                System.out.println( "Your weight would be " + weight + " pounds on that planet." );
            }
            else if ( planet == 5 ) {
                weight = weight*1.05;
                System.out.println( "Your weight would be " + weight + " pounds on that planet." );
            }
            else if ( planet == 6 ) {
                weight = weight*1.23;
                System.out.println( "Your weight would be " + weight + " pounds on that planet." );
            }
            else {
                System.out.println( "error" );
            }

        }
    }
