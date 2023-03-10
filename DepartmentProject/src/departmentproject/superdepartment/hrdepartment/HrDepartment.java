package departmentproject.superdepartment.hrdepartment;

import departmentproject.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public void departmentName() {
		System.out.println("Hr Department");
	}

	public void getTodaysWork() {
		System.out.println("Fill today’s timesheet and mark your attendance");
	}

	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}

	public void doActivity() {
		System.out.println("team Lunch");
	}
}