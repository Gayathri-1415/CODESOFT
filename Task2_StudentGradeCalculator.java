import java.util.*;
public class Task2_StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5,m6,total=0;
        double percentage;
        char grade;
        System.out.println("Enter marks for Telugu(0-100): ");
         m1=sc.nextInt();
        System.out.println("Enter marks for Hindi(0-100): ");
         m2=sc.nextInt();
        System.out.println("Enter marks for English(0-100): ");
         m3=sc.nextInt();
        System.out.println("Enter marks for Mathematics(0-100): ");
         m4=sc.nextInt();
        System.out.println("Enter marks for Science(0-100): ");
         m5=sc.nextInt();
        System.out.println("Enter marks for Social(0-100): ");
         m6=sc.nextInt();
        total=m1+m2+m3+m4+m5+m6;
        percentage=(total/600.0)*100;
        if(percentage>=90)
            grade='S';
        else if(percentage>=80 && percentage<90)
            grade='A';
        else if(percentage>=70 && percentage<80)
            grade='B';
        else if(percentage>=60 && percentage<70)
            grade='C';
        else if(percentage>=50 && percentage<60)
            grade='D';
        else if(percentage>=40 && percentage<50)
            grade='E';
        else grade='F';

         System.out.println("-----------------------------");
         System.out.println("\tResults");
         System.out.println("-----------------------------");
         System.out.println("Total marks obtained: "+total+" / "+" 600");
         System.out.println("Average percentage: "+ percentage);
         System.out.println("Assigned Grade: "+grade);

         




        
        

    }
}