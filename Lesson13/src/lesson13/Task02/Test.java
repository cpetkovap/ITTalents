package lesson13.Task02;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Test {

    public static void main(String[] argc) {

        //Call.priceForAMinute = 0.9;

        GSM g1 = new GSM();
        g1.model = "g1";
        g1.insertSimCard("0898198989");

//        System.out.println(g1.simMobileNumber);
//        System.out.println(g1.hasSimCard);
//        g1.removeSimCard();
//        System.out.println(g1.hasSimCard);
//        System.out.println(g1.simMobileNumber);

        GSM g2 = new GSM();
        g2.model = "g2";
        g2.insertSimCard("0899761543");

        GSM g3 = new GSM();
        g3.model = "g3";
        g3.insertSimCard("0812345678");

        g1.call(g2, 21.33);
        g1.call(g3, 12.5);
        g2.call(g3, 43);

        System.out.println(g1.outgoingCallsDuration);
        System.out.println(g1.getSumForCall());
        System.out.println(g1.printInfoForTheLastIncomingCall());
        System.out.println(g1.printInfoForTheLastOutgoingCall());
        System.out.println(g2.printInfoForTheLastIncomingCall());
        System.out.println(g2.printInfoForTheLastOutgoingCall());


    }
}
