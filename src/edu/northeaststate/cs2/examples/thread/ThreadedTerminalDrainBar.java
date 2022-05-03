/**
 * -------------------------------------------------
 * File name: ThreadedTerminalDrainBar.java
 * Created By: Tyler Orton
 * Email: torton2@stumail.northeaststate.edu
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.thread;

/**
 * Class Name: ThreadedTerminalDrainBar
 * Purpose: Generates terminal based progress bars that have a given drain delay and drain amount. These progress bars
 * drain within their own threads. This class was created to show one application of Threads.
 */
public class ThreadedTerminalDrainBar extends Thread
{
    private String title; // The title of the progress bar shown in the toString method output
    private int drainDelayMilliseconds = 200;
    private float drainAmount = 0.05f;
    private float value = 1f; // A value between 0 and 1 that represents the fill level of the progress bar
    private int length = 30; // The length of the progress bar in characters
    private char displayCharacter = '#'; // The character used to draw the progress bar

    /**
     * Method Name: ThreadedTerminalDrainBar
     * Method Description: Creates a ThreadedTerminalDrainBar object with the given parameters
     * @param title The title of the progress bar
     */
    public ThreadedTerminalDrainBar(String title)
    {
        this.title = title;
    }

    /**
     * Method Name: ThreadedTerminalDrainBar
     * Method Description: Creates a ThreadedTerminalDrainBar object with the given parameters
     * @param title The title of the progress bar
     * @param drainDelayMilliseconds The number of milliseconds to sleep between each drain event
     */
    public ThreadedTerminalDrainBar(String title, int drainDelayMilliseconds)
    {
        this.title = title;
        this.drainDelayMilliseconds = drainDelayMilliseconds;
    }

    /**
     * Method Name: ThreadedTerminalDrainBar
     * Method Description: Creates a ThreadedTerminalDrainBar object with the given parameters
     * @param title The title of the progress bar
     * @param drainDelayMilliseconds The number of milliseconds to sleep between each drain event
     * @param drainAmount The amount to drain from the progress bar each iteration
     */
    public ThreadedTerminalDrainBar(String title, int drainDelayMilliseconds, float drainAmount)
    {
        this.title = title;
        this.drainDelayMilliseconds = drainDelayMilliseconds;
        this.drainAmount = drainAmount;
    }

    /**
     * Method Name: ThreadedTerminalDrainBar
     * Method Description: Creates a ThreadedTerminalDrainBar object with the given parameters
     * @param title The title of the progress bar
     * @param drainDelayMilliseconds The number of milliseconds to sleep between each drain event
     * @param drainAmount The amount to drain from the progress bar each iteration
     * @param displayCharacter The character used to show the fill level of the progress bar
     */
    public ThreadedTerminalDrainBar(String title, int drainDelayMilliseconds, float drainAmount, char displayCharacter)
    {
        this.title = title;
        this.drainDelayMilliseconds = drainDelayMilliseconds;
        this.drainAmount = drainAmount;
        this.displayCharacter = displayCharacter;
    }

    /**
     * Method Name: run
     * Method Description: Overrides the run method from the Thread class
     */
    @Override
    public void run() {
        while(this.value > 0f)
        {
            this.subtractValue(this.drainAmount);

            try {
                Thread.sleep(this.drainDelayMilliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Method Name: getTitle
     * Method Description: Getter for the title attribute
     * @return String
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * Method Name: setTitle
     * Method Description: Setter for the title attribute
     * @param title The title of the progress bar
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * Method Name: getDrainDelayMilliseconds
     * Method Description: Getter for the drainDelayMilliseconds attribute
     * @return int
     */
    public int getDrainDelayMilliseconds()
    {
        return this.drainDelayMilliseconds;
    }

    /**
     * Method Name: setDrainDelayMilliseconds
     * Method Description: Setter for the drainDelayMilliseconds attribute
     * @param drainDelayMilliseconds The number of milliseconds to sleep between each drain event
     */
    public void setDrainDelayMilliseconds(int drainDelayMilliseconds)
    {
        this.drainDelayMilliseconds = drainDelayMilliseconds;
    }

    /**
     * Method Name: getDrainAmount
     * Method Description: Getter for the drainAmount attribute
     * @return float
     */
    public float getDrainAmount()
    {
        return this.drainAmount;
    }

    /**
     * Method Name: setDrainAmount
     * Method Description: Setter for the drainAmount attribute
     * @param drainAmount The amount to drain from the progress bar each iteration
     */
    public void setDrainAmount(float drainAmount)
    {
        this.drainAmount = drainAmount;
    }

    /**
     * Method Name: getValue
     * Method Description: Getter for the value attribute
     * @return float
     */
    public float getValue()
    {
        return this.value;
    }

    /**
     * Method Name: setValue
     * Method Description: Setter for the value attribute
     * @param value The value between 0 and 1 which represents the fill level of the progress bar
     */
    public void setValue(float value)
    {
        this.value = value;
    }

    /**
     * Method Name: addValue
     * Method Description: Adds the given value parameter to the drain bar's value. It also clamps the value between 0 and 1.
     * @param value The value between 0 and 1 which represents the fill level of the progress bar
     */
    public void addValue(float value)
    {
        this.value = Utils.clamp(this.value + value, 0f, 1f);
    }

    /**
     * Method Name: subtractValue
     * Method Description: Subtracts the given value parameter to the drain bar's value. It also clamps the value between 0 and 1.
     * @param value The value between 0 and 1 which represents the fill level of the progress bar
     */
    public void subtractValue(float value)
    {
        this.value = Utils.clamp(this.value - value, 0f, 1f);
    }

    /**
     * Method Name: getLength
     * Method Description: Getter for the length attribute
     * @return int
     */
    public int getLength()
    {
        return this.length;
    }

    /**
     * Method Name: setLength
     * Method Description: Setter for the length attribute
     * @param length The length of the progress bar in characters
     */
    public void setLength(int length)
    {
        this.length = length;
    }

    /**
     * Method Name: getDisplayCharacter
     * Method Description: Getter for the displayCharacter attribute
     * @return char
     */
    public char getDisplayCharacter()
    {
        return this.displayCharacter;
    }

    /**
     * Method Name: setDisplayCharacter
     * Method Description: Setter for the displayCharacter attribute
     * @param displayCharacter The character used to show the fill level of the progress bar
     */
    public void setDisplayCharacter(char displayCharacter)
    {
        this.displayCharacter = displayCharacter;
    }

    /**
     * Method Name: toString
     * Method Description: Returns a string representation of the terminal drain bar with the current fill level
     * @return String
     */
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.title + " [");

        int progressBarLength = Math.round(value * length);
        int emptySpaceLength = this.length - progressBarLength;

        for(int i = 0; i < progressBarLength; i++)
        {
            stringBuilder.append(displayCharacter);
        }

        for(int i = 0; i < emptySpaceLength; i++)
        {
            stringBuilder.append(' ');
        }

        stringBuilder.append("] ");
        stringBuilder.append(Utils.decimalFormatTwoPlaces.format(this.value * 100f));

        return stringBuilder.toString();
    }
}