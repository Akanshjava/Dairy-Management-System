import java.util.ArrayList;
import java.util.HashMap;
public class BillService {
      private HashMap<String, ArrayList<Bill>>bills;
      public BillService(){
          bills = new HashMap<>();

      }
      public void createBill(String customerId , Bill newbill){
          if(bills.containsKey(customerId)){
              bills.get(customerId).add(newbill);
          }else{
              ArrayList<Bill> newList= new ArrayList<>();
              newList.add(newbill);
              bills.put(customerId,newList);
          }

      }
}
