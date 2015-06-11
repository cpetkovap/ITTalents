/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Cvety
 */
public class Demo {

	public static void main(String[] argc) {

		AllWork allwork = new AllWork();
		Task t1 = new Task("TaskOne", 3);
		Task t2 = new Task("TaskTwo", 17);
		Task t3 = new Task("TaskThree", 8);
		Task t4 = new Task("TaskFour", 17);
		Task t5 = new Task("TaskFive", 8);
		Task t6 = new Task("TaskSix", 6);
		Task t7 = new Task("TaskSeven", 3);
		Task t8 = new Task("TaskEight", 6);
		Task t9 = new Task("TaskNine", 21);
		Task t10 = new Task("TaskTen", 8);
		Task t11 = new Task("TaskEleven", 4);
		allwork.addTask(t1);
		allwork.addTask(t2);
		allwork.addTask(t3);
		allwork.addTask(t4);
		allwork.addTask(t5);
		allwork.addTask(t6);
		allwork.addTask(t7);
		allwork.addTask(t8);
		allwork.addTask(t9);
		allwork.addTask(t10);
		allwork.addTask(t11);

		Employee.setAllwork(allwork);

		Employee[] employee = new Employee[3];
		employee[0] = new Employee("Todor");
		employee[1] = new Employee("Ivan");
		employee[2] = new Employee("Stoqn");

		/*
		 * Varqnt1: raboti ,no neudachen tuk edna iteraciq e edin raboten den na
		 * edin slujitel t.e dokato 1 chovek ne si izraboti vsichkite chasove za
		 * 1 den, vzima posledovatelni zadac) (vliza v jira i chekva
		 * posledovatelnite zadachi koito shte raboti za denq, ideqta koito
		 * prevari, toi vzima 1vite zadachi) realizirano s metod work()
		 */

		// int currentDay = 1;
		// while (!allwork.isAllWorkDone()) {
		// System.out.println();
		// System.out.println("   ---------     Start new day ! This is day " +
		// currentDay + "     ---------");
		// for (Employee e : employee) {
		// if(e.getCurrentTask() != null){
		// System.out.println(e.getName() + "'s day " + currentDay + " : ");
		// e.startWorkingDay();
		// //work() -> 1 radoben den
		// e.work();
		// }else{
		// System.out.println(e.getName() + "'s day " + currentDay +
		// " : stay at home and play GAMES ! No more tasks !!!");
		// }
		// if (e != employee[2]) {
		// System.out.println("______________________________________________________________________");
		// }
		// }
		// System.out.println("   ---------             End the day " +
		// currentDay + "             ---------");
		// currentDay++;
		// }
		//
		// System.out.println();
		// System.out.println("(:  All work is done for " + (currentDay - 1) +
		// " days! GOOD WORK !!!!  :)");
		// System.out.println();

		/*
		 * Varqnt2: vzima se porednata svobodna zadacha pochti e realizirana
		 * paralelna rabota :D izpolzvan e metod work1()
		 */
		int currentDay = 0;
		while (!allwork.isAllWorkDone()) {
			System.out.println();
			System.out.println("   ---------     Start new day ! This is day "
					+ (currentDay + 1) + "     ---------");
			for (Employee e : employee) {
				e.startWorkingDay();
			}
			int dayH = 8 * (employee.length);
			while (dayH > 0) {
				for (Employee e : employee) {
					if (e.getCurrentTask() != null) {
						if (e.getHoursLeft() > 0) {
							e.work1();
							dayH = dayH - (8 - e.getHoursLeft());
							if (allwork.isAllWorkDone()) {
								System.out.println("All work is done !");

							}
						}
					} else {
						dayH = 0;
					}

				}

			}
			System.out.println("   ---------             End the day "
					+ (currentDay + 1) + "             ---------");
			currentDay++;
		}
		System.out.println();
		System.out.println("(:  All work is done for " + (currentDay)
				+ " days! GOOD WORK !!!!  :)");
		System.out.println();

	}
}
