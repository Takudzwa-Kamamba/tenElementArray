public class tenElement {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = 9 - i;
        }

        System.out.println("Array elements:");
        for (int numb : array) {
            System.out.println(numb);
        }
    }
}

