public class _05_string{
    public static void main(String[] args){
        // String can be decalred by 5 types
        /*
        char[] charStr1 ={'x','y','z'};
        String str2 ="hello world";
        String str3 = new String("Programming makes life easy");
        StringBuffer str4 = new StringBuffer("Code everyday");
        StringBuilder str5 = new StringBuilder("Artificial Intelligence");
        System.out.println("String pool: "+ str2);
        System.out.println("New String : "+ str3);
        */

        //String Mutation:  It can be done using StringBuffer and StringBuilder
        String str1="code";
        String str2="code";
        // String cannot be compared with == , it has to compared with .equals() method
        System.out.println("Comparing string: "+ str1.equals(str2)); 
        
        // appending can be perfomed to StringBuffer and StringBuilder
        StringBuffer str3 = new StringBuffer("github");
        str3.append(" profile");
        System.out.println("str3 val: "+str3);
        str3.insert(6, " A");
        System.out.println(str3);

        StringBuilder str4 = new StringBuilder("laptop");
        str4.delete(3, str4.length());
        System.out.println("Delete str4: "+ str4);

    }
}