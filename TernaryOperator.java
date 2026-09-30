import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        // int age = 67;
        // String result;

        // result = (age >= 18)? "You are eligible to vote" : "You are not eligible to vote";

        // System.out.println(result);
        int marks = 60;
        String result;

        result = (marks < 40) ? "Fail" : "Pass";
        System.out.println(result);
    } 
}

class PrintingProfile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        

        System.out.println(age);
        sc.nextLine();
       
        System.out.println("Enter the name: ");
   
        String name = sc.nextLine();
        
        
        System.out.println(name);
        
        System.out.println(name.charAt(0));

        sc.close();
    }
}