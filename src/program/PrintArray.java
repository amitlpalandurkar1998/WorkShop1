package program;
//Java Program to print the sum of all the items of the array
public class PrintArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,1,2,2};

        int sum = 0;
            for (int i=0; i< array.length; i++){
                sum+=array[i];
        }
        System.out.printf(" The sum of all the items of the arrayis is"+sum);
    }
}
