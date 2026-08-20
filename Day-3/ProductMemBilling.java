import java.util.Scanner;

public class ProductMemBilling {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Product price:");
        double p1_price = sc.nextDouble();

        System.out.println("quantity");
        int quantity = sc.nextInt();
        
        System.out.println("membership type:");
        char membership_type = sc.next().charAt(0);
       

        double discount = 0;
        double shipping = 0;
        

        if(membership_type == 'S')
        {
             discount = 10;
             shipping = 50;

        }
        else if(membership_type == 'G')
        {
             discount = 15;
             shipping = 20;
        }
        else if(membership_type == 'D')
        {
             discount = 20;
             shipping = 0;
        }
        else
        {
             discount = 0;
             shipping = 100;
        }
        
        double discountAmount = p1_price * discount / 100;


        double discountedprice = p1_price - discountAmount;

        double Central_Tax = 2.5 / 100.0;
        double State_Tax = 2.5 / 100.0; 
        
        double CentralTaxAmount = discountedprice * Central_Tax;
        double StateTaxAmount = discountedprice * State_Tax;

        double FinalPrice = discountedprice + CentralTaxAmount + StateTaxAmount + shipping;

        double FinalBill =  quantity * FinalPrice;

        double totalSaving = discountAmount * quantity;


        System.out.println("----Billing---");

        System.out.println("product price:" + p1_price);
        System.out.println("Discount Amount:" + discountAmount );
        System.out.println("Final price per product:" + FinalPrice);

        System.out.println("Final Bill Amount:" + FinalBill );

        System.out.println("Total Savings" + totalSaving );

        sc.close();




        


        
    }
    
}
