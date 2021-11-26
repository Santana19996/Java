public class Main {
    public static  void main(String[] args){


        int myValue = 10000;

        int myMinIntValue =  Integer.MIN_VALUE;
        int MyMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + MyMaxValue);
        System.out.println("Busted Max Value= " + (MyMaxValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteVALUE = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value" + myMinByteValue);
        System.out.println("Byte Maximum Value" + myMaxByteVALUE);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortVALUE = Short.MAX_VALUE;
        System.out.println("Short Minimum Value" + myMinShortValue);
        System.out.println("Short Maximum Value" + myMaxShortVALUE);


        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongVALUE = Long.MAX_VALUE;
        System.out.println("Long Minimum Value" + myMinLongValue);
        System.out.println("Long Maximum Value" + myMaxLongVALUE);


        byte MyByte = 12;
        short MyShort = 300;
        int MyInt = 6000;

        long MyLong = 50000L + 10 * (MyByte + MyShort);
        System.out.println(MyLong);

        int Pounds  = 240;
        double Result = Pounds * 0.4535923;
        System.out.println(Result);

        char myChar = 'D';


        double var1 = 20.00;
        double var2 = 80.00;
        double var3 = (var1 + var2) *100.00;
        double theRemainder = var3 % 40.00;
        boolean isTheRemainderZero = theRemainder == 0;
        System.out.println(isTheRemainderZero);
        if(!isTheRemainderZero){
            System.out.println("Got Some Remainder");
        }
    }




}


