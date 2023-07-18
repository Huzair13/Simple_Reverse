import java.util.Scanner;

public class SimpleReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the String to reverse !!! ");
        String string=scanner.next();

        String reversed=simpleReverse(string);
        System.out.println(reversed);
    }

    private static String simpleReverse(String string) {
        char stringArray[] = string.toCharArray();

        int start=0;
        int end=string.length()-1;
        while(start<=end){
            char temp=stringArray[start];
            stringArray[start]=stringArray[end];
            stringArray[end]=temp;
            start++;
            end--;
        }
        return new String(stringArray);
    }
}