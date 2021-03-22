package booleanpack;

public class boo {

    public static void main(String[] args) {
        boo rv = new boo();
        System.out.println("op is " + rv.isBoolean(1211));
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
}