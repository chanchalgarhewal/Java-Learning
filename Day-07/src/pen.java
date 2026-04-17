public class pen {

        String color;
        String type;

        pen() {
            color = "Blue";
            type = "ballpoint";
        }
        void display() {
            System.out.println(color + " " + type + "pen");
        }
        public static void main(String[] args){
            pen p = new pen();
            p.display();
        }

        }


