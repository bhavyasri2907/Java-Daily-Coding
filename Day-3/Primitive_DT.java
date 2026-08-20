import java.util.Scanner;

public class Primitive_DT {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---Employee details---");

       
        int id = sc.nextInt();
        System.out.print("ID: " + id);

        
        byte age = sc.nextByte();
        System.out.print("Age: " + age);

;
        char department_code = sc.next().charAt(0);
        System.out.print("Department Code: " + department_code);


        double salary = sc.nextDouble();
        System.out.print("Salary: " + salary);

        short experience = sc.nextShort();
        System.out.print("Experience: " + experience + " years");

        long mobile = sc.nextLong();
        System.out.print("Mobile: " + mobile);

        boolean permanent = sc.nextBoolean();
        System.out.print("Permanent: " + permanent);

        float rating = sc.nextFloat();
        System.out.print("Rating: " + rating);

        

        sc.close();
    }
}