/** 2D ARRAY */
/** In Java, a two-dimensional (2D) array is essentially an array of arrays that stores data in a grid or tabular format
 * consisting of rows and columns. It is highly useful for managing matrices, maps, grids, or coordinate systems. */

class twoDimensionArray{
  public static void main(String[] args) {
    int[][] marks = new int[3][]; //row[3], col[] is optional
    marks[0] = new int[2];
    marks[1] = new int[4];
    marks[2] = new int[3];

    int a = 31;
    // Assign the value
    for(int i=0; i<marks.length; i++){
      for(int j=0; j<marks[i].length; j++){
        marks[i][j] = a;
        a++;
      }
    }

    // Access the value
    for(int i=0; i<marks.length; i++){
      for(int j=0; j<marks[i].length; j++){
        System.out.println("Outer Array: "+ marks[i]);
        System.out.println("Inner Marks: "+ marks[i][j]);
      }
    }
  }
}