package String.Programs;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};

        int[] arr2 = {5,4,6,7};

        //common element is 4 at index 1 and 3

        for(int i=0; i<arr1.length; i++)
        {
            for(int j=1;j<arr2.length; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println("Common element is:"+arr2[j]);
                }
            }
        }
    }
}
