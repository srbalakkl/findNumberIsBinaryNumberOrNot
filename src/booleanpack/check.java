package booleanpack;

public class check {

    public static void main(String[] args) {
        check rv = new check();
        System.out.println("op is " + rv.isBoolean(1211)+"\n");
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
            if (num % 10 == 0 || num % 10 == 1) {
                return true;
            }
            num = num / 10;
        }
        return false;
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
