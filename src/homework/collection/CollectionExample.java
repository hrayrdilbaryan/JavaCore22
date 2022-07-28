package homework.collection;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
//        String [] arrayStr= {"a", "b", "c","d"};
//        System.out.println(arrayToList(arrayStr));
        List<String> list = new ArrayList<>();
//        System.out.println(removeById(list, 3));
//        System.out.println(listToSet(list));
//        List<Integer> intList = new ArrayList<>();
//        System.out.println(listToLinkedList(intList));
//        System.out.println(reverseNumbers(intList));
//        printFirstFive(list);
        System.out.println(sizeOfList(list));
    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        List<String> arrayList = new ArrayList<>();
        for (String s : values) {
            arrayList.add(s);

        }
        return arrayList;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));

        }
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }

        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));

        }
        HashSet<String> hashString = new HashSet<>(list);

        return hashString;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        return linkedList;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        List<Integer> newList = new ArrayList<>();
        for (int i = list.size(); i > 0; i--) {
            newList.add(i);


        }
        return newList;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        list.add("java");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        list.add("java4");
        list.add("java4");
        list.add("java4");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }

    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {
        list.add("element");
        return list.size();
    }
}
