public class WeekdayWeekend {
    public static void main(String[] args) {
        int day=6;
        switch (day){
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            case 1: case 2: case 3:
            case 4: case 5:

                System.out.println("Weekday");
                break;
        }
    }
}
