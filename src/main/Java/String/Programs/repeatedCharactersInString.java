package String.Programs;

public class repeatedCharactersInString {

    public static void main(String[] args) {

        String str = "Mahesh";
        int count =0;
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            for(int j=i+1; j<ch.length; j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.println("Duplicate Character from string is:"+ ch[j]);
                    count++;
                }
            }
        }

        System.out.println("Repeated Occurrence is:"+count);
    }
}
