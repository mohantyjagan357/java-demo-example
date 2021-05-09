package example;

public class MissingElement {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,4,5};
        //int sum = 0;
        int total = n*(n+1)/2;
//        for (int i = 0; i<n-1; i++)
//            sum += arr[i];
//        System.out.println(total-sum);
        for (int x : arr)
            total -= x;
        System.out.println(total);

    }
}
