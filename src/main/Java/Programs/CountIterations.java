package Programs;

public class CountIterations {

    public static int count(int n)
    {
        int count =0;

        for(int i=0; i<n; i++)

        {
            for(int j=i; j>0; j--)
            {
                count = count+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountIterations.count(2));
    }
}
