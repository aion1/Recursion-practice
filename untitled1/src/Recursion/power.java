//finding the power of any integer using recursion
package Recursion;

public class power {
    public static int powerresult(int base,int num)
    {
            if(num==1)
            {
                return base;
            }
            else
            {
                return base*powerresult(base,num-1);
            }

    }
    public static void main(String[] args) {
     System.out.println( powerresult(2,10));
    }
}
