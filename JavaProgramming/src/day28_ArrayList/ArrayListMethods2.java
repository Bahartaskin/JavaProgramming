package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        //****don't use remove method in the loop***

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
       /* int num = 1;
        list.remove(num);
        OR
        list.remove(1); // primitive will be taken as an index number
        System.out.println(list);
        */

        Integer num = 200;
        // list.remove(200); compiler thinks this is index ( primitive)
        list.remove(num); // when you pass object with number you should assign to a wrapper class first
        System.out.println(list); // only removes first 200
        boolean r = list.remove(num); // return type is boolean, so you can assign to a boolean.
        System.out.println(r);


        System.out.println("-------------------------------");

        System.out.println(list.size());

        // clear method --> remove all the elements from ArrayList --> set the size to 0
        list.clear();

        System.out.println(list.size());
        System.out.println(list);

        System.out.println("-------------------------------");



        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        // indexOf method --> nameOfArray.indexOf(data)--> returns int
        // returns the first matching element's index number
        int char1 = characters.indexOf('A'); //0 returns int, so you can assign to int variable

        // lastIndexOf method --> nameOfArray.indexOf(data)--> returns int
        // returns the last matching element's index number
        int char2 = characters.lastIndexOf('A'); //4 returns int, so you can assign to int variable

        System.out.println("---------------------------------------");

        //contains method --> if the ArrayList includes that object or not
        // --> return boolean
        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2); //true
        System.out.println("r3 = " + r3); //false

        System.out.println("---------------------------------------");

        //equals method --> compare is one ArrayList equals to another ArrayList
        // --> returns boolean
        // same elements and same order
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // false (2 different objects created in heep memory)
        System.out.println(list1.equals(list2)); // true (they are same and same order, so they are equal)

        System.out.println("----------------------------------------");

        //isEmpty method --> if the ArrayList is empty it will be true
        //--> return boolean
        // you can assign to a boolean because it returns boolean
        boolean r4 = list1.isEmpty(); //false ( because list1 ArrayList is not empty)
        System.out.println("r4 = " + r4);

        System.out.println("----------------------------------------");

        //Bulk Operation: CollectionType needed
        // addAll method --> to add all elements together in one time

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers);
    }
}
