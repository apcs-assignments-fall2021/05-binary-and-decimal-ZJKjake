import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int sum=0;
        int x=Integer.parseInt(binary);

        for (int i=0;i<binary.length();i++){
            int last=x % 10;
            //System.out.print(last + " ");
            sum+=(last*((int)Math.pow(2, i)));

            //System.out.println(last*((int)Math.pow(2, i)));
            x=x/10;
        }
        return sum;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        String result="";
        String result2="";
        int last = decimal;
        int loop=1;
        while (decimal>=(int) Math.pow(2,loop)){
            loop+=1;
        }
        for (int i=0;i<loop ;i++) {

            //System.out.println(last);
            String x = Integer.toString(last%2);

            result +=x;
            last=last/2;
            //System.out.println(last);
        }

        for(int i=0;i<result.length();i++){
            result2+=result.charAt(result.length()-i-1);
        }
        return result2;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number in binary form!");
        String x=scan.nextLine();
        System.out.println("This is equal to the decimal value:"+binaryToDecimal(x));
        System.out.println("Now please write a number in decimal form!");
        int y=scan.nextInt();
        System.out.println("This is equal to the binary value:"+decimalToBinary(y));
    }
    }

