import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,totalMarks=0,noOfSubjects,Marks;
        String UserName;
        double AverageMarks=0.0;
        //taking the number of subjects
        System.out.print("Enter user name: ");
        UserName=sc.next();
        System.out.print("Enter number of subjects: ");
        noOfSubjects=sc.nextInt();
        for ( i = 1; i <=noOfSubjects; i++) {
            System.out.print("Enter marks out of 100 in subject "+""+ i+": ");
            Marks=sc.nextInt();
            totalMarks+=Marks;
        }
        AverageMarks=totalMarks/noOfSubjects;
        System.out.println("Name of the user: "+UserName);
        System.out.println("The total marks is "+totalMarks);
        System.out.println("Average marks scored: "+AverageMarks);
        if(AverageMarks>=90 && AverageMarks<=100)
            System.out.println("Grade is A1");
        else if(AverageMarks>=80 && AverageMarks<90)
            System.out.println("Grade is A2");
        else if(AverageMarks>=70 && AverageMarks<80)
            System.out.println("Grade is B1");
        else if(AverageMarks>=60 && AverageMarks<70)
            System.out.println("Grade is B2");
        else if(AverageMarks>=50 && AverageMarks<60)
            System.out.println("Grade is C1");
        else if(AverageMarks>=40 && AverageMarks<50)
            System.out.println("Grade is C2");
        else if(AverageMarks>=33 && AverageMarks<40)
            System.out.println("Grade is D");
        else
            System.out.println("Grade is F");
    }
}
