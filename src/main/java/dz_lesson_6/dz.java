package dz_lesson_6;

import lesson_1.Person;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class dz {

    public static void main(String[] args) {
        Random rand = new Random();
        int treeCount = 20;
        int maxLevel = 4;
        int nodeCount = (int) (Math.pow(2, maxLevel) - 1);

        int maxValue = 25;

        int balancedTreeCount = 0;

        boolean treeView = false;

        for (int i = 0; i < treeCount; i++) {
            Tree<Integer> theTree = new TreeImpl<>(maxLevel);
            initTree(rand, nodeCount, maxValue, theTree);
            if (theTree.isBalanced()) {
                balancedTreeCount++;
                if (!treeView) {
                    treeView = true;
                    theTree.display();
                }
            }
        }

        System.out.println("Balanced Tree Count = " + ((balancedTreeCount / (treeCount * 1.0)) * 100) + "%");

        TreeSet<Person> treeSet = new TreeSet<>(Comparator.comparing(Person::getAge));
        treeSet.add(new Person(18, "Maxim"));
        treeSet.add(new Person(32, "John"));
        treeSet.add(new Person(26, "Egor"));
        treeSet.add(new Person(14, "Bob"));

        for (Person person : treeSet) {
            System.out.println(person);
        }


    }

    private static void initTree(Random rand, int nodeCount, int maxValue, Tree theTree) {
        for (int j = 0; j < nodeCount; j++) {
            theTree.add(rand.nextInt(maxValue * 2 + 1) - maxValue);
        }
    }
}