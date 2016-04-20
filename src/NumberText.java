public class NumberText {

    /**
     * The method that does all the work, prints words from numbers
     * @param number
     * @return null
     */

    public static String toText(int number) {

        //initializing

        String input = "";
        input = Integer.toString(number);
        String result = "";
        boolean million = false;
        boolean hundredThousand = false;
        boolean tenThousand = false;
        boolean thousand = false;
        boolean hundred = false;
        boolean ten = false;
        boolean one = false;

        if (number == 0) {

            return "zero";

        } else {

            //set boolean digit rules

            if (number >= 1000000) {

                million = true;

            }

            if (number >= 100000) {

                hundredThousand = true;

            }

            if (number >= 10000) {

                tenThousand = true;

            }

            if (number >= 1000) {

                thousand = true;

            }

            if (number >= 100) {

                hundred = true;

            }

            if (number >= 10) {

                ten = true;

            }

            if (number >= 1) {

                one = true;

            }

        }

        if (hundredThousand) {

            switch (Character.getNumericValue(input.charAt(input.length() - 6))) {

                case 1:
                    result +="one hundred ";
                    break;
                case 2:
                    result +="two hundred ";
                    break;
                case 3:
                    result +="three hundred ";
                    break;
                case 4:
                    result +="four hundred ";
                    break;
                case 5:
                    result +="five hundred ";
                    break;
                case 6:
                    result +="six hundred ";
                    break;
                case 7:
                    result +="seven hundred ";
                    break;
                case 8:
                    result +="eight hundred ";
                    break;
                case 9:
                    result +="nine hundred ";
                    break;
                default:
                    break;

            }

        }

        //print teens (for thousands)

        if (tenThousand && Character.getNumericValue(input.charAt(input.length() - 4)) >= 1 &&
                Character.getNumericValue(input.charAt(input.length() - 4)) <= 9 &&
                Character.getNumericValue(input.charAt(input.length() - 5)) == 1){

            switch (Character.getNumericValue(input.charAt(input.length() - 4))) {

                case 1:
                    result +="eleven thousand ";
                    break;

                case 2:
                    result +="twelve thousand ";
                    break;

                case 3:
                    result +="thirteen thousand ";
                    break;

                case 4:
                    result +="fourteen thousand ";
                    break;

                case 5:
                    result +="fifteen thousand ";
                    break;

                case 6:
                    result +="sixteen thousand ";
                    break;

                case 7:
                    result +="seventeen thousand ";
                    break;

                case 8:
                    result +="eighteen thousand ";
                    break;

                case 9:
                    result +="nineteen thousand ";
                    break;

            }

            tenThousand = false;
            thousand = false;
        }

        //print ten thousands digit

        if (tenThousand) {

            switch (Character.getNumericValue(input.charAt(input.length() - 5))) {

                case 1:
                    result +="ten ";
                    break;
                case 2:
                    result +="twenty ";
                    break;
                case 3:
                    result +="thirty ";
                    break;
                case 4:
                    result +="forty ";
                    break;
                case 5:
                    result +="fifty ";
                    break;
                case 6:
                    result +="sixty ";
                    break;
                case 7:
                    result +="seventy ";
                    break;
                case 8:
                    result +="eighty ";
                    break;
                case 9:
                    result +="ninety ";
                    break;
                default:
                    break;

            }

        }

        //print thousands digit

        if (thousand) {

            switch (Character.getNumericValue(input.charAt(input.length() - 4))) {

                case 1:
                    result +="one thousand ";
                    break;
                case 2:
                    result +="two thousand ";
                    break;
                case 3:
                    result +="three thousand ";
                    break;
                case 4:
                    result +="four thousand ";
                    break;
                case 5:
                    result +="five thousand ";
                    break;
                case 6:
                    result +="six thousand ";
                    break;
                case 7:
                    result +="seven thousand ";
                    break;
                case 8:
                    result +="eight thousand ";
                    break;
                case 9:
                    result +="nine thousand ";
                    break;
                default:
                    if ((Character.getNumericValue(input.charAt(input.length() - 4))) != 0) {
                        result +="thousand ";
                        break;
                    }

                    else {
                        break;
                    }
            }

        }

        if (hundred) {

            switch (Character.getNumericValue(input.charAt(input.length() - 3))) {

                case 1:
                    result +="one hundred ";
                    break;
                case 2:
                    result +="two hundred ";
                    break;
                case 3:
                    result +="three hundred ";
                    break;
                case 4:
                    result +="four hundred ";
                    break;
                case 5:
                    result +="five hundred ";
                    break;
                case 6:
                    result +="six hundred ";
                    break;
                case 7:
                    result +="seven hundred ";
                    break;
                case 8:
                    result +="eight hundred ";
                    break;
                case 9:
                    result +="nine hundred ";
                    break;
                default:
                    break;

            }

        }

        //print teens

        if (ten && Character.getNumericValue(input.charAt(input.length() - 1)) >= 1 &&
                Character.getNumericValue(input.charAt(input.length() - 1)) <= 9 &&
                Character.getNumericValue(input.charAt(input.length() - 2)) == 1) {

            switch (Character.getNumericValue(input.charAt(input.length() - 1))) {

                case 1:
                    result +="eleven";
                    one = false;
                    break;

                case 2:
                    result +="twelve";
                    one = false;
                    break;

                case 3:
                    result +="thirteen";
                    one = false;
                    break;

                case 4:
                    result +="fourteen";
                    one = false;
                    break;

                case 5:
                    result +="fifteen";
                    one = false;
                    break;

                case 6:
                    result +="sixteen";
                    one = false;
                    break;

                case 7:
                    result +="seventeen";
                    one = false;
                    break;

                case 8:
                    result +="eighteen";
                    one = false;
                    break;

                case 9:
                    result +="nineteen";
                    one = false;
                    break;

            }

            ten = false;
        }

        //print tens digit

        if (ten) {

            switch (Character.getNumericValue(input.charAt(input.length() - 2))) {

                case 1:
                    result +="ten";
                    one = false;
                    break;
                case 2:
                    result +="twenty ";
                    break;
                case 3:
                    result +="thirty ";
                    break;
                case 4:
                    result +="forty ";
                    break;
                case 5:
                    result +="fifty ";
                    break;
                case 6:
                    result +="sixty ";
                    break;
                case 7:
                    result +="seventy ";
                    break;
                case 8:
                    result +="eighty ";
                    break;
                case 9:
                    result +="ninety ";
                    break;
                default:
                    break;

            }
        }

        if (one) {

            switch (Character.getNumericValue(input.charAt(input.length() - 1))) {

                case 1:
                    result +="one";
                    break;

                case 2:
                    result +="two";
                    break;

                case 3:
                    result +="three";
                    break;

                case 4:
                    result +="four";
                    break;

                case 5:
                    result +="five";
                    break;

                case 6:
                    result +="six";
                    break;

                case 7:
                    result +="seven";
                    break;

                case 8:
                    result +="eight";
                    break;

                case 9:
                    result +="nine";
                    break;

            }

        }

        return result;
    }
}

