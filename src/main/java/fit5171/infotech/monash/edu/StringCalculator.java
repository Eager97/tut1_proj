package fit5171.infotech.monash.edu;

public class StringCalculator {
    public int Add(String numbers) {
        if (numbers.length() < 2) {
            if (numbers.isEmpty()) {
                return 0;
            } else {
                return convertToInt(numbers);
            }
        } else {
            String delimiter = ",";
            if (numbers.matches("//(.*)\n(.*)")) {
                delimiter = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
            }
            String[] numList = splitNumbers(numbers, delimiter + "|\n");
            return sum(numList);
        }
    }

    private String[] splitNumbers(String numbers, String s) {
        return numbers.split(s);
    }

    private int convertToInt(String numbers) {
        return Integer.parseInt(numbers);
    }

    private int sum(String[] numbers) {
        int total = 0;
        StringBuilder negativeString = new StringBuilder();

        for (String number : numbers) {
            if (convertToInt(number) < 0) {
                if (negativeString.toString().equals(""))
                    negativeString = new StringBuilder(number);
                else
                    negativeString.append(",").append(number);
            }
            if (convertToInt(number) < 1000)
                total += convertToInt(number);
        }

        if (!negativeString.toString().equals("")) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeString);
        }

        return total;
    }
}