class Main {
    public static void main(String[] args) {

    }

    public static int dups(int[] array, int n) {

        /**
         *         Wklej to do maina dla testu
         *         int[] test = {1, 2, 5, 5, 6, 6, 7, 2};
         *         System.out.println(dups(test, 0));
         */



        int g = n; // int z parametru
        int[] intArray = new int[array.length]; // array z parametru
        System.arraycopy(array, 0, intArray, 0, array.length);
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if ((intArray[i] == intArray[j]) && (i != j)) {
                    g = 1;
                    System.out.println("To jest duplikat " + intArray[j]);
                    return 1; // g == 1 when it is duplicate
                }
            }
        }
        return 0; // if there is no duplicate
    }
}