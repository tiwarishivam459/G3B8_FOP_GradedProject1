package departmentproject.superdepartment.admindepartment;

import departmentproject.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	public void departmentName() {
		System.out.println("Admin Department");
	}

	public void getTodaysWork() {
		System.out.println("Complete your documents Submission");
	}

	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
}