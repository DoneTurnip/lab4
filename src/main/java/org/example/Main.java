package org.example;

public class Main {
    public static void main(String[] args) {

        DisappointedGameUltCaller disappointedGameUltCaller = new DisappointedGameUltCaller();

        LoggerUtil.log(disappointedGameUltCaller, "callAsheUlt");
        disappointedGameUltCaller.callAsheUlt();;
        System.out.println();

        LoggerUtil.log(disappointedGameUltCaller, "callSoldier76Ult");
        disappointedGameUltCaller.callSoldier76Ult();
        System.out.println();

        LoggerUtil.log(disappointedGameUltCaller, "callSombraUlt");
        disappointedGameUltCaller.callSombraUlt();
        System.out.println();
    }
}