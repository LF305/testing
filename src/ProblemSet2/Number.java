package ProblemSet2;
public class Number {
    public static void main(String[] args) throws Exception {
        int[] arr = {5,1,9,5,7};
        int smallest = arr[0];
        for(int number=1; number<arr.length; number++){
            if(arr[number] < smallest){
       smallest = arr[number];   
       } 
    }
    System.out.println(smallest);
    }
}