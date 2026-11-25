import java.util.*;

public class Main {

    static class Question {
        String text;
        String[] options;
        int correct;

        Question(String t, String[] o, int c) {
            text = t;
            options = o;
            correct = c;
        }

        void display(int n) {
            System.out.println("\n" + n + ". " + text);
            for (int i = 0; i < options.length; i++)
                System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();

        questions.add(new Question("Which data structure uses FIFO?",
            new String[]{"Stack", "Queue", "Tree", "Graph"}, 2));

        questions.add(new Question("Which keyword creates an object in Java?",
            new String[]{"class", "new", "void", "static"}, 2));

        questions.add(new Question("Which structure stores key-value pairs?",
            new String[]{"Array", "Queue", "HashMap", "Stack"}, 3));

        System.out.println("ONLINE EXAMINATION SYSTEM");

        for (int i = 0; i < questions.size(); i++) {
            questions.get(i).display(i + 1);
            System.out.print("Enter option (1-4): ");
            answers.add(sc.nextInt());
        }

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            if (answers.get(i) == questions.get(i).correct)
                score++;
        }

        System.out.println("\nExam submitted successfully!");
        System.out.println("Score: " + score + "/" + questions.size());
        System.out.println("Percentage: " +
            (score * 100.0 / questions.size()) + "%");

        sc.close();
    }
}