package Recursion;

public class printnumbers {
    public static void print_numbers(int num)
    {
        if (num==0) //checking if the number is equal to zero?! (in the first,sec,third,fourth,fifth,....,tenth) this case will not be satisfied
        {
            return;
        }
        else // so it will print the number and call again for the function but with (num-1)
        {
            System.out.println(num);
            print_numbers(num-1);
        }
    }

    public static void main(String[] args) {
            print_numbers(10);//the parameter passed is 10 so num now =10
    }
}
