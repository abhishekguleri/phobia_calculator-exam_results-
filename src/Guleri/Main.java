package Guleri;

// java program to calculate the result of the student using functions
public class Main {

    public static void main(String[] args) {

        //enter the score in the code
        perform(100, 100, 100, 100, 100);
    }

    public static void perform(int Eng, int Maths, int Comp, int Sanskrit, int Hindi) {/*for extra good handwriting*/
int Total =500;
        final int MarksObt = Eng + Maths + Comp + Sanskrit + Hindi;
        int YourPer= (MarksObt/Total)*100;
        System.out.println("marks obtained = " + MarksObt+"\n your percentage is = "+YourPer);
        if (MarksObt >= 400) {
            System.out.println("Your grade is A \nexcellent,keep it up!!! & try to learn new thing everyday");
        } else if (MarksObt >= 300 && MarksObt < 400) {
            System.out.println("Your grade is B\nvery good,but you must practice");
        } else if (MarksObt >= 200 && MarksObt < 300) {
            System.out.println("Your grade is C \ngood, but you need hard work");
        } else if (MarksObt >= 100 && MarksObt < 200) {
            System.out.println(" Your grade is D \nyou need hard word if you don't practice you surely fails");
        } else {
            System.out.println(" Your grade is F \nyour are fail, you have to again give the paper\n\n if you are note able to clear the exam you are detained");
        }

        if (MarksObt > 100) {
            System.out.println("best wishes for the completion of the semester");
        } else {
            System.out.println(" please the application for re-exam.\nfor more info login the college website.");
        }
    }

}
