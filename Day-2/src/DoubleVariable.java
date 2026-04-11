public class DoubleVariable {
    public static void main(String[] args) {
        double FirstValue = 20.00;
        double SecondValue = 80.00d;
        double ValueTotal = (FirstValue + SecondValue) * 100.00d;
        System.out.println("ValueTotal=" + ValueTotal);
        double theRemainder = ValueTotal % 40.00;
        System.out.println("theRemainder=" + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder=" + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some Remainder");
        }
    }
}
