// Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons.
// When her teacher tells a month, she needs to say the season corresponding to that month. 
// Write a program to solve the above task.
// Spring – March to May,
// Summer – June to August,
// Autumn – September to November and,
// Winter – December to February.
// Month should be in the range 1 to 12.  If not the output should be “Invalid month”.

import java.util.Scanner;

public class question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if(month == 3 || month == 4 || month == 5){
            System.out.println("Spring");
            System.exit(0);
        }
        else if(month >= 6 && month <=8){
            System.out.println("Summer");
            System.exit(0);
        }
        else if(month >= 9 && month <=11){
            System.out.println("Autumn");
            System.exit(0);
        }
        else if(month == 12 || month == 1 || month == 2){
            System.out.println("Winter");
            System.exit(0);
        }
        else {
            System.out.println("Invalid month");
        }
        sc.close();
    }
}
