public class HW9
{
  public static void main(String[] args)
  {
    double[][] inArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };

    System.out.println(transpose(inArray));
  }
  public static double[][] convolution(double[] inArray)
  {
    double[][] array = new double[inArray.length][inArray.length];
    for(int i = 0; i < inArray.length; i++)
    {
      for(int j = 0; i < inArray.length; i++)
      {
        array[i][j] = inArray[i] * inArray[j];
      }
    }
    return array;
  }
  public static double[][] transpose(double[][] inArray)
  {
    double[][] M = new double[inArray[0].length][inArray.length];
    for(int i = 0; i < (inArray[0].length); i++)
    {
      for(int j = 0; j < inArray.length; j++)
      {
        M[i][j] = inArray[j][i];
      }
    }
    return M;
  }
}
