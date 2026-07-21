import java.util.ArrayList;

public class Bill {
    int billid;
    int customerid;
    double milkrate;
    double totallitres;
    double totalamount;
    double amountpaid;
    double balance;
    String date;
    private ArrayList<milkrecord> records;

    public Bill(int billid, int customerid, double milkrate, double amountpaid, String date) {
        this.billid = billid;
        this.customerid = customerid;
        this.milkrate = milkrate;
        this.amountpaid = amountpaid;
        this.date = date;
        this.records = new ArrayList<>();
    }

    int getbillid() {
        return billid;
    }

    int getcustomerid() {
        return customerid;
    }

    double getmilkrate() {
        return milkrate;
    }

    double getamountpaid() {
        return amountpaid;
    }

    String getdate() {
        return date;
    }

    public void setmilkrate(double milkrate) {
        this.milkrate = milkrate;
    }

    public void setamountpaid(double amountpaid) {
        this.amountpaid = amountpaid;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public void calculateinfo() {
        for (milkrecord r : records) {
            r.calculateinfo();
            totallitres += r.getTotalquantity();
            totalamount = totallitres * milkrate;
            balance = totalamount - amountpaid;

        }
    }

    public void addrecord(milkrecord r) {
        records.add(r);
    }

    public void displayonfo() {
        System.out.println("---Billing Details!---");
        System.out.println("BILL ID   " + billid);
        System.out.println("CUSTOMER ID   " + customerid);
        System.out.println("TOTAL MILK   " + totallitres);
        System.out.println("MILK RATE   " + milkrate);
        System.out.println("AMOUNT   " + totalamount);
        System.out.println("AMOUNT PAID   " + amountpaid);
        System.out.println("BALANCE   " + balance);
        System.out.println("DATE   " + date);
    }
}
