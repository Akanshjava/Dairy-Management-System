import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

public class customerservice {
    ArrayList<customer> customer = new ArrayList<customer>();
    HashMap<Integer, customer> customermap = new HashMap<Integer, customer>();

    public customer createcustomer(String name, String address, String number) {
        int customerid = customer.size() + 1;
        customer createcustomer = new customer(customerid, name, number, address);
        customer.add(createcustomer);
        customermap.put(customerid, createcustomer);
        return createcustomer;
    }

    public customer findcustomer(int id) {
        if (customermap.containsKey(id)) {
            return customermap.get(id);
        } else {
            System.out.println("no id found!");
            return null;
        }

    }
            public void saveCustomerstofile(){
        try{
            FileWriter writer= new FileWriter("customers.txt");
            for(customer c: customer){
                String Line= c.getcustomerid()+","+c.getname()+","+c.getnumber()+","+c.getaddress();
                writer.write(Line);
                writer.close();
            }


        }catch(IOException e){
            System.out.println("error saving file!");

        }

    }
        }
