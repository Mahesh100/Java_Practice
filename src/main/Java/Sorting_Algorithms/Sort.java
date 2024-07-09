import java.util.Arrays;
class Sort{
    void sort(int arr[]){
//        int n = arr.length;
//                System.out.println(n);

        Arrays.sort(arr);

        System.out.println("Sorted array is :" + Arrays.toString(arr));
    }
    public static void main(String [] args){
        Sort s = new Sort();
        int arr[] = {1,2,3};
        s.sort(arr);
    }
}