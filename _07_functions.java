public class _07_functions {
    
    static void greetUser(){
        System.out.println("Hi developer, Keep learning and growing");
    }

    public static int sum(int a, int b){
        int result = a+b;
        return result;
    }
    
    public static void main(String args[]){
        greetUser();
        // Can be called like below one also
        _07_functions.greetUser();
        int result =sum(10,20);
        System.out.println("Addition of two number "+result);
    }
}


