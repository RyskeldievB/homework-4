import com.sun.source.doctree.IndexTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();

        System.out.println("Введите слово: ");

        for (int i = 0; i < 5; i++) {
            a.add(scanner.nextLine());
        }
        System.out.println(a);

        ArrayList<String> b = new ArrayList<>();

        System.out.println("Ведите слово: ");

        for (int i = 0; i < 5; i++) {
            b.add(scanner.nextLine());
        }

        System.out.println(b);

        Collections.reverse(b);

        ArrayList<String> c = new ArrayList<>();

        Integer x = 0;

        while(c.size() < a.size() + b.size()){
        c.add(a.get(x));
        c.add(b.get(x));
        x++;
        }

        System.out.println(c);

        c.add(a.get(0));
        c.add(b.get(1));
        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length() ;
            }
        });

        System.out.println(c);
    }
}