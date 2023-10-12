package test;


//I/P : [1,-1,-2,0,4,0,5,6,8,9]
//        O/p : [-1,-2,0,0,1,4,5,6,8,9]
//
//        Arrange the list such that it follows the order <-ve elements><zeros><+ve elements>
//
//        TC - 0(N)
//        SC - O(1)


public class Test {

    public static void main(String args[]) {
        int arr[] = new int[]{1,-1,-2,0,4,0,5,6,8,9};
        int index = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        for(int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
