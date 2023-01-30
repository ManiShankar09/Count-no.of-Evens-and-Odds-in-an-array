public class counts {
    static void countEvensOdds(int[] arr){
        //Take even count as 0
        int evens = 0;
        //Take Odd count as 0
        int odds  = 0;
        //Iterate the arr using for loop
        for(int i = 0; i < arr.length; i++){
            //if the value in the arry remains 0 the even count increses 1
            if(arr[i] % 2 == 0) evens++;
            else odds++;

        }
        System.out.println("No of Evens" + " "+ evens);
        System.out.println("No of Odds"+" "+ odds);
    }
    public static void main(String[] args) {
        int[] arr = {1,8,7,4,5,32,4,8,55,14,54};
        //Calling the function
        countEvensOdds(arr);            //Output: No of Evens 7 No of Odds 4
                                                
    }
}
