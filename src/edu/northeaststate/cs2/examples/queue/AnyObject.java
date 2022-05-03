/**
 * -------------------------------------------------
 * File name: AnyObject.java
 * Project Name: CS2 Examples
 * -------------------------------------------------
 * Created By: Cora Yon
 *             John McMeen
 * Email: cyon@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.queue;

/**
 * Class Name: AnyObject
 * Purpose: Models any object
 */
public class AnyObject implements Comparable<AnyObject> {
    private int objectID;
    private String objectNames;

    /**
     * Method Name: AnyObject
     * Method Description: Parameterized constructor
     * @param objectID
     * @param objectNames
     */
    public AnyObject(int objectID, String objectNames){
        this.objectID = objectID;
        this.objectNames = objectNames;
    }

    /**
     * Method Name: getObjectID
     * Method Description: Returns the objectID attribute for AnyObject
     * @return int
     */
    public int getObjectID(){
        return this.objectID;
    }

    /**
     * Method Name: getObjectNames
     * Method Description: Returns the name attribute for AnyObject
     * @return int
     */
    public String getObjectNames() {
        return this.objectNames;
    }

    /**
     * Method Name: compareTo
     * Method Description: Implements the Comparable interface method.
     * return a comparison by calories
     * @param o
     * @return
     */
    @Override
    public int compareTo(AnyObject o) {
        return o.objectID > this.objectID ? 1 : -1;
    }

    /**
     * Method Name: toString
     * Method description: Build a string that represents an Object
     * @return String
     */
    public String toString(){
        return "Object [ID=" +
                this.objectID +
                ", name=" +
                this.objectNames +
                "]";
    }
}
