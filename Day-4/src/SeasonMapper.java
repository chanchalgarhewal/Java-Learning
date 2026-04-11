public class SeasonMapper {
    public static void main(String[] args){
        String month="March";
        switch (month){
            case "March": case "April": case "May":
                System.out.println("Spring");
                break;
            case "june": case "july": case "August":
                System.out.println("Summer");
                break;
            case "September": case "October": case "November":
                System.out.println("Autumn");
                break;
            case "December": case "January": case "February":
                System.out.println("Winter");
                break;

            default:
                System.out.println("Other season");
        }
    }

}
