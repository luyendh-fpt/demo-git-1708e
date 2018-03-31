/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author xuanhung
 */
public class Account {

    private int id;
    private String name;
    
    public void functionByDev2(){
       System.out.println("i said hi dev2.");
    }

    public void getBalance(){
       System.out.println("Your balance");
    }

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello toString";
    }
    
    public void sayHello(){
        
    }

}
