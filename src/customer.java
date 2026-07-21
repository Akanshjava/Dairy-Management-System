public class customer {
    private int customerid;
    private String name;
    private String number;
    private String address;

    public customer(int customerid, String name, String number, String address) {
        this.customerid = customerid;
        this.name = name;
        this.number = number;
        this.address = address;
    }
    public String toCSV(){
        return customerid+","+name+","+number+","+address;
    }

    public int getcustomerid() {
        return customerid;
    }

    public String getname() {
        return name;
    }

    public String getnumber() {
        return number;
    }

    public String address() {
        return address;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setnumber(String number) {
        this.number = number;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public void displayinfo() {
        System.out.println("---Customer details!---");
        System.out.println("ID   " + customerid);
        System.out.println("NAME  " + name);
        System.out.println("NUMBER  " + number);
        System.out.println("ADDRESS   " + address);
        System.out.println("-----------------------");
    }

}