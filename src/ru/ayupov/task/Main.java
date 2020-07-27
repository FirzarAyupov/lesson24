package ru.ayupov.task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества. *
 * public Set<String> removeEvenLength(Set<String> set); *
 * <p>
 * Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
 * метод вернет ["foo", "bar", "spoon", "!"]
 */

public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        System.out.println(removeEvenLength(set));
    }

    public static Set<String> removeEvenLength(Set<String> set) {
        Set<String> result = new LinkedHashSet<>();
        if (!set.isEmpty()) {
            for (String s : set) {
                if (s.length() % 2 != 0)
                    result.add(s);
            }
        }
        return result;
    }
}
