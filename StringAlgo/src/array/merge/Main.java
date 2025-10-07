package array.merge;

public class Main {

    // Exemple : [1,3,5] et [2,4,6] → [1,2,3,4,5,6]
    public static void main(String[] args) {

        int [] array1 = new int[]{1,3,5};
        int [] array2 = new int[]{2,4,6};
        int [] merge = mergeSorted(array1, array2);

        for (int i = 0; i < merge.length; i++) {
            System.out.print(" " + merge[i]);
        }

    }

    private static int[] mergeSorted(int[] a, int[] b) {
        int [] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) result[k++]=a[i++];
            else result[k++]=b[j++];
        }

        while(i < a.length) result[k++]=a[i++];
        while(j < b.length) result[k++]=b[j++];

        return result;
    }
}
