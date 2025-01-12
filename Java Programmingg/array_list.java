import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String>list2 = new ArrayList<String>();


        //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements

        int element= list.get(0);
        System.out.println(element);

        //add element in between

        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size= list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));


        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
