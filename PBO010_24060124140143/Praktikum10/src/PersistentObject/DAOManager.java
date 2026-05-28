/** Binar Ridha Wiritanaya / 24060124140143
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
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



public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
