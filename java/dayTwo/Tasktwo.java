public class Tasktwo {

    public static String getStudentScore(int score1, int score2, int score3) {
        int sum = score1 + score2 + score3;
        float average = sum / 3.0;
        String result;

        if (average >= 90 && average <= 100) {
            result = "A";
        } else if (average >= 80) {
            result = "B";
        } else if (average >= 70) {
            result = "C";
        } else if (average >= 60) {
            result = "D";
        } else {
            result = "F";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getStudentScore(85, 90, 95));
        System.out.println(getStudentScore(70, 75, 72));
    }
}
