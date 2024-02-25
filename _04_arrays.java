import java.util.Scanner;

public class _04_arrays {
    public static void main(String[] args){
        // One dimension array or 1D Array
        int arr[] ={2,4,6,8,10};
        System.out.println("Singel dimensional Array : "+ arr[3]);

        // Two dimensional array or 2D array
        int arr2[][]={{1,3,5,7,9}, {0,5,10,15,20},{2,4,6,8,10}};
        System.out.println("Two dimensional array: "+ arr2[2][3]);

        // Three Dimensional array or 3D array
        int arr3[][][] ={{{3,6,9,12,15},{2,4,6,8,10}}, {{4,8,12,16,20},{5,10,15,20,25}}};
        System.out.println("Three dimensional array: "+ arr3[1][0][3]);

        // Dynamic array
        Scanner scan = new Scanner(System.in);
        /*
         System.out.println("Enter size of array: ");
         int size = scan.nextInt();
         int dynamicArr[] = new int[size];
         System.out.println("Length of array: "+dynamicArr.length);
         */

        // 2D array dynamic input from user
        /*
        System.out.println("Enter row size: ");
        int rsize = scan.nextInt();
        System.out.println("Enter column size: ");
        int csize = scan.nextInt();
        int twodArr[][] = new int[rsize][csize];
        for(int i=0; i<twodArr.length;i++){
            for(int j=0; j<twodArr.length; j++){
                System.out.println("arr val: ");
                twodArr[i][j]=scan.nextInt();
            }
        }
        for(int i=0; i<twodArr.length; i++){
            for(int j=0; j<twodArr.length; j++){
                System.out.println(j+ " val "+twodArr[i][j]);
            }
        }
        */

        // Jagged Array
        // In it rows are fixed but columns are not fixed
        int jaggedArray[][] = new int[2][];
        jaggedArray[0] = new int[]{2,4,6};
        jaggedArray[1] = new int[]{1,3};
        System.out.println("length : "+ jaggedArray.length);
        System.out.println("Jagged Array Val : "+jaggedArray[0][2]);
        System.out.println("Jagged Array Val : "+jaggedArray[1][1]);

        
    }
}
