public class ArrayCC{
    public static int trappedwater(int number []){
        int n= number.length;
        //calculate the  left maximum boundary -array
        int leftmax []= new int [n];
        leftmax[0]=number[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(number[i], leftmax[i-1]);
        }
        //calculate the right maximum boundary- array2
        int rightmax []= new int [n];
        rightmax[n-1]= number[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]= Math.max(number[i],rightmax[i+1]);
        }
        //loop
        int trappedrainwater=0;
        for(int i=0;i<n;i++){
        // Water level=minumum of left max boundary and right max boundary 

            int water = Math.min(leftmax[i],rightmax[i]);
        // trapped water = water level - hieght of that level

            trappedrainwater+= water - number[i];
        }
        return trappedrainwater;
    }
    public static void main(String args[]){
        int number []={3,4,2,6,2,1,0};
        System.out.println("your trapped water is :"+trappedwater(number));
    }
}