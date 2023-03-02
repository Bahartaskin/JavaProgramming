package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        //addAll(CollectionType): adds collection of values to the arrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);

        System.out.println("-------------------------------");

        //removeAll(CollectionType): removes all the matching elements from the arraylist

        list.removeAll(Arrays.asList(3,5,8)); // if you have multiple 3 or 5 or 8 all will be removing

        System.out.println(list);

        System.out.println("-------------------------------");

        //retainAll(CollectionType): removes all the NON-MATCHING elements from the arraylist

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900) );

        numbers.retainAll(Arrays.asList(100,200,300)); // which values you want to keep in your ArrayList you should write them

        System.out.println(numbers);

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll( Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(jobTitles);

        System.out.println("-------------------------------");

        // containsAll(CollectionType): checks if all the elements are contained in the arraylist

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(  Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        boolean r3 = nums.containsAll(Arrays.asList(2,5,10)); // if all of them included it will be true


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-----------------------------------------");

        // convert "non-primitive" arrays to ArrayList

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};
/*
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));

        OR
        */

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println(nameList);

        System.out.println("-----------------------------------------");

        // int[] arr = {1,2,3,4,5,6,7,8,9,10}; // u can not covert primitive
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10}; // it needs to be non-primitive
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println("-----------------------------------------");

        //to convert PRIMITIVE array to ArrayList you need to have your own custom method to do that

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

    }
    //to convert primitive array to ArrayList
    public  static  ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer each : list) {
            list.add(each);
        }

        return list;

    }

}
/*
Bulk Operations: argument MUST be a collection type
addAll(CollectionType): adds collection of values to the arrayList
removeAll(CollectionType): removes all the matching elements from
the arraylist
retainAll(CollectionType): removes all the non-matching elements
from the arraylist
containsAll(CollectionType): checks if all the elements are
contained in the arraylist
Arrays:
asList(array of values) ===> returns the array as collectionType
 */