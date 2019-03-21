package Recursion;

public class sum_of_integer {
    public static int sum(int num)
    {
        if(num<=9)
        {
           return num;
        }
        else
        {
            return num % 10 +sum(num/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(657));
    }
}
