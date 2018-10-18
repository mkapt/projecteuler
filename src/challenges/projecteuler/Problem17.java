package challenges.projecteuler;

import java.util.HashMap;
import java.util.Map;

//21124
public class Problem17 {

    public static void main(String[] args) {
        System.out.println(iterate());
    }

    public static int iterate() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += removeChars(writeout(String.valueOf(i))).chars().count();
        }

        return sum;
    }

    public static String writeout(String number) {
        String writtenout = getFromDictionary(number);
        String n = number;
        if (writtenout != null && n.length() <=2) return writtenout;
        else
            if(n.length() == 1) {
                writtenout = getFromDictionary(String.valueOf(Character.getNumericValue(n.charAt(0))));
            }

            if(n.length() == 2) {
                String dezena = getFromDictionary(String.valueOf(Integer.valueOf(Character.getNumericValue(n.charAt(0)) * 10)));
                if(Integer.valueOf(number)%10 != 0) {
                    String unidade = getFromDictionary(String.valueOf((n.charAt(n.length()-1))));
                    writtenout = dezena.concat(getFromDictionary("0")).concat(unidade);
                } else {
                    writtenout = dezena;
                }
            } else if (n.length() == 3) {
                String indicadorCentena = getFromDictionary(String.valueOf((n.charAt(0))));
                String centena = getFromDictionary("100");
                if(Integer.valueOf(number)%100 != 0){
                    if(getFromDictionary(n.substring(1)) != null) {
                        String resto = getFromDictionary(n.substring(1));
                        writtenout = indicadorCentena + " " + centena + " and " + resto;
                    } else {
                        String dezena = getFromDictionary(String.valueOf(Integer.valueOf(Character.getNumericValue(n.charAt(1)) * 10)));
                        String unidade = getFromDictionary(String.valueOf(n.charAt(n.length()-1)));
                        writtenout = indicadorCentena.concat(" ").concat(centena).concat(" and ").concat(dezena).concat("-").concat(unidade);
                    }

                } else {
                    writtenout = indicadorCentena.concat(" ").concat(centena);
                }

            } else if (n.length() == 4) {
                String indicadorMilhar = getFromDictionary(String.valueOf(n.charAt(0)));
                String milhar = getFromDictionary("1000");
                if(Integer.valueOf(number)%1000 != 0) {
                    String indicadorCentena = getFromDictionary(String.valueOf(n.charAt(0)));
                    String centena = getFromDictionary("100");
                    String dezena = getFromDictionary(String.valueOf(Integer.valueOf(Character.getNumericValue(n.charAt(0))) * 10));
                    String unidade = getFromDictionary(String.valueOf(n.charAt(n.length()-1)));
                    writtenout = indicadorMilhar.concat(" ").concat(milhar).concat(" ").concat(indicadorCentena).concat(" ").concat(centena).concat(" ").concat(dezena).concat("-").concat(unidade);
                } else {
                    writtenout = indicadorMilhar.concat(" ").concat(milhar);
                }
            }

        return writtenout;
    }

    public static String removeChars(String writtenout) {
        return writtenout.replaceAll("[ |-]", "");
    }

    private static String getFromDictionary(String key) {
        Integer k = Integer.valueOf(key);
        Map<Integer, String> map = new HashMap<>();

        map.put(0, "-");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");
        map.put(100, "hundred");
        map.put(1000, "thousand");
        return map.get(k);
    }
}
