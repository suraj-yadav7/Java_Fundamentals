public class _03_operators{
    public static void main(String[] args){
        //  Types of Operators

        /*
         
        // Airthmetic operators
        // =. -, *, /, %
        int a = 5;
        int b=3;
        int sum = a+b;
        int diff = a-b;
        int div = a/b;
        int mod=a%b;
        // System.out.println("Arithmetic operations: " +mod);
        */
        
        /*
        // Urnary Operator
        // -(operand), +(operand), (operand)++, (operand)--, !
        int num = 7;
        System.out.println("Urnary Operator post increment " + (num)++);
        System.out.println("Urnary Operator value: " + (num));
        System.out.println("Urnary Operator  pre-decrement " + --(num));
        */

        /*
        // Comparsion Operator
        // ==, <=, >=
        int x = 45;
        int y=32;
        System.out.println("Comparsion operator ");
        // Equal
        if(x==y){
            System.out.println("Numbers are equal");
        }
        else{
            System.out.println("Number is not equal");
        }
        
        // Greater
        if(x>y)
        System.out.println("Num X is greater " +x);
        else
        System.out.println("Num Y in smaller" + y);
        */

        // Logical Operator
        // &&, ||, !
        int a = 5;
        int b=3;
        int c=8;
        boolean focus = true;

        if(a>b && a<c)
            System.out.println("A pass the condition");
        else
            System.out.println("X fails the condition");

        // ! not means negative
        if(!focus)
            System.out.println("He is Focused");
        else
            System.out.println("He is Not Focused");
        
    }
}
