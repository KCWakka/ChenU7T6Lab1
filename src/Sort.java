import java.util.ArrayList;

public class Sort {

    // PART A. implementing selection sort
    public static void selectionSort(int[] elements) {
        // TODO: Part A: implement me
        for (int i = 0; i < elements.length - 1; i++) {
            int min = i;
            for (int f = i + 1; f < elements.length; f++) {
                int value = elements[f];
                if (value < elements[min]) {
                    min = f;
                }
            }
            int temp = elements[i];
            elements[i] = elements[min];
            elements[min] = temp;
        }
    }

    // PART B. sorting a 1000-word list
    public static void selectionSortWordList(ArrayList<String> words) {
        // TODO: Part B: implement me
        for (int i = 0; i < words.size()- 1; i++) {
            int min = i;
            for (int f = i + 1; f < words.size(); f++) {
                String value = words.get(f);
                if (value.compareTo(words.get(min)) < 0) {
                    min = f;
                }
            }
            words.set(i, words.set(min, words.get(i)));
        }
    }
}
