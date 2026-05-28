/** Binar Ridha Wiritanaya / 24060124140143
 * File : Person.java
 * Deskripsi : Person database model
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistentObject;

/**
 *
 * @author IDEAPET 5
 */

public class Person {
    private int id;
    private String name;
    
    public Person(String n){
        name = n;
    }
    
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}
