package challenges.projecteuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
//begin by sorting it into alphabetical order. Then working out the alphabetical value for each name,
//multiply this value by its alphabetical position in the list to obtain a name score.
//For example, when the list is sorted into alphabetical order, COLIN,
//which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
//So, COLIN would obtain a score of 938 × 53 = 49714.
//What is the total of all the name scores in the file?
public class Problem22 {

    public static void main(String[] args) throws IOException {
        //871198282
        System.out.println(getNameScores());
    }

    private static long getNameScores() throws IOException {
        String[] names = readFile("p022_names.txt").replaceAll("\"", "").split(",");
        return getScoreForList(names);
    }

    private static String readFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }

    private static long getScoreForList(String[] list) {
        Arrays.sort(list);
        long sum = 0;

        for (int i = 0, j = 1; i < list.length; i++, j++) {
            sum += getScoreForName(list[i]) * j;
        }

        return sum;
    }

    private static int getScoreForName(String name) {
        Map<Character, Integer> map = getMapOfValues();
        int sum = 0;
        for (Character c : name.toUpperCase().toCharArray()) {
            sum += map.get(c);
        }

        return sum;
    }

    private static Map<Character, Integer> getMapOfValues() {
        Map<Character, Integer> map = new HashMap<>();

        int j = 1;
        for (char i = 65; i <= 90; i++) {
            map.put(i, j);
            j++;
        }

        return map;
    }

    //lambda style - from internet
    private static int lambdaStyle() {
        int total=0;
        try (Stream<String> stream = Files.lines(Paths.get("p022_names.txt"))) {
            List<String> sList = Arrays.asList(stream.collect(Collectors.joining()).replace("\"","").split(","));
            sList.sort(Comparator.comparing(Function.identity()));

            int i=0;
            for (String name : sList) {
                i++;
                int sum = name.chars().map(x->x-64).sum();
                total+=sum*i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return total;
    }
}
