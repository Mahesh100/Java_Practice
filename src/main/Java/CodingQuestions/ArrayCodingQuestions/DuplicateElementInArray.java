
package CodingQuestions.ArrayCodingQuestions;

public class DuplicateElementInArray {

    public static void main(String [] args){
        int[] inputArray = {1,2,3,4,5,5,6,6};

        for(int i=0; i<inputArray.length; i++){
            for(int j=i+1; j<inputArray.length; j++){
                if(inputArray[i] == inputArray[j]){
                    System.out.println("Duplicate element is :"+inputArray[i]);
                }
            }
        }
    }

}
