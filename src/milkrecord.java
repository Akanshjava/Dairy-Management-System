public class milkrecord {
    private int customerid;
    private double morningquantity;
    private double eveningquantity;
    private double totalquantity;
    private String date;

    public milkrecord(int customerid, double morningquantity, double eveningquantity, String date) throws InvalidMilkQuantityException {
        this.customerid = customerid;
        this.morningquantity = morningquantity;
        this.eveningquantity = eveningquantity;
        this.totalquantity = totalquantity;
        this.date = date;


    }

    int getcustomerid() {
        return customerid;
    }

    double getmorningquantity() {
        return morningquantity;
    }

    double geteveningquantity() {
        return eveningquantity;
    }

    double getTotalquantity() {
        return totalquantity;
    }

    String getdate() {
        return date;
    }


    public void setmorningquantity(double morningquantity) throws InvalidMilkQuantityException {
        if (morningquantity < 0) {
            throw new InvalidMilkQuantityException("milk quantity negative nahi");
        }
        this.morningquantity = morningquantity;
    }

    public void seteveningquantity(double eveningquantity) throws InvalidMilkQuantityException {
        if (eveningquantity < 0) {
            throw new InvalidMilkQuantityException("milk quantity negative nahi");
        }
        this.eveningquantity = eveningquantity;
    }

    public void settotalquantity(double totalquantity) {
        this.totalquantity = totalquantity;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public void calculateinfo() {
        totalquantity = morningquantity + eveningquantity;
    }

    public void displayinfo() {
        System.out.println("---Milk details!---");
        System.out.println("ID   " + customerid);
        System.out.println("MORNING   " + morningquantity);
        System.out.println("EVENING   " + eveningquantity);
        System.out.println("TOTAL   " + totalquantity);
        System.out.println("DATE   " + date);
    }
}





