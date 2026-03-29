public class MedianTwoArrays {
    public static void main(String[] args) {
        int a[] = {1, 3};
        int b[] = {2};
        int n1 = a.length;
        int n2 = b.length;
        int merged[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }
        while (i < n1) {
            merged[k++] = a[i++];
        }

        while (j < n2) {
            merged[k++] = b[j++];
        }

        int n = merged.length;
        if (n % 2 == 1) {
            System.out.println("Median = " + merged[n / 2]);
        } else {
            double median = (merged[n / 2] + merged[n / 2 - 1]) / 2.0;
            System.out.println("Median = " + median);
        }
    }
}