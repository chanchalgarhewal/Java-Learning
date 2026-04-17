public class MaxElement{
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 4};
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element is:"+max);
        }
    }

