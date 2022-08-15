import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                list1.add(i);
            }
        }
        System.out.println("List 1" + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int j = 1; j <= 50; j++) {
            if (j % 2 != 0) {
                list2.add(j);
            }
        }
        System.out.println("List 2" + list2);
    }
}