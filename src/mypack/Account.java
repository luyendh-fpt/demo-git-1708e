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
       System.out.println("Fix again.");
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
<<<<<<< HEAD
	return "Say hello again";
=======
        return "Hello toString";
>>>>>>> de956b7c43f692e8fab3cfc4264b5bf10e370bd6
    }
    
    public void sayHello(){
        
    }


}
