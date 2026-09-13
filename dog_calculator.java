
import java.util.Scanner; //Scanner Class imported

public class dog_calculator {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to MPLS Dog Boarding cost calculator, this applicaotn will generate a summary of cost");
        System.out.println(" ");

        System.out.println("-".repeat(50));
        System.out.println("Plase look below for dogs rate based on size");
        System.out.println("Small dogs (less than 15 pounds) = $45.00 per day");
        System.out.println("Medium dogs (15 to 30 pounds) = $65.00 per day");
        System.out.println("Large dogs (31 to 80 pounds) = $85.00 per day");
        System.out.println("Extra large dogs (81 pounds and above) = $100.00 per day");
        System.out.println(" ");
        System.out.println("-".repeat(50));

// Lets start getting user registration for there dog
        System.out.println("Please enter your dog information below");
        System.out.print("Enter dogs name: ");
        String dog_name = input.nextLine();

        System.out.print("Enter dog breed: ");
        String dog_breed = input.nextLine();

        System.out.print("Enter number of days your dog will be in care: ");
        int days = input.nextInt();

        System.out.print("Enter dog age: ");
        int age = input.nextInt();

        System.out.print("Enter dog weight in pound: ");
        int weight = input.nextInt();

// calculations 
        System.out.println("SUMMARY OF ESTIMATED COST");
        System.out.println("-".repeat(50));
        // discount calculation based on cost;

        double total = 0;
        double estimated_discount = 0;
        double final_total = 0;
        double daily_rate_fee = 0;
        String dogsize = "";
        double charge = 0;

        final double small_dogs = 45.00;
        final double medium_dogs = 65.00;
        final double large_dogs = 85.00;
        final double extra_large_dogs = 100.00;

        // boarding a dog to a group 
        String boardingGroup;

        if (age == 0) {
            boardingGroup = "BLUE";
        } else if (age >= 1 && age <= 4) {
            boardingGroup = "ORANGE";
        } else if (age == 5) {
            boardingGroup = "RED";
        } else if (age >= 6 && age <= 15) {
            boardingGroup = "GREEN";
        } else {
            boardingGroup = "INVALID AGE GROUP";
        }

        // dogs weight weight fee calculation 
        //daily daybare rate calculation
        if (weight < 15) {
            total = days * small_dogs;
            daily_rate_fee = days * small_dogs;
            dogsize = "Small";
            charge = small_dogs;
        } else if (weight >= 15 && weight <= 30) {
            total = days * medium_dogs;
            daily_rate_fee = days * medium_dogs;
            dogsize = "Medium";
            charge = medium_dogs;
        } else if (weight >= 31 && weight <= 80) {
            total = days * large_dogs;
            daily_rate_fee = days * large_dogs;
            dogsize = "Large";
            charge = large_dogs;
        } else if (weight >= 81) {
            total = days * extra_large_dogs;
            daily_rate_fee = days * extra_large_dogs;
            dogsize = "Extra Large";
            charge = extra_large_dogs;
        }
        // receive 
        System.out.println("Rate for Dog Size:" + dogsize);
        System.out.println("Charge per day: $" + charge); // per day size change 
        System.out.println("Dog name: " + dog_name);
        System.out.println("Dog breed: " + dog_breed);
        System.out.println("Dog age: " + age);
        System.out.println("Boarding group: " + boardingGroup);
        System.out.println("Dog weight: " + weight);
        System.out.println("Day(s) in care: " + days);
        System.out.println("Daily daycare rate: $" + (daily_rate_fee)); // is not part of the discount

        if (total > 165) {
            System.out.println("You will receive a 2% discount");
            estimated_discount = total * 0.02;
            final_total = total - estimated_discount;
            System.out.println("Estimated cost: $" + final_total); // final total after discount
        } else {
            System.out.println("Estimated cost: $" + total); // total without discount

        }

        System.out.println("-".repeat(50));
    }
}
