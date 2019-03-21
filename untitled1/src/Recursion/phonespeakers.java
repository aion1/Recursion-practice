/*
calculate the number of speakers in n number of phones if the even number of phones is having 2 speakers
and the odd number is having 1 speaker i.e(if the number of phones is 3)
{
    so we have 1+2+1 speakers
}
*/
package Recursion;

public class phonespeakers {
    public static int speakers_no(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num%2==0){
            return 2+speakers_no(num-1);
        }
        else
            {
                return 1+speakers_no(num-1);
            }
    }
    public static void main(String[] args) {
        System.out.println("the number of speakers are: "+speakers_no(3));
    }
}
