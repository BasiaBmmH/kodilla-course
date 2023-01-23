package Modul2.Zad4.przykłady;

/* package whatever; // don't place package name! */

import java.lang.*;

//An example class with accessors
class AccesorsExample {
    int property;
    public void setProperty(int property){
        this.property = property;
    }
    public int getProperty(){
        return property;
    }
}

/* Name of the class has to be "Main" only if the class is public. */
public class AccessorsTest
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //Creating object of class AccessorsExample
        AccesorsExample object = new AccesorsExample();

        //Using setter to set the value of property to 17
        object.setProperty(17);

        //Using getter to retrieve the value of property
        System.out.println(object.getProperty());
    }
}
