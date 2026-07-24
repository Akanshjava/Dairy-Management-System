import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME: ");
        String name = sc.nextLine();
        System.out.println("ENTER ADDRESS: ");
        String address = sc.nextLine();
        System.out.println("ENTER NUMBER: ");
        String number = sc.next();
        customerservice cs = new customerservice();
        customer c = cs.createcustomer(name, address, number);
        cs.saveCustomerstofile();

        c.displayinfo();
        System.out.println("MORNING MILK: ");
        double morningquantity = sc.nextDouble();
        System.out.println("EVENING MILK: ");
        double eveningquantity = sc.nextDouble();
        System.out.println("DATE: ");
        sc.nextLine();
        String date = sc.nextLine();
        milkrecord m1 = null;
        try {
            m1 = new milkrecord(1, morningquantity, eveningquantity, date);
            m1.calculateinfo();
            m1.displayinfo();
        } catch (InvalidMilkQuantityException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("MILK RATE: ");
        double milkrate = 0;
        try {
            milkrate = sc.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
        }
        System.out.println("AMOUNT PAID: ");
        double amountpaid = 0;
        try {
            amountpaid = sc.nextDouble();
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("Invalid Input!");
        }
        System.out.println("DATE: ");
        sc.nextLine();
        String billdate = sc.nextLine();

        Bill b = new Bill(1, 1, milkrate, amountpaid, billdate);
        if (m1 != null) ;
        {


            b.addrecord(m1);
        }
        b.calculateinfo();
        b.displayonfo();
    }
}
