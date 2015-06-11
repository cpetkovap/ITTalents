package homework1.Task01;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class TestComputer {
    public static void main(String[] argc){
        
        //computer1
        Computer pc1 = new Computer(1995, 550, false, 1000, 500, "Win 95");
        //computer2
        Computer pc2 = new Computer(2000, 1100, 1000, 900);
        //computer2
        Computer pc3 = new Computer();
        //computer4
        Computer pc4 = new Computer(2015, 2500, true, 2000, 1999, "IOS");
        //computer5
        Computer pc5 = new Computer(2002, 1100, 1000, 900);

        System.out.println(pc1.toString());
        pc1.changeOperationSystem("Linuks");
        System.out.println(pc1.toString());

        int result;
        result = pc1.copmarePrice(pc2);
        compare(result, pc1, pc2);
        result = pc4.copmarePrice(pc1);
        compare(result, pc4, pc1);
        result = pc1.copmarePrice(pc4);
        compare(result, pc1, pc4);
        result = pc2.copmarePrice(pc5);
        compare(result, pc2, pc5);
        result = pc2.copmarePrice(pc3);
        compare(result, pc2, pc3);
        result = pc1.copmarePrice(pc3);
        compare(result, pc1, pc3);


    }

    public static void compare(int a, Computer a1, Computer a2){
        if(a == -1){
            System.out.println("The computer with bigger price is " + a1.toString());
        }else if( a == 1){
            System.out.println("The computer with bigger price is " + a2.toString());
        }else{
            System.out.println("Price is equal ! " );
        }
    }

}
