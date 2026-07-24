import java.util.ArrayList;
import java.util.HashMap;
public class MilkRecordService {
    private HashMap<String, ArrayList<milkrecord>>milkrecords;
    public MilkRecordService(){
        milkrecords= new HashMap<>();

    }
    public void addmilkrecord(String customerId, milkrecord record){
        if(milkrecords.containsKey(customerId)){
             milkrecords.get(customerId).add(record);
        }else{
            ArrayList<milkrecord> newList= new ArrayList<>();
            newList.add(record);
            milkrecords.put(customerId,newList);
        }
    }
}
