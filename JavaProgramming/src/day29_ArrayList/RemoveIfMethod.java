package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
/* this is not work correctly so we need to use removeIf
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){
                list.remove(i);
            }
        }
        */

        System.out.println(list);
        // when u have a condition for removing
        //removeIf(p (each of the element) -> p<5(boolean condition))
        //remove if internally use the loop
        list.removeIf(p -> p<5); // Lambda Expression (->)

        System.out.println(list);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(each -> each%2==0);

        System.out.println(list2);

        System.out.println("-------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(each -> each.startsWith("J"));

        System.out.println(list3);

        System.out.println("------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf(each -> !StringUtility.isPalindrome(each)); // remove each element which are not palindrome

        System.out.println(names);

        }
    }

