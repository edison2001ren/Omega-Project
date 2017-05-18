/**
 * Created by sunl on 5/12/17.
 */
public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int p1 = -1, p2 = -1, min = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1))
                p1 = i;

            if (words[i].equals(word2))
                p2 = i;

            if (p1 != -1 && p2 != -1)
                min = Math.min(min, Math.abs(p1 - p2));
        }
        return min;
    }

    public static void main(String[] args) {
        String[] arr = {"A", "B", "D", "C", "B", "C"};
        String wd1 = "B";
        String wd2 = "C";
        ShortestWordDistance obj = new ShortestWordDistance();
        System.out.println("The shortest distance is: " + obj.shortestDistance(arr, wd1, wd2));
    }
}
