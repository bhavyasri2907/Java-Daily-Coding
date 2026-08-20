import java.util.Scanner;

public class Student_Data_Collect {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Student Data ---");

        System.out.print("Roll No: ");
        int roll_no = sc.nextInt();

        System.out.print("Age: ");
        byte age = sc.nextByte();

        System.out.print("Section: ");
        char section = sc.next().charAt(0);

        System.out.print("Total Marks: ");
        int total_marks = sc.nextInt();

        System.out.print("Average: ");
        double average = sc.nextDouble();

        System.out.print("Year of Joining: ");
        short joining_year = sc.nextShort();

        System.out.print("Mobile: ");
        long mobile = sc.nextLong();

        System.out.print("Passed: ");
        boolean ispassed = sc.nextBoolean();

        sc.close();
    }
}