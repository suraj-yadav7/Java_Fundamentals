/** 3D/MultiDimensional ARRAY */
/** A three-dimensional (3D) or multidimension array in Java is essentially an array of arrays of n-arrays.
 * It is best visualized as a cube or a book of grids,where you have multiple blocks(layers) and each block contains rows and columns. */

class multiDimensionArray{
  public static void main(String[] args) {
    int[][][] marks = new int[2][][]; //row[2], col[] is optional

    //first 2d array
    marks[0] = new int[2][];
    marks[0][0] = new int[3];
    marks[0][1] = new int[2];

    //second 2d array
    marks[1] = new int[1][];
    marks[1][0] = new int[4];

    int val = 1;
    // Assign the value
    for(int i=0; i<marks.length; i++){
      for(int j=0; j<marks[i].length; j++){
        {
          for(int k=0; k<marks[i][j].length; k++){
            marks[i][j][k] = val;
            val++;
          }
        }
      }
    }

    for(int i=0; i<marks.length; i++){
      for(int j=0; j<marks[i].length; j++){
        {
            System.out.println("2D array val: "+ marks[i][j]);
          for(int k=0; k<marks[i][j].length; k++){
            System.out.println("3D array val: "+ marks[i][j][k]);
          }
        }
      }
    }
  }
}