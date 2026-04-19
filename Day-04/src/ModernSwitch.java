public class ModernSwitch {
    public static void main(String[] args){
        int day=3;
        String type =switch ( day ){
            case 6,7-> "weekend";
            case 1,2,3,4,5-> {
                    String msg = "Weekday" ;
                yield msg;
                }
            default->"Invalid";
            };
        System.out.println("Daytype:"+type);

        }
    }

