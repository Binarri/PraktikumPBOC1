/** Binar Ridha Wiritanaya - 24060124140143
 * File : ReadSerializedPerson.java
 * Deskripsi : program untuk serialisasi objek Person
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialize;
import java.io.*;
/**
 *
 * @author IDEAPET 5
 */


public class ReadSerializedPerson {
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = " +person.getName());
        } catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
