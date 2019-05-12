import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class PhoneBook {
    public static void main(String[] args) {

        Book book = new Book();

        book.add("Name 1", 11111111);
        book.add("Name 2", 22222222);
        book.add("Name 3", 33333333);
        book.add("Name 4", 44444444);
        book.add("Name 5", 55555555);
        book.add("Name 1", 66666666);
        book.add("Name 1", 77777777);
        book.add("Name 3", 88888888);

        book.get("Name 1");
        book.get("Name 2");
        book.get("Nobody");

    }
}

class Book {

    HashMap<String, List<Integer>> book = new HashMap<String, List<Integer>>();

    public void add(String name, int number) {
        if (!book.containsKey(name)) {
            book.put(name, new ArrayList<Integer>());
        }
        book.get(name).add(number);
    }

    public void get(String name) {
        if (book.containsKey(name)) {
            List<Integer> phones = book.get(name);
            System.out.println(name + " : " + phones);
        } else {
            System.out.println("Фамилия не найдена");
        }
    }
}
