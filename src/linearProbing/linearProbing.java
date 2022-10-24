// This article has a great breakdown of what you need to do
// https://www.sanfoundry.com/java-program-implement-hash-tables-linear-probing/


package linearProbing;


import java.util.Scanner;

public class linearProbing {

    // Initialise Variables
    private static int currentSize, maxSize;

    private static String[] keys;

    private static String[] values;

    // Constructor
    public linearProbing(int capacity)
    {
        currentSize = 0;
        maxSize = capacity;
        keys = new String[maxSize];
        values = new String[maxSize];
    }

    // We use the hashcode() method to get the hash value of a given key
    private static int hash(String key)
    {
        return key.hashCode() % maxSize;
    }

    // Now we create a function to get the value for a given key
    public static String getValue(String key)
    {
        // get the index of the value
        int index = hash(key);

        // use a while loop to iterate through each of the key values until it find a null value
        while (keys[index] != null)
        {

            if (keys[index].equals(key))
            {
                // return the value at the index position if there is a value at the index position
                return values[index];
            }
            index = (index + 1) % maxSize;
        }
        // return null if no index is found.
        return null;
    }

    // inserting new values into the hash table
    public static void insert(String key, String value)
    {
        // get the has value of the key
        int hashedKey = hash(key);
        int index = hashedKey;


        do
        {
            // check if the current index of the hash table is empty,
            // if it is, we store the new element in this index
            if (keys[index] == null)
            {
                keys[index] = key;
                values[index] = value;
                currentSize++;
                return;
            }
            // if this hashedkey is already in the hashtable
            // we only update the value for the key
            if (keys[index].equals(key))
            {
                values[index] = value;
                return;
            }
            index = (index +1) % maxSize;
        }
        // we exit the do-while loop if the index == hashedKey
        while (index != hashedKey);

    }

    // Here we check if the hash table contains the given key
    public static boolean contains(String key)
    {
        return getValue(key) != null;
    }

    public static void printHashTable()
    {
        System.out.println("Hash Table : ");
        for (int index = 0; index < maxSize; index++)
        {
            // check that the value at keys[index] is not null
            if (keys[index] != null)
            {
                // print out the non null valuus
                System.out.println("Index : " + keys[index] + "  Value : " + values[index]);
            }

        }
        System.out.println();
    }

    // Function to remove a key and its value
    public static void remove(String key)
    {
        // if the key is not present - return
        if (!contains(key))
        {
            return;
        }

        // Find the position key and delete it
        int indexToDelete = hash(key);
        while (!key.equals(keys[indexToDelete]))
        {
            indexToDelete = (indexToDelete + 1) % maxSize;

        }

        keys[indexToDelete] = values[indexToDelete] = null;

        // ReHash all keys
        for (indexToDelete = (indexToDelete + 1) % maxSize;
             keys[indexToDelete] != null;
             indexToDelete = (indexToDelete + 1) % maxSize )
        {
            String hashedKey = keys[indexToDelete], value = values[indexToDelete];
            keys[indexToDelete] = values[indexToDelete] = null;
            currentSize--;
            insert(hashedKey, value);
        }
        currentSize--;

    }
    public static void main(String[] args) {

        System.out.println("---------- My Hash Table---------");
        linearProbing myLinearPRobing= new linearProbing(9);

        // insert new elements

        insert("12", "Johannesburg");
        insert("1", "Cape Town");
        insert("25", "Durban");
        insert("3", "Paris");
        insert("72", "London");
        insert("5", "New York");
        insert("50", "Amsterdam");
        insert("7", "Houston");
        insert("2", "New Orleans");
        insert("15", "Tokyo");

        // Print the HAsh Table
        printHashTable();

        // Remove one element
        remove("25");



        // PRint with the element removed
        printHashTable();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the index of the value you wish to remove : ");
        String inputString = scanner.nextLine();

        remove(inputString);


        printHashTable();

    }



}
