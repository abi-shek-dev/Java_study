import java.util.*;

public class second_in_array {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int[] arr = new int[x];

        for (int i =0; i < x; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        System.out.println(arr[1] + " " + arr[arr.length -2 ]);

        sc.close();

    }

}
