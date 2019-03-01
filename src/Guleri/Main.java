package Guleri;

import java.util.Scanner;

// java program to calculate the result of the student using functions
public class Main {

    public static void main(String[] args) {

   Scanner input =new Scanner(System.in);
        //enter the score in the code
        int Total = 500;
        System.out.println("enter the marks\n in English,Maths,Computer Science, Sanskrit,Hindi respectively ");
        int sub1 = input.nextInt();
        int sub2 = input.nextInt();
        int sub3 = input.nextInt();
        int sub4 = input.nextInt();
        int sub5 = input.nextInt();
        final int MarksObt = sub1 + sub2 + sub3 + sub4 + sub5;
        int YourPer = (MarksObt / Total) * 100;
        System.out.println("marks obtained = " + MarksObt + "\n your percentage is = " + YourPer);
        if (MarksObt >= 400 && sub1> 20 && sub2 > 20 && sub3 > 20 && sub4 > 20 && sub5 > 20) {
            System.out.println("Your grade is A \nexcellent,keep it up!!! & try to learn new thing everyday");
        } else if (MarksObt >= 300 && MarksObt < 400 &&sub1> 20 && sub2 > 20 && sub3 > 20 && sub4 > 20 && sub5 > 20) {
            System.out.println("Your grade is B\nvery good,but you must practice");
        } else if (MarksObt >= 200 && MarksObt < 300 && sub1> 20 && sub2 > 20 && sub3 > 20 && sub4 > 20 && sub5 > 20) {
            System.out.println("Your grade is C \ngood, but you need hard work");
        } else if (MarksObt >= 100 && MarksObt < 200 && sub1> 20 && sub2 > 20 && sub3 > 20 && sub4 > 20 && sub5 > 20) {
            System.out.println(" Your grade is D \nyou need hard word if you don't practice you surely fails");
        } else if ((MarksObt < 100 && MarksObt == 0 && YourPer == 0 )||sub1 == 0 || sub2 == 0 || sub3 == 0 || sub4 == 0 || sub5 == 0) {
            System.out.println(" Your grade is F \nyour are fail, you have to again give the paper\n\n if you are note able to clear the exam you are detained");
        }
        else {
            System.out.println("wrong user input\n please check the conditions.");
        }

        if (MarksObt > 100) {
            System.out.println("best wishes for the completion of the semester");
        } else {
            System.out.println(" check the application for re-exam.\nfor more info login the college website.");
        }
    }

}
