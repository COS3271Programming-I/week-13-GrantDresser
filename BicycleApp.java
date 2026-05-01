import java.util.Scanner;

public class BicycleApp {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Bicycle Exercise Planner!");
        System.out.print("Enter the bike owner's name: ");
        String owner = userinput.nextLine();

        System.out.print("Enter the bicycle type or brand: ");
        String type = userinput.nextLine();

        System.out.print("Enter your starting cadence in RPM: ");
        int cadence = userinput.nextInt();

        System.out.print("Enter your current speed in MPH: ");
        int speed = userinput.nextInt();

        System.out.print("Enter your current gear: ");
        int gear = userinput.nextInt();

        System.out.print("How many minutes do you plan to ride? ");
        int minutes = userinput.nextInt();

        Bicycle userBike = new Bicycle(cadence, speed, gear, type, owner);

        double hours = minutes / 60.0;
        double miles = speed * hours;
        int totalPedalTurns = cadence * minutes;

        System.out.println();
        System.out.println("Here is your bicycle information:");
        System.out.println(userBike.getInfo());

        System.out.println();
        System.out.println("Exercise Plan Results:");
        System.out.println("Ride time: " + minutes + " minutes");
        System.out.println("Estimated distance: " + miles + " miles");
        System.out.println("Estimated pedal rotations: " + totalPedalTurns);

        if (minutes < 20) {
            System.out.println("Plan suggestion: Try a short beginner ride today.");
        } else if (minutes <= 45) {
            System.out.println("Plan suggestion: This is a solid moderate workout.");
        } else {
            System.out.println("Plan suggestion: This is a longer endurance ride.");
        }

        if (speed < 10) {
            System.out.println("Speed advice: Focus on steady pacing and comfort.");
        } else if (speed <= 18) {
            System.out.println("Speed advice: You are riding at a good exercise pace.");
        } else {
            System.out.println("Speed advice: You are riding at a fast pace, so remember to recover.");
        }

        if (cadence < 60) {
            System.out.println("Cadence advice: Try using an easier gear to pedal faster.");
        } else if (cadence <= 90) {
            System.out.println("Cadence advice: Your cadence is in a good range.");
        } else {
            System.out.println("Cadence advice: Your cadence is high, so make sure you stay controlled.");
        }

        System.out.println();
        System.out.println("Thank you for using the Bicycle Exercise Planner!");
    }
}