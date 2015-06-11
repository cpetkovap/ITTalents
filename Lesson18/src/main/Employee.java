/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Cvety
 */
public class Employee {

	private final String name; // име на работника
	private Task currentTask; // текущата задача в/у която работи работника
	private int hoursLeft; // колко работни часа остават на работника (за днес)
	public static AllWork allwork;

	public Employee(final String name) {
		if (name.matches("[A-Z][a-zA-Z]*")) {
			this.name = name;
		} else {
			this.name = "Eva";
		}
		setCurrentTask(allwork.getNextTask());
	}

	// getyri
	public Task getCurrentTask() {
		return currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public String getName() {
		return name;
	}

	public static AllWork getAllwork() {
		return allwork;
	}

	// setyri
	private void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		} else {
			System.out.println("You can't set the null task");
			// this.currentTask = new Task("Task", 10);
		}
	}

	private void setHoursLeft(int hoursLeft) {
		if (hoursLeft == -1) {
			// tova e kogato nqma poveceh zadachi, a ostavat chasove do kraq na
			// rabotniq den
			this.hoursLeft = -1;
		} else if (hoursLeft >= 0 && hoursLeft <= 8) {
			this.hoursLeft = hoursLeft;
		} else {
			this.hoursLeft = 8;
		}
	}

	public static void setAllwork(AllWork allwork) {
		if (allwork != null) {
			Employee.allwork = allwork;
		} else {
			System.out.println("You can't set the null allwork");
		}
	}

	public void startWorkingDay() {
		// System.out.println("------   " + getName() +
		// " start new day   ------");
		setHoursLeft(8);
	}

	// work
	// realiziran e za edin raboten den t.e. dokato svyshat 8te chasa
	public void work() {
		while (getHoursLeft() > 0) {

			if (currentTask != null) {
				// raboti se po zadachata ako ima takava
				System.out.println(getName() + " is working on "
						+ currentTask.toString());

				// ako vremeto ot denq e poveche ot rabotata za izvyrshvane na
				// zadachata
				if (hoursLeft > currentTask.getWorkingHours()) {

					if (!allwork.isAllWorkDone() && currentTask != null) {
						setHoursLeft(hoursLeft - currentTask.getWorkingHours());
						currentTask.setWorkingHours(0);
						System.out
								.printf("%s is done with task %s. Left time for this day is %s hours\n",
										getName(), currentTask.getName(),
										getHoursLeft());
						currentTask = allwork.getNextTask();

						if (currentTask != null) {
							// zapochvame nova zadacha ako ima takava (ako nqma
							// sym q lojila null)
							System.out.print(getName() + " start new task : ");
							System.out.println(currentTask.getName());
						}
					}
				} else if (hoursLeft < currentTask.getWorkingHours()) {
					// inache : ako vremeto za izvyrshvane na zadachata e
					// poveche ot ostavashtoto vreme ot denq

					currentTask.setWorkingHours(currentTask.getWorkingHours()
							- hoursLeft);
					setHoursLeft(0);
					System.out.printf("%s's day end with task %s.", getName(),
							currentTask.getName());
					System.out.printf(" On this task left %d hours.\n",
							currentTask.getWorkingHours());

				} else {
					// inache : ako denqt svyrshva zaedno s zadachata

					if (!allwork.isAllWorkDone() && currentTask != null) {
						setHoursLeft(0);
						currentTask.setWorkingHours(0);
						System.out
								.printf("%s is done with task %s and the day is end.\n",
										getName(), currentTask.getName());
						currentTask = allwork.getNextTask();
					}
				}
			} else {
				// ako nqmame poveche zadachi
				System.out.println("No more tasks !!!! ");
				// poneje se raboti dokato denqt svyrshi, kogato svyrshat
				// zadachite e nujno i rabotnoto vreme da stane < 0
				// tova e taka, za da ne e nujno da se hodi na rabota bez da
				// imat rabota
				// za chetimost = -1;
				setHoursLeft(-1);
			}
		}
	}

	public void work1() {

		// raboti se po zadachata ako ima takava
		System.out.println(getName() + " is working on "
				+ currentTask.toString());

		// ako vremeto ot denq e poveche ot rabotata za izvyrshvane na zadachata
		if (hoursLeft > currentTask.getWorkingHours()) {

			setHoursLeft(hoursLeft - currentTask.getWorkingHours());
			currentTask.setWorkingHours(0);
			System.out
					.printf("%s is done with task %s. Left time for this day is %s hours\n",
							getName(), currentTask.getName(), getHoursLeft());
			currentTask = allwork.getNextTask();

			if (currentTask != null) {
				// zapochvame nova zadacha ako ima takava (ako nqma sym q lojila
				// null)
				System.out.print(getName() + " start new task : ");
				System.out.println(currentTask.getName());
			} else {
				System.out.printf(
						"No more tasks !!! %s can go home and play Games !\n",
						getName());
			}

		} else if (hoursLeft < currentTask.getWorkingHours()) {
			// inache : ako vremeto za izvyrshvane na zadachata e poveche ot
			// ostavashtoto vreme ot denq

			currentTask.setWorkingHours(currentTask.getWorkingHours()
					- hoursLeft);
			setHoursLeft(0);
			System.out.printf("%s's day end with task %s.", getName(),
					currentTask.getName());
			System.out.printf(" On this task left %d hours.\n",
					currentTask.getWorkingHours());

		} else {
			// inache : ako denqt svyrshva zaedno s zadachata

			setHoursLeft(0);
			currentTask.setWorkingHours(0);
			System.out.printf("%s is done with task %s and the day is end.\n",
					getName(), currentTask.getName());
			currentTask = allwork.getNextTask();
			if(currentTask == null){
				System.out.printf("No more tasks!!! Tomorrow %s can stay at home and play FIFA\n", getName());
			}

		}

	}

	public void showReport() {
		if (currentTask != null) {
			System.out.printf("Employee %s work at task %s \n", getName(),
					currentTask.getName());
			System.out.printf(
					"Left employee hours: %d , left task hours: %d \n",
					getHoursLeft(), currentTask.getWorkingHours());
		} else {
			System.out.printf("Employee %s has not a task \n", getName());
			System.out.printf("Left employee hours: %d \n", getHoursLeft());
		}
	}
}
