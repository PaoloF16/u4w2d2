import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class es02 {

    public static void main(String[] args) {

        orderedList(7);

        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(5, 6, 8, 7, 9, 1, 2));

        randomList(listOfNumbers);

        oddOrEvenList(listOfNumbers, true);
        System.out.println();
        oddOrEvenList(listOfNumbers, false);

    }

    static void orderedList(int num) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            int randomNumber = random.nextInt(101);
            listOfNumbers.add(randomNumber);
        }

        System.out.println(listOfNumbers);
    }

    static void randomList(ArrayList<Integer> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }

    static void oddOrEvenList(ArrayList<Integer> list, boolean value) {

        for (int i = 0; i < list.size(); i++) {

            int num = list.get(i);

            if (value && num % 2 == 0) {
                System.out.println(num);

            } else if (!value && num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
