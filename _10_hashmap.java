import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _10_hashmap {
    public static void main(String[] args){

        // Hashmap is used to store the data in key, value pair and it stored those data in unordered manner Moreover, key must be unique.
        HashMap<String, Integer> map= new HashMap<>();
        
        //Adding element in map
        String name = "petrol";
        int price = 109;
        map.put(name,price);
        map.put("diesel", 98);
        map.put("cng", 101);
        System.out.println("HashMap values: "+ map);

        // Searching elements from map
        if(map.containsKey("petrol")){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element not found");
        }

        // Iterating using Map
        // for(type : set())
        for(Map.Entry<String, Integer> elem : map.entrySet()){
            System.out.println("Key "+elem.getKey()+" : "+"value "+elem.getValue());

        }

        // calling function
        userDataHashMap();
    }
    
    // pratice questin takes data from user and store in key value pair
static void userDataHashMap(){
    HashMap<String, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter key in string format or 'exit' to stop': ");
            String key = scan.nextLine();
            if(key.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println("Now enter interger value for key: ");
            int value = scan.nextInt();
            scan.nextLine();
            map.put(key,value);
        }
        // Printing hasmap value in object format
        System.out.println("Key value pair: "+map);

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
}
}

