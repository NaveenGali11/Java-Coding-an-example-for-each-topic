public class Main {
    public static void main(String[] args){

        Logger log = new Logger();
        log.logMessage();
    }
}

class Logger{
    //Both Methods have the same
    //name but this one doesn't
    //have any parameters
    public void logMessage(){
        System.out.println("Hello World!");
    }

    //And this one has a single
    //string parameter.
    public void logMessage(String msg){
        System.out.println(msg);
    }

    //This has a dual String Parameters
    public void logMessage(String msg,String msg2) {
        System.out.println(msg+msg2);
    }

    //This has a triple input parameters
    public void logMessage(String msg,String msg2,String msg3){
        System.out.println(msg+msg2+msg3);
    }

    //Lets try with Integer input parameters
    public void logMessage(int num1,int num2){
        System.out.println(num1+num2);
    }
}
