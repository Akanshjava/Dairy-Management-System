import java.util.ArrayList;
import java.util.HashMap;

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
        }else{
            System.out.println("no id found!");
            return null;
        }

            }
        }
