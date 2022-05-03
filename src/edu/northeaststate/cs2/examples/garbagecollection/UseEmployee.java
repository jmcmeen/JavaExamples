package edu.northeaststate.cs2.examples.garbagecollection;

// Correct code to count number
// of employees excluding interns.
/**
 * Class Name: Employee
 * Purpose: Creates an employee with a name, age, and id
 */
class Employee {

    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;

    // it is made static because it
    // is keep common among all and
    // shared by all objects
    /**
     * Method Name: Employee
     * Method Description: Constructor for Employee
     * @param name, age
     */
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    /**
     * Method Name: show
     * Method Description: Essentially a pre-made toString method to print the info to the screen
     */
    public void show()
    {
        System.out.println("Id=" + ID + "\nName=" + name
                + "\nAge=" + age);
    }
    /**
     * Method Name: showNextId
     * Method Description: prints what the next id should be
     */
    public void showNextId()
    {
        System.out.println("Next employee id will be="
                + nextId);
    }
    /**
     * Method Name: finalize
     * Method Description: decrements the ID
     */
    protected void finalize()
    {
        --nextId;
        // In this case,
        // gc will call finalize()
        // for 2 times for 2 objects.
    }
}
/**
 * Class Name: UseEmployee
 * Purpose: A driver for the employee class
 */
public class UseEmployee {
    /**
     * Class Name: main
     * Purpose: Entry point for the code
     * @param args
     */
    public static void main(String[] args)
    {
        Employee E = new Employee("GFG1", 56);
        Employee F = new Employee("GFG2", 45);
        Employee G = new Employee("GFG3", 25);
        E.show();
        F.show();
        G.show();
        E.showNextId();
        F.showNextId();
        G.showNextId();

        {
            // It is sub block to keep
            // all those interns.
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();

            //makes the X and Y objects eligible to be destroyed
            X = Y = null;
            // runs the garbage collector to remove unnecessary objects in memory
            System.gc();
            System.runFinalization();
        }
        E.showNextId();
    }
}
