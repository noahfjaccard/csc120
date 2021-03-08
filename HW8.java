public class HW8
{
  public static void main(String[] args)
  {
    int[] numbers = {1,2,3,4,5,6,7,7,8,9,10};
    System.out.println(duplicateCheck(numbers));
  }
  public static Boolean duplicateCheck(int[] numbers)
  {
    for(int i = 0; i < numbers.length; i++)
    {
      for(int j = i+1; j < numbers.length; j++)
      {
        if(i != j && numbers[i] == numbers[j])
        {
          return true;
        }
      }
    }
    return false;
  }
}
