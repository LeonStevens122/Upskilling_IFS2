import java.util.ArrayList;
import java.util.Collections;

public class  priorityQueue
{   // Create an arrayList to act as the Priority Que
    static ArrayList<String> myQue = new ArrayList<>();
    // Method to return the size of the que
    public static int size() {
        return myQue.size();
    }
    // Method to sort the que
    public static void sort() {
        Collections.sort(myQue);
    }
    //Insert element into the que
    public static void offer(String word) {myQue.add(word);}

    // Method to retrieve & remove the head of the que
    public static void remove()
    {
        // Sort elements in ascending order
        sort();

        if (size() >0)
        {
            // print the first element of the sorted ArrayList
            System.out.print(myQue.get(0) + " ");
            // remove the first element of the sorted ArrayList
            myQue.remove(0);
        }
        else
        {
            System.out.println("there is nothing in the que to remove");
        }
    }

    public static void main(String args[])
    {
        //Adding elements to the queue
        offer("One");
        offer("Two");
        offer("Three");
        offer("Four");

        //display the first element
        System.out.println("Priority queue using an Arraylist");
        while (size() > 0)
        {
            remove();
        }
    }

}
