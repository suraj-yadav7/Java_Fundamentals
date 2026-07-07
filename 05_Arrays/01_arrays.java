/** ARRAYS */
/** In Java, an array is a container object that holds a fixed number of elements of a single data type stored in contiguous memory locations.
 * It allows you to store multiple values under a single variable name instead of declaring separate variables for each value */
class arrays{
  public static void main(String[] args){
    //Direct assignment of value
    int[] price ;
    price = new int[3];
    price[0] =11;
    price[1] =45;
    price[2] =33;
    System.out.println("Price Array: "+ price);

    //assign and access using for loop
    int[] rollNumber = new int[5];
    int num = 21;
    for(int i=0; i<rollNumber.length; i++){
      rollNumber[i] = num;
      num++;
    }

    for(int j=0; j<rollNumber.length; j++){
      System.out.println("RollNo: "+ rollNumber[j]);
    }
  }
}