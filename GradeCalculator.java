import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        int score = getStudentScore();
        calculateGrade(score);
    }
    public static int getStudentScore(){
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter you score: ");
        int score = grade.nextInt();
        grade.close();
        return score;
    }
    public static void calculateGrade(int score){
        System.out.print("Your Grade is: ");
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}