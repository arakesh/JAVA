public class TapeEquilibrium {

    public static void main(String args[])
    {

         int [] numbers1 = {1,5,3,4,9};
         int [] numbers2 = {10, 4, 6, 7};

         System.out.println(minDiff(numbers1));
        System.out.println(minDiff(numbers2));

    }

    public static int minDiff(int[] numbers)
    {

        int sumLeft = numbers[0];
        int sumRight = sum(1, numbers.length, numbers);
        int minDiff = Math.abs(sumLeft - sumRight);
        for( int i = 1; i < numbers.length; i++)
        {

            sumLeft +=numbers[i];
            sumRight -=numbers[i];
          int diff = Math.abs(sumLeft - sumRight);
          if (minDiff > diff)
          {
              minDiff = diff;
          }
        }
        return minDiff;
    }

    private static int sum(int start, int end, int[] numbers)
    {
        int sumVaue = 0;
        for (int i = start ; i < end; i++)
        {
            sumVaue += numbers[i];
        }
        return sumVaue;
    }

}
