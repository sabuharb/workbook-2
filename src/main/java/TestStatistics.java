import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScores = {88,92,7,85,91,78,95,87,82,89};


        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        double average = sum / (double) testScores.length;


        int highScore = Arrays.stream(testScores).max().getAsInt();


        int lowScore = Arrays.stream(testScores).min().getAsInt();

        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highScore);
        System.out.println("Lowest Score: "+ lowScore);

        Arrays.sort(testScores);
        double median;
        if (testScores.length % 2 == 0) {
            median = (testScores[testScores.length / 2-1] + testScores[testScores.length / 2]) / 2.0;
        } else {
            median = testScores[testScores.length / 2];
        }
        System.out.println("Median: " + median);
        System.out.println("Difference between Average and Median: " + Math.abs(average - median));
    }


}
