package com.company.uniques;

public class Main {

    public static void main(String[] args) {
        //instantiate a new object
        //from 'Employee' class
        Employee emp1 = new Employee();

        //Accessing 'name' property
        //from 'emp1' object
        emp1.name = "John Doe";
        System.out.println(emp1.name);
        //Accessing 'Company method'
        //from 'emp1' object
        emp1.Company();

        Logger log = new Logger();
        //method now requires an
        //argument between parenthesis to match the
        //parameter in the method definition
        log.logMessage("Hello,World!");
        log.loggerMessage("FirstName","lastname");

        SimpleMath sm1 = new SimpleMath();
        //catch the returned value in a data container
        int result = sm1.addInt(22,11);
        System.out.println("result is:"+result);
        //or use it directly
        System.out.println(sm1.addInt(33,44));

        /*
        * Calling a Static Method
        * Syntax: ClassName.staticMethodName
        */
        StaticMethods.logMessage1("Static Method");
    }
}
class Employee{
    //Properties
    String name = "Unknown";
   public void Company(){
        System.out.println("The Company is Amazon!");
    }
}

class Logger {
    public void logMessage(String msg){
        System.out.println(msg);
    }
    public void loggerMessage(String fname,String lname){
        System.out.println(lname+fname);
    }
}

class SimpleMath{
    //returns an Int Value on running.
    public int addInt(int num1,int num2){
       //return the result of the
       //addition with the return keyword

       return num1+num2;
    }
}

//Static Method
class StaticMethods{
    //Declaring a static Method
    public static void logMessage1(String Msg){
        System.out.println(Msg);
    }
}