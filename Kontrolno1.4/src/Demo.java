import java.util.Date;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSM.Battery b = new GSM.Battery("ava", new Date(), 32);
		GSM gsm = new GSM(null, null, 10, null, b);
		GSM gsm2 = new GSM("ala", "bala", 10, "az");
		System.out.println(gsm);
		Call c1 = new Call(gsm, gsm, 1, new Date());
		Call c2 = new Call(gsm2, gsm2, 2, new Date());
		Call c3 = new Call(gsm, gsm2, 7, new Date());
		Call c4 = new Call(gsm2, gsm, 10, new Date());
		//Call c5 = new Call(null, null, 11, new Date());
		
		gsm.addCall(c1);
		gsm.addCall(c2);
		gsm.addCall(c3);
		gsm.addCall(c4);
		//gsm.addCall(c5);
		
		System.out.println();
		System.out.println(gsm.toString());
		gsm.deleteCall(c1);
		gsm.deleteCall(c3);
		System.out.println();
		System.out.println(gsm.toString());
		
		System.out.println(gsm.sum());
		

	}

}
