public class ReverseArray {
    public static void main(String[] args){
        int arr[]={3,4,5,6,7};
        int left=0;
        int right=5-1;
        while(left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reversed array:");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
