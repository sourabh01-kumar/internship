package javaInternship;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


    public class QuizApplicationWithTimer {
        private static final int TIME_LIMIT = 10;
        private static boolean isAnswered = false;
        private static String userAnswer = "chose your option";

        public QuizApplicationWithTimer() {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[][] questions = new String[][]{{"What is the capital of India?", "A) India", "B) London", "C) Rome", "D) Berlin"}, {"What is squre root of 144 ?", "A) 3", "B) 12", "C) 5", "D) 6"}, {"Which planet is known as the Red Planet?", "A) Earth", "B) Mars", "C) Jupiter", "D) Saturn"}};
            String[] correctAnswers = new String[]{"A", "B", "B"};
            int score = 0;

            for(int i = 0; i < questions.length; ++i) {
                System.out.println("Question " + (i + 1) + ": " + questions[i][0]);

                for(int j = 1; j < questions[i].length; ++j) {
                    System.out.println(questions[i][j]);
                }

                System.out.print("Chose a  respective option : ");
                Timer timer = new Timer();
                TimerTask task = new TimerTask() {
                    public void run() {
                        if (!QuizApplicationWithTimer.isAnswered) {
                            System.out.println("\nTime's up! Moving to the next question...");
                            QuizApplicationWithTimer.userAnswer = "chose your option";
                        }

                    }
                };
                timer.schedule(task, 10000L);
                isAnswered = false;
                userAnswer = scanner.nextLine().toUpperCase();
                isAnswered = true;
                if (userAnswer.equals(correctAnswers[i])) {
                    ++score;
                    System.out.println("Correct!");
                } else if (!userAnswer.equals("chose your option")) {
                    System.out.println("Incorrect!");
                }

                System.out.println();
            }

            System.out.println("Quiz finished! Your score: " + score + "/" + questions.length);
            scanner.close();
        }
    }

