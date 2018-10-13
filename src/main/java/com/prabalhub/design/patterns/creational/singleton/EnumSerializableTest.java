package com.prabalhub.design.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EnumSerializableTest {

    public static void main(String[] args) {
        NormalClass test = new NormalClass(10, 20);
        System.out.println("x:" + test.getX() + " y:" + test.getY());
        
        
        String filename = "file.ser"; 
        
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
            TestEnum.T1.setAge(99);
            TestEnum.T1.setName("Prabal");
            TestEnum.T1.setLastName("Srivastava");
            out.writeObject(TestEnum.T1);
            // Method for serialization of object 
            //out.writeObject(test); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
  
        NormalClass object1 = null; 
  
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            //object1 = (NormalClass)in.readObject(); 
            Object testEnum = (TestEnum)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            //System.out.println("x:" + test.getX() + " y:" + test.getY());
            System.out.println(testEnum == TestEnum.T1);
            System.out.println(testEnum == TestEnum.T2);
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
    }

}

enum TestEnum{
    T1, T2;
    private String name;
    private int order;
    private String lastName;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getOrder() {
        return order;
    }
    
    public void setOrder(int order) {
        this.order = order;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
}

class NormalClass implements Serializable {

    private static final long serialVersionUID = -37899147216500089L;

    private int x;

    private int y;

    public NormalClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
