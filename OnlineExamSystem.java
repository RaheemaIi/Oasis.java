import java.util.Scanner;

public class OnlineExamSystem {
    private static final int EXAM_TIME_LIMIT_MINUTES = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Login
        System.out.println("Welcome to the OnlineExamSystem!");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Authenticate user (you can implement a user authentication logic here)
        if (authenticateUser(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
            startExam();
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
    }

    public static boolean authenticateUser(String username, String password) {
        // Implement your authentication logic here, e.g., check against a database
        return "RaheemAli".equals(username) && "HappyBirthday".equals(password);
    }

    public static void startExam() {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int totalTime = EXAM_TIME_LIMIT_MINUTES * 60; // Total time for the exam in seconds

        System.out.println("You have " + EXAM_TIME_LIMIT_MINUTES + " minutes to complete the exam.");

        long startTime = System.currentTimeMillis();
        long endTime = startTime + (totalTime * 10);

        while (System.currentTimeMillis() < endTime) {
            // Question 1
            System.out.println("Question 1: Who is the CEO of Google?");
            System.out.println("a. Elon musk");
            System.out.println("b. Sundar Pichai");
            System.out.println("c. Bob Marley");
            String answer1 = input.nextLine().toLowerCase();
            if (answer1.equals("b")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is Paris.");
            }
            
            //Question 2
            System.out.println("Question 2: If today is friday after 100days,What is the day?"); 
            System.out.println("a. Monday"); 
            System.out.println("b. Sunday"); 
            System.out.println("c. Saturday"); 
            String answer2 = input.nextLine().toLowerCase(); 
            if (answer2.equals("b")) { 
                System.out.println("Correct!"); 
                score++; 
             } else { 
                System.out.println("Sorry, the correct answer is Sunday."); 
            } 

                //Question 3
            System.out.println("Question 3: Who introduced the Facebook app?"); 
            System.out.println("a. Mark Zuckerberg"); 
            System.out.println("b. Newton"); 
            System.out.println("c. Christopher Robin"); 
            String answer3 = input.nextLine().toLowerCase(); 
            if (answer3.equals("a")) { 
                System.out.println("Correct!"); 
                score++; 
            } else { 
                System.out.println("Sorry, the correct answer is Mark Zuckerberg."); 
            } 
                //Question 4
            System.out.println("Question 4: If August 15,2022 is Monday.Then find week of the day on August 15,2008?"); 
            System.out.println("a. Friday"); 
            System.out.println("b. Sunday"); 
            System.out.println("c. Saturday"); 
            String answer4 = input.nextLine().toLowerCase(); 
            if (answer4.equals("a")) { 
                System.out.println("Correct!"); 
                score++; 
            } else { 
                System.out.println("Sorry, the correct answer is Friday."); 
            }
            
                //Question 5
            System.out.println("Question 5: If today is Thursday then after 40 days.?"); 
            System.out.println("a. Monday"); 
            System.out.println("b. Tuesday"); 
            System.out.println("c. Saturday"); 
            String answer5 = input.nextLine().toLowerCase(); 
            if (answer5.equals("c")) { 
                System.out.println("Correct!"); 
                score++; 
            } else { 
                System.out.println("Sorry, the correct answer is Saturday ."); 
            } 
               //Question 6
            System.out.println("Question 6: What are the latest software printers are used?"); 
            System.out.println("a. Oil type"); 
            System.out.println("b. Powder type"); 
            System.out.println("c. Laser type"); 
            String answer6 = input.nextLine().toLowerCase(); 
            if (answer6.equals("c")) { 
                System.out.println("Correct!"); 
                score++; 
            } else { 
                System.out.println("Sorry, the correct answer is Laser type ."); 
            }     
                //Question 7
            System.out.println("Question 7: Who invented the computer?"); 
            System.out.println("a. Johnson and Johnson"); 
            System.out.println("b. Robert Dowry Jr"); 
            System.out.println("c. Charles Babbage"); 
            String answer7 = input.nextLine().toLowerCase(); 
            if (answer7.equals("c")) { 
                System.out.println("Correct!"); 
                score++; 
            } else { 
                System.out.println("Sorry, the correct answer is Charles Babbage ."); 
            } 
               //Question 8
            System.out.println("Question 8: What are the tough Courses in 2023?"); 
            System.out.println("a. Engineering"); 
            System.out.println("b. Law"); 
            System.out.println("c. Charted accountant"); 
            String answer8 = input.nextLine().toLowerCase(); 
            if (answer8.equals("a")) { 
                System.out.println("Correct!"); 
                score++; 
            } else { 
                System.out.println("Sorry, the correct answer is Engineering ."); 
            }
               //Question 9
            System.out.println("Question 9: Which is the fastest bird?"); 
            System.out.println("a. Swallow"); 
            System.out.println("b. Swift"); 
            System.out.println("c. Pigeon"); 
            String answer9 = input.nextLine().toLowerCase(); 
            if (answer9.equals("b")) { 
                System.out.println("Correct!"); 
                score++; 
            } else { 
                System.out.println("Sorry, the correct answer is Swift ."); 
            } 
               //Question 10
            System.out.println("Question 10: How many team members are played in cricket?"); 
            System.out.println("a. 10"); 
            System.out.println("b. 9"); 
            System.out.println("c. 11"); 
            String answer10 = input.nextLine().toLowerCase(); 
            if (answer10.equals("c")) { 
                System.out.println("Correct!"); 
                score++; 
            } else { 
                System.out.println("Sorry, the correct answer is 11 ."); 
            } 
        }
        // Auto-submit after completion of time
        System.out.println("Time's up! Your exam has been auto-submitted.");

        // Display final score and logout
        System.out.println("Your final score is: " + score);
        System.out.println("Logging out.");
    }
}