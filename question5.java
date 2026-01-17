// Problem Statement  – In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. 
// Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. 
// Refreshments can also be opted by paying an additional of Rs. 50 per member.

// Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. 
// If fails display “Minimum of 5 and Maximum of 40 Tickets”.  
// If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

// The ticket cost should be printed exactly to two decimal places.
// Sample Input 1:

// Enter the no of ticket:35
// Do you want refreshment:y
// Do you have coupon code:y
// Enter the circle:k
// Sample Output 1:

// Ticket cost:4065.25
// Sample Input 2:

// Enter the no of ticket:1
// Sample Output 2:

// Minimum of 5 and Maximum of 40 Tickets

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        int noOfTicket = sc.nextInt();
        if (noOfTicket < 5 || noOfTicket > 40) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("Do you want refreshment");
        String refreshment = sc.next();

        System.out.println("Do you have coupon code:");
        String cC = sc.next();

        System.out.println("Enter the circle:");
        String circle = sc.next();

        double cost = 0;

        if (circle.charAt(0) == 'k' || circle.charAt(0) == 'K')
            cost = noOfTicket * 75;
        else if (circle.charAt(0) == 'q' || circle.charAt(0) == 'Q')
            cost = noOfTicket * 150;
        else {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if (noOfTicket > 20) {
            cost = cost - (cost * (0.1));
        }

        if (cC.charAt(0) == 'y' || cC.charAt(0) == 'Y') {
            cost = cost - (cost * (0.02));
        }
        if (refreshment.charAt(0) == 'y' || refreshment.charAt(0) == 'Y')
            cost = cost + (50 * noOfTicket);
        System.out.println(cost);
        sc.close();
    }
}
