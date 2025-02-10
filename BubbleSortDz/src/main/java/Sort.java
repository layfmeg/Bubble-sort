
    import java.util.Arrays;
    public class Sort {
        public static void main(String[] args) {
            int[] array = {3, 0, 2, 0, 4, 5};

            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        isSorted = false;
                    }
                }
            }
            System.out.println("Массив" + Arrays.toString(array));
        }
}
