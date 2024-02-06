public class Test7 {
    public static void main(String[] args){
        //Created by Dallin Lyman
        // Create an array of size 100 and the total int
        int[] num = new int[100];
        int tot = 0;
        // Fill the array with numbers 1 to 100 using a for loop and add to 
        for (int i = 0; i < 100; i++) {
            num[i] = i + 1;
            tot = tot + i;
        }
        // Print each number along with whether it's even or odd
        for (int nump : num) {
            System.out.print(nump);
            if(nump%2==0){
                System.out.println(" even");
            } else{
                System.out.println(" odd");
            }
            //once at 100, print the total
        for(tot+=1;nump==100;nump=0){
            System.out.print(tot);
            System.out.println(" total");
        }    
        }
    }
}
