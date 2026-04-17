public class Main {
    public static void main(String[] args){
        int arr[]={2,6,7,8,9};
        int max=arr[0];
        int i=1;
        while(i<5) {
            if (arr[i] > max) {
                max = arr[i];
            }
                i++;

        }
            System.out.println("Maximum element is:"+max);


        }
    }

