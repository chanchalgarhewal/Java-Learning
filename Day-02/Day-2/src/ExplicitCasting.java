public class ExplicitCasting {
    public static  void main(String[] args ){
        double pi= 3.14159;
        int whole=(int)pi;
        long bigNum=3_000_000_000L;
        int corrupted=(int)bigNum;
        System.out.println("whole:"+whole);
        System.out.println("corrupted:"+corrupted);
    }
}
