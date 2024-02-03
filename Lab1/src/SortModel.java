import java.util.Random;

public class SortModel {
    private int[] array;

    public SortModel(int size) {
        this.array = generateRandomArray(size);
    }

    private int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20) + 1;
        }
        return array;
    }

    public int[] getArray() {
        return array;
    }
}
