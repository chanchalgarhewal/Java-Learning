public class NestedSwitch {
    public static void main(String[] args) {
        int year = 2;
        String branch = "CSE";

        switch (year) {
            case 1:
                System.out.println("Common foundation courses");
                break;
            case 2:
                switch (branch) {
                    case "CSE":
                        System.out.println("Data Structures & OOP");
                        break;
                    case "ECE":
                        System.out.println("Digital Electronics");
                        break;
                    default:
                        System.out.println("General courses");
                }
                break;
            default:
                System.out.println("Advanced courses");
        }
    }
}