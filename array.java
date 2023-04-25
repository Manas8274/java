import java.util.Arrays;
import java.util.List;

public class array {

    public static void print(List<? super Integer> list) {

        for (Object n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        List<Integer> x = Arrays.asList(5.0, 10, 15);
        print(x);

    }


    public static void main(String[] args) {

        List<Integer> x = Arrays.asList(5.0, 10, 15);
        print(x);

    }


}
