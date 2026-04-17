public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 7, 8};
        int largest = arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
            if (arr[i] > largest) {
                secondLargest=largest;
                largest = arr[i];

            } else if(arr[i]>secondLargest && arr[i]!=largest) {
                secondLargest=arr[i];

            }
        }
        System.out.println("Largest element is:" + largest);
        System.out.println(" Second Largest element is:" + secondLargest);
    }

}
