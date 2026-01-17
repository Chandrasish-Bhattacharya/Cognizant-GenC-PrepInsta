// Question 1
// Problem Statement – Write a program to calculate the fuel consumption of your truck.
// The program should ask the user to enter the quantity of diesel to fill up the tank and the distance covered till the tank goes dry.
// Calculate the fuel consumption and display it in the format (liters per 100 kilometers).
// Convert the same result to the U.S. style of miles per gallon and display the result. If the quantity or distance is zero or negative display ” is an Invalid Input”.
// [Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach (fuel / distance ). Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]
// The result should be with two decimal place.To get two decimal place refer the below-mentioned print statement :
// float cost=670.23;
// System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);
// Sample Input 1:
// Enter the no of liters to fill the tank
//            20
// Enter the distance covered
//            150
// Sample Output 1:
// Liters/100KM
//           13.33
// Miles/gallons
//           17.64
// Explanation: 
// For 150 KM fuel consumption is 20 liters, 
// Then for 100 KM fuel consumption would be (20/150)*100=13.33,
// Distance is given in KM, we have to convert it to miles (150*0.6214)=93.21,
// Fuel consumption is given in liters, we have to convert it to gallons (20*0.2642)=5.284, 
// Then find (miles/gallons)=(93.21/5.284)=17.64
// Sample Input 2:
// Enter the no of liters to fill the tank
//          -5
// Sample Output 2:
// -5 is an Invalid Input
// Sample Input 3:
// Enter the no of liters to fill the tank
//            25
// Enter the distance covered
//           -21
// Sample Output 3:
// -21 is an Invalid Input

import java.util.Scanner;

public class question1 {
    public static void ans(double liter, double distance) {
        if (liter < 0) {
            System.out.println("Invalid Input");
        } else {
            double KM_liter = Math.round(((liter / distance) * 100) * 100.0) / 100.0;

            System.out.println(KM_liter);

            // lets convert km to miles

            double miles = distance * 0.6214;

            double gallons = liter * 0.2642;

            double miles_gallon = Math.round((miles / gallons) * 100.0) / 100.0;

            System.out.println(miles_gallon);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of liters to fill the tank : ");
        double l = sc.nextInt();
        if (l < 0) {
            System.out.println("Invalid");
            System.exit(0);
        }
        System.out.print("Enter the distance covered : ");
        double d = sc.nextInt();
        if (d < 0) {
            System.out.println("Invalid");
            System.exit(0);
        }
        ans(l, d);

        sc.close();
    }
}