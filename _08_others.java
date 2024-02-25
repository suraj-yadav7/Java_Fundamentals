import java.util.ArrayList;

public class _08_others {
    public static void main(String[] args){
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(5);
        arrInt.add(10);
        arrInt.add(15);
        System.out.println("arrInt list: "+ arrInt);

        // exception handling: It handle unexpected event and don't break the normal flow of the code
        try{
            System.out.println("divide: "+(1/0));
        }
        catch(Exception e){
            System.out.println("Error handling: "+e);
        }
        arrInt.add(20);
        System.out.println("Arr list: "+ arrInt);
    }
    
}
