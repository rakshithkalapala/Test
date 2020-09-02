import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] newArray = readIntegers(count);
        System.out.println(Arrays.toString(newArray));
        reverse(newArray);
        System.out.println("new array is :" +Arrays.toString(newArray));


    }
    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i=0;i<array.length;i++){
            System.out.println("enter number");
            int number = scanner.nextInt();
            array[i] = number;
            scanner.nextLine();
        }
        return array;
    }
    private static void reverse(int [] array){
        int max = array.length-1;
        int half = array.length/2;
        for (int i=0;i<half;i++){
            int temp =array[i];
            array[i]=array[max-i];
            array[max-i]=temp;
        }

    }
}