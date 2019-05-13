import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {

        String[] mass = new String[] {"a", "b", "c", "d", "e", "f", "b", "c", "c", "e", "e", "e"};

        System.out.println("Начальный массив :");
        System.out.println(Arrays.toString(mass));
        System.out.println();

//        -------вывести список уникальных слов
//        Set<String> unique = new HashSet<String>();
//        for (String s: mass) {
//            unique.add(s);
//        }
//
//        System.out.println("Уникальные слова :");
//        System.out.println(unique);
//        ---------------------------------------

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (int i = 0; i < mass.length; i++) {
            Integer res = hm.get(mass[i]);
            hm.put(mass[i],res == null ? 1 : res + 1);
        }

        /* -- Список уникальных слов -- */
        System.out.println("Список уникальных слов");
        System.out.println(hm.keySet());
        System.out.println();

        /*  -- количество повторений слов --  */
        System.out.println("Количество повторений слов");
        System.out.println(hm);


    }
}
