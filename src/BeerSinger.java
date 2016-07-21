/**
 * Sings 99 bottles of beer on the wall recursively
 */
public class BeerSinger {

    public int BeerSinger (int numberOfBottles) {

        while (numberOfBottles <= 99 && numberOfBottles >= 0){

            if (numberOfBottles != 1) {
                System.out.println(NumberText.toText(numberOfBottles) + " bottles of beer on the wall, " +
                        NumberText.toText(numberOfBottles) + " bottles of beer! Take one down, pass it around! " +
                        NumberText.toText(numberOfBottles) + " bottles of beer on the wall!");

            } else if (numberOfBottles == 1){
                System.out.println(NumberText.toText(numberOfBottles) + " bottle of beer on the wall, " +
                        NumberText.toText(numberOfBottles) + " bottle of beer! Take one down, pass it around! " +
                        NumberText.toText(numberOfBottles) + " bottle of beer on the wall!");
            }

            return BeerSinger(numberOfBottles - 1);
        }
        return numberOfBottles;
    }

}
