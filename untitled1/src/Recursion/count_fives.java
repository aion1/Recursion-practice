package Recursion;

public class count_fives {
    public static int count5(int num)
    {
        if (num<=9)
        {
            if (num==5) return 1;
            else return 0;
        }
        else
        {
            if (num%10==5) return 1+count5(num/10);
            else return 0+count5(num/10);
        }
    }
    public static void main(String[] args) {
        System.out.println("the number of fives in this integer is: "+count5(125535));
    }
}
