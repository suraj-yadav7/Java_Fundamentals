import java.util.Scanner;

public class _02_basics {
    public static void main(String[] args) {
        /*
         
        // Types in java - Primitive
        // byte 1 : -18 t0 127
        // short 2
        // char 2 : a,b,c
        // int 4 : 1,2,3,4
        // float 4 : 3.14, 24.34
        // long 8 : 1423L
        // double 8
        // boolean 1 :true/false
        // Examples
        byte age=25;
        char letter='h';
        int phone = 32845092;
        float pi = 3.14F;
        long num= 203450423958432L;
        boolean isEligible = true;
        System.out.println("Primitive Data types:: "+ phone);
        */

        // Non-Primitive 
        // class
        // object
        // String
        // Array
        // interface

        /*
        // String
        // String are immutable, so every time any changes are made on original array, then changes need to be stored in new variable
         String str="Java basics";
         System.out.println("String length:: "+ str.length());
         System.out.println("String substing:: " + str.substring(0,3));
         // replace string letter
         String replaceStr = str.replace('a', 'b');
         System.out.println("Original String : "+str);
         System.out.println("Replaced String : "+replaceStr);
         */

         /*
         // Arrays
         // Initializing array - one dimension
         int arr[]={2,4,6,8};
         // second way of initalizing array 
         int arr2[] = new int[3];
         arr2[0]=10;
         arr2[1]=20;
         arr2[2]=30;
         // String use .length() to print length of string , but array has it own properties so, just it need .length
         // Because we never call properties using () only function are called using fun1().
         // In java array cannot be printed by their variable name, it need to be printed by index number of each element
         System.out.println("Non-Primitive Data types :: "+ arr.length);
         System.out.println("Non-Primitive Data types :: "+ arr2.length);
         System.out.println("Non-Primitive Data types :: "+ arr2[2]);
         
         // Two dimensional array
         int twoDarr[][]= {{1,3,5,7}, {2,4,6,8}};
         System.out.println("Two Dimensional Array: "+twoDarr[1][1]);
         */

        /*
        //  How to take INPUT's
        // To take input we need java utils called Scanner
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Emp Id: ");
        int id = sc.nextInt();
        System.out.println("Employee ID "+ id);
        
        // float 
        System.out.println("Enter your CGPA ");
        float cgpa = sc.nextFloat();
        System.out.println("Your CGPA is "+cgpa);
        
        // String
        System.out.println("Enter your name: ");
        // this below next() fun takes only one word token
        String empName = sc.next();
        System.out.println("Your Name is " + empName);
        
        // This fun nextLine() can take string sentence;
        System.out.println("Enter your Bio: ");
        String bio = sc.nextLine();
        System.out.println("Employee Bio "+bio);
        */
    }
}
