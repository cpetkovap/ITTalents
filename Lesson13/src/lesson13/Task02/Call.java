package lesson13.Task02;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Call {
    //tuk vse oshte ne sme uchili za konstruktori

    static double priceForAMinute = 0.34;
    GSM caller;
    GSM receiver;
    double duration;

    @Override
    public String toString() {
        return "Call{" + "caller = " + caller.simMobileNumber + " receiver = " + receiver.simMobileNumber + " duration = " + duration + '}';
    }
}
