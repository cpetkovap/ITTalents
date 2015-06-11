package lesson13.Task02;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class GSM {
    //tuk vse oshte ne sme uchili za konstruktori

    String model;
    boolean hasSimCard;
    String simMobileNumber;
    double outgoingCallsDuration;
    Call lastIncomingCall;
    Call lastOutgoingCall;

    //dabavqne na sim karta
    public void insertSimCard(String simMobileNumber) {
        if (simMobileNumber.matches("^08[0-9]{8}")) {
            this.simMobileNumber = simMobileNumber;
            hasSimCard = true;
        }
    }

    //remove sim card
    public void removeSimCard() {
        if (hasSimCard == true) {
            hasSimCard = false;
            simMobileNumber = null;
        }
    }

    //povikvane
    //ako priemem che telefonniq nomer unikalno identificira telefona tova e ok
    //ako se pozvolqva ednakvi telefonni nomera mojem da proverim dali obektite sa ednakvi :
    //receiver.equals(this
    public void call(GSM receiver, double duration) {
        if (duration > 0 && duration < 60 && !receiver.simMobileNumber.equals(this.simMobileNumber) && receiver.hasSimCard == true && this.hasSimCard == true) {
            Call a = new Call();
            a.duration = duration;
            a.caller = this;
            a.receiver = receiver;
            this.lastOutgoingCall = a;
            receiver.lastIncomingCall = a;
            outgoingCallsDuration += duration;
           // return a;
        } else {
            //return null;
        }

    }

    public String getSumForCall() {
        double sum = outgoingCallsDuration * Call.priceForAMinute;
        return String.format("Sum for call is %.3f", sum);
    }

    public String printInfoForTheLastOutgoingCall() {
        String str;
        if(lastOutgoingCall != null){
            str =  "The Last Outgoing Call : " + lastOutgoingCall.toString() + ", duration : " + lastOutgoingCall.duration + " " ;
        }else{
            str = simMobileNumber + " : No Last Outgoing Call";
        }
        return str;
    }

    public String printInfoForTheLastIncomingCall() {
        if(lastIncomingCall != null){
            return "The Last Incoming Call : " + lastIncomingCall.toString() + ", duration : " + lastIncomingCall.duration + " ";
        }else{
            return simMobileNumber + " : No Last Incoming Call";
        }
    }
}
