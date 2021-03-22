package booleanpack;

public class Boolean {

    public static void main(String[] args) {
        Boolean rv = new Boolean();
        System.out.println("op is " + rv.isBoolean(1211) + "\n");
        //another method to find bin no.
        rv.isBinaryOrNot(111);
    }

    private boolean isBoolean(int num) {

        //if statement -> to check wether the number is single digit 0 or 1 or number < 0 (negative number)
        if (num == 0 || num == 1 || num < 0) {
            System.out.println("Enter a valid binary number ");
            return false;
        }

        //while -> to check/loop until num!=0 to verify each and every digit checked.
        while (num != 0) {

            //if -> to find the remainder of num by dividing it with 10
            //and return false if it is >1

            //Dividing binary number with 10 will only give either 0 or 1 as a remainder
            //so if num != 0 or 1 then definitely it is not a binary number

            //or to say in other word ' num % 10 ' will give last digit of the number
            // eg : if a number 1234
            //then ' num % 10 ' gives ' 4 ' which is the last number of 1234
            if (num % 10 > 1) {
                return false;
            }

            //num = num / 10;
            // -> used to omit last digit of the number
            // eg: 12345 will become 1234 after num/10
            num = num / 10;
        }
        return true;
    }

    private void isBinaryOrNot(int number) {
        boolean isBinary = true;

        int copyOfNumber = number;

        while (copyOfNumber != 0) {
            int temp = copyOfNumber % 10;   //Gives last digit of the number

            if (temp > 1) {
                isBinary = false;
                break;
            } else {
                copyOfNumber = copyOfNumber / 10;    //Removes last digit from the number
            }
        }

        if (isBinary) {
            System.out.println(number + " is a binary number");
        } else {
            System.out.println(number + " is not a binary number");
        }
    }
}