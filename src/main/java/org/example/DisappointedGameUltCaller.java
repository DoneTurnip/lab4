package org.example;

public class DisappointedGameUltCaller {

    @LogMethodCall
    public void callAsheUlt(){
        System.out.println("Bob! Do somethin'!");
    }
    @LogMethodCall(logLevel = Logger.DEBUG)
    public void callSoldier76Ult(){
        System.out.println("I've got u in my sight!");
    }
    public void callSombraUlt(){
        System.out.println("Apagandolas luces");
    }

}
