package lesson13.Task01;

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
        Computer pc1 = new Computer();
        pc1.year = 2012;
        pc1.price = 1230.54;
        pc1.isNotebook = true;
        pc1.hardDiskMemory = 1000;
        pc1.freeMemory = 493;
        pc1.operationSystem = "IOS";

        //computer2
        Computer pc2 = new Computer();
        pc2.year = 2010;
        pc2.price = 731.12;
        pc2.isNotebook = false;
        pc2.hardDiskMemory = 500;
        pc2.freeMemory = 193;
        pc2.operationSystem = "Windows XP";

        System.out.println(pc2.operationSystem);
        pc2.changeOperationSystem("Linuks");
        System.out.println(pc2.operationSystem);

        System.out.println(pc1.freeMemory);
        pc1.useMemory((short) 100);
        System.out.println(pc1.freeMemory);


    }

}
