package Programs;

public class CountDigits2 {

    public static int countDigits(int num)
    {
        int result =0;

        String str = Integer.toString(num);


        //  int numLength = str.length();

        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length-1; i++)
        {
            for(int j=i+1; j<ch.length; j++)
            {
                if(ch[i] == ch[j] && num % ch[j]==0)

                {
                    while(num>0)
                    {
                        num = num/10;
                        result++;
                    }
                }
            }


        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(CountDigits2.countDigits(121));
    }
}


//class Solution
//{
//
//}
