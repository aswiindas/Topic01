package src.arrays;

public class LargestInArray {
    // finding second largest number.
    public static void main(String[] args) {
        int[] numArray ={4,5,7,2,9,3,1};

        System.out.println("The second Largest number is: "+findLargestInArray(numArray));
        System.out.println("The second smallest number is: "+findSmallestInArray(numArray));
    }

    private static int findLargestInArray(int[] numArray) {
        int largest =0;
        int secondLargest=0;
        for(int i=0;i<numArray.length;i++){
            if(numArray[i]> largest){
                largest =numArray[i];
            }
            if(numArray[i]<largest &&numArray[i]>secondLargest){
                int temp=largest;
                secondLargest=largest;
                largest=numArray[i];
            }
        }
        return secondLargest;
    }
    private static int findSmallestInArray(int[] numArray) {
        int smallest =Integer.MAX_VALUE;
        int secondSmallest =Integer.MAX_VALUE;
        for(int i=0;i<numArray.length;i++){
            if(numArray[i]< smallest){
                smallest =numArray[i];
            }
            if(numArray[i]>smallest &&numArray[i]< secondSmallest){
                int temp=smallest;
                secondSmallest =smallest;
                smallest=numArray[i];
            }
        }
        return secondSmallest;
    }
}
