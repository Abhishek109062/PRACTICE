import java.util.Arrays;
import java.util.Comparator;

public class com {
    public static void main(String[] args) {
        int ar[][] = {{10,2},{3,-9}};

        Arrays.sort(ar, new Comparator<int[]>() {
            public int compare(int a[], int b[]){
                return Integer.compare(a[0],b[0]);
            }
        });
        for(int i[] : ar){
            for(int j: i)
            System.out.print(j + " ");
            System.out.println();
        }
    }
}
