package online.codevault.utilities;

public class NumberToText {

    public static String convert(int i) {

        StringBuilder text = new StringBuilder();

        if (i > 999_999_999) {
            throw new RuntimeException("Value for conversion is too large!");
        }

        int million = i / 1_000_000;

        if (million > 0) {
            text.append(" ").append(convertSimpleIntegerToText(million) + " million");
            i -= million * 1_000_000;
        }

        int thousand = i / 1_000;

        if (thousand > 0) {
            text.append(" ").append(convertSimpleIntegerToText(thousand) + " thousand");
            i -= thousand * 1_000;
        }

        if (i > 0) {
            text.append(" ").append(convertSimpleIntegerToText(i));
        }

        return text.toString().trim();

    }

    public static String convertSimpleIntegerToText(int i) {

        StringBuilder text = new StringBuilder();

        if (i > 999) {
            throw new RuntimeException("Hundred conversion should not be used on values larger than 999");
        }

        if (i > 100) {
            text.append(convertBasicToText(i / 100)).append(" hundred");
            i -= (i / 100) * 100;
        }

        if (i > 20) {
            text.append(" ").append(convertBasicToText((i / 10) * 10)).append("-");
            i -= (i / 10) * 10;
            text.append(convertBasicToText(i));
        } else {
            text.append(" ").append(convertBasicToText(i));
        }

        return text.toString().trim();

    }

    public static String convertBasicToText(int value) throws RuntimeException {

        switch (value) {

            case 0:
                return "zero";

            case 1:
                return "one";

            case 2:
                return "two";

            case 3:
                return "three";

            case 4:
                return "four";

            case 5:
                return "five";

            case 6:
                return "six";

            case 7:
                return "seven";

            case 8:
                return "eight";

            case 9:
                return "nine";

            case 10:
                return "ten";

            case 11:
                return "eleven";

            case 12:
                return "twelve";

            case 13:
                return "thirteen";

            case 14:
                return "fourteen";

            case 15:
                return "fifteen";

            case 16:
                return "sixteen";

            case 17:
                return "seventeen";

            case 18:
                return "eighteen";

            case 19:
                return "nineteen";

            case 20:
                return "twenty";

            case 30:
                return "thirty";

            case 40:
                return "forty";

            case 50:
                return "fifty";

            case 60:
                return "sixty";

            case 70:
                return "seventy";

            case 80:
                return "eighty";

            case 90:
                return "ninety";

        }

        throw new RuntimeException("Value (" + value + ") not valid for conversion.");

    }

}
