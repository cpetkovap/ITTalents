package homework1.Task01;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Computer {
    //tuk vse oshte ne sme uchili za konstruktori

    //promenlivi
    private int year;
    private double price = 500;
    private boolean isNotebook;
    private int hardDiskMemory;
    private int freeMemory;
    private String operationSystem;

    public Computer() {
        this.isNotebook = false;
        this.operationSystem = "Win XP";
    }

    public Computer(int year, double price, int hardDiskMemory, int freeMemory) {
        this();
        setYear(year);
        setPrice(price);
        setHardDiskMemory(hardDiskMemory);
        setFreeMemory(freeMemory);
    }

    public Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory, String operationSystem) {
        setYear(year);
        setPrice(price);
        setIsNotebook(isNotebook);
        setHardDiskMemory(hardDiskMemory);
        setFreeMemory(freeMemory);
        setOperationSystem(operationSystem);
    }

    public int copmarePrice(Computer c){
        if(this.price > c.price){
            return -1;
        }else if(this.price < c.price){
            return 1;
        }else{
            return 0;
        }
    }



    //change operating system
    public void changeOperationSystem(String newOperationSystem){
        setOperationSystem(newOperationSystem);
    }

    //izpolzvame pamet
    public void useMemory(int memory){
        if(memory > freeMemory){
            System.out.println("Not enough free memory!");
        }else{
            setFreeMemory(freeMemory- memory);
        }
    }

    @Override
    public String toString() {
        String helpStr;
        if(isNotebook){
            helpStr = " type = Notebook ";
        }else{
            helpStr = " type = PC ";
        }
        return "Computer{" + "year = " + year + " price = " + price + helpStr + " hardDiskMemory = " + hardDiskMemory + " freeMemory = " + freeMemory + " operationSystem = " + operationSystem + '}';
    }

    //setyri
    private void setFreeMemory(int freeMemory) {
        if(freeMemory > 0 && freeMemory <= hardDiskMemory){
            this.freeMemory = freeMemory;
        }else{
            this.freeMemory = hardDiskMemory;
        }
    }

    private void setHardDiskMemory(int hardDiskMemory) {
        if(hardDiskMemory > 0 && hardDiskMemory < 10000){
            this.hardDiskMemory = hardDiskMemory;
        }else{
            this.hardDiskMemory = 500;
        }
    }

    private void setIsNotebook(boolean isNotebook) {
        this.isNotebook = isNotebook;
    }

    private void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    private void setPrice(double price) {
        if(price > 0 && price < 10000){
            this.price = price;
        }else{
            this.price = 800;
        }
    }

    private void setYear(int year) {
        if(year > 0 && year <=2015){
            this.year = year;
        }else{
            this.year= 2000;
        }
    }



    
}
