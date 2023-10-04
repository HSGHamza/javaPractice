public class Merge {
    public static void main(String[] args) {
        System.out.println("HSG");
        int arr[] = {1, 5, 3, 6, 2, 4};
        int n = arr.length;
        divide(0, n - 1, arr);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void divide(int si, int ei, int[] arr) {
        if (si >= ei) {
            return;
        }

        int mid = (si + ei) / 2;

        divide(si, mid, arr);
        divide(mid + 1, ei, arr);
        conquer(arr, si, ei, mid);
    }

    public static void conquer(int[] arr, int si, int ei, int mid) {
        int merged[] = new int[ei - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;

        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }

        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }
        while (indx2 <= ei) {
            merged[x++] = arr[indx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}
