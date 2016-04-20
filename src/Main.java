import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init

        int number = 0;
        String spokenNumber = "";
        String bottles = "bottles";

        //run Speaker method

        Scanner bartender = new Scanner(System.in);

        System.out.println("How many bottles of beer on the wall?");

        //the number given to Scanner in words

        spokenNumber = bartender.nextLine();

        //the number given to Scanner in digits

        number = Integer.parseInt(spokenNumber);

        int countNumber = number;

        //object that uses NumberText method

        NumberText translator = new NumberText();

        for (int i = 0; i <= number; ++i, --countNumber) {

            //Main string

            String beerNumber = "";
            String beerNumberOneLess = "";

            beerNumber = translator.toText(countNumber);
            beerNumberOneLess = translator.toText(countNumber - 1);

            if (countNumber == 0) {

                break;

            }

            if (countNumber == 1) {

                bottles = "bottle";

                System.out.println(beerNumber + " " + bottles + " of beer on the wall, " +
                    beerNumber + " " + bottles + " of beer! Take one down, pass it around! " +
                    "no more bottles of beer on the wall!");

            } else if (countNumber == 2){

                System.out.print(beerNumber + " " + bottles + " of beer on the wall, " +
                        beerNumber + " " + bottles + " of beer! Take one down, pass it around! ");

                bottles = "bottle";

                System.out.println(beerNumberOneLess + " " + bottles + " of beer on the wall!");

            } else {

                System.out.println(beerNumber + " " + bottles + " of beer on the wall, " +
                    beerNumber + " " + bottles + " of beer! Take one down, pass it around! " +
                    beerNumberOneLess + " " + bottles + " of beer on the wall!");

            }

        }
    }

}
