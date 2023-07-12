package arithmetic;

public class Factorial {
	       public static void main(String [] agrs)
              {
                int num=5;
                  long factorial = facNumber(num);
                  System.out.println("Factorial of " + num + "=" + factorial);
            } 
        public static long facNumber(int num)
         {
             if(num>=1)
                 return num* facNumber(num-1);
              else
                    return 1;
            }
}     


