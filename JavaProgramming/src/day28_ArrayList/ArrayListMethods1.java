package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        // add method --> name.add(data) --> adds the data after the last index of the ArrayList
        numbers.add(10); // 0 --> after numbers.add(2,25); --> 0
        numbers.add(20); // 1 --> after numbers.add(2,25); --> 1
        numbers.add(30); // 2 --> after numbers.add(2,25); --> 3
        numbers.add(40); // 3 --> after numbers.add(2,25); --> 4
        numbers.add(50); // 4 --> after numbers.add(2,25); --> 5
        numbers.add(60); // 5 --> after numbers.add(2,25); --> 6
        // you can specify the index number in add method name.add(int index, Integer)
        // inserts the data at the given index
        numbers.add(2,25); // 2
        // remaining elements shift to the right

        System.out.println(numbers);

        // size method --> to get total number of the elements in ArrayList
        System.out.println(numbers.size());
        // you can find last index number with nameOfArray.size()-1
        int lastIndexNumber = numbers.size()-1;
        System.out.println("lastIndexNumber = " + lastIndexNumber);

        // get method --> returns the element at the given index
        Integer num = numbers.get(3);
        // int num = numbers.get(3); you can use with unboxing
        System.out.println("num = " + num);

        System.out.println("---------------------------------");

        for (int i = 0; i < numbers.size(); i++) { // to get each element of the ArrayList
            System.out.println(numbers.get(i));

        }

        System.out.println("---------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);

        //set method --> nameOfArray.set(index,data)
        // like replace method, replace the data which given index number, with the given new data.
        list.set(2,"JavaScript");

        System.out.println(list);

        System.out.println("--------------------------------------------");

        // remove method --> you can remove one index with using index number
        // or you can remove object

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        // remove() --> by index number --> remove one element
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(1);
        System.out.println(employees);
        employees.remove(employees.size()-1); // to remove last element
        System.out.println(employees);


        // remove() --> by object --> removes given object from ArrayList --> return boolean
        employees.remove("Hulya"); // only first one will be removed (if there is more than one)
        System.out.println(employees);
        boolean r1 = employees.remove("Neira"); // because it returns boolean you can assign to boolean variable
        System.out.println(employees);






    }
}
