public class LEVEL1 {
 public static void main(String args[]){
    // Program to calculate Sam's average mark in PCM

        // Fixed values stored as variables
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;

        // Variable to store total and average
        int totalMarks;
        double averagePercent;

        // Arithmetic operations
        totalMarks = mathsMark + physicsMark + chemistryMark;
        averagePercent = totalMarks / 3.0;   // 3.0 to ensure double division

        // Display result
        System.out.println("Sam’s average mark in PCM is " + averagePercent);
    }
}