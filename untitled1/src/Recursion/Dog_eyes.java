//sending the number of dogs it will return the number of total_eyes(knowing that each dog is having two eyes)

package Recursion;

public class Dog_eyes {
    public static int total_dog_eye(int num_of_dogs)
    {
        if (num_of_dogs==0)
        {
            return 0;
        }
        else
        {
            return 2+total_dog_eye(num_of_dogs-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("the total number of eyes for 10 dogs: "+total_dog_eye(10));
    }
}
