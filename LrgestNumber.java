public class LrgestNumber {
    public static void main(String args[]){
        int[] c = {205,38,57,101,159,195,210};
        int a = c[0];
        for(int i = 1;i<c.length;i++){
            if(c[i]>a){
             a=c[i];
            }
        }
        System.out.println("LargestNumber " + a);
    }
}


