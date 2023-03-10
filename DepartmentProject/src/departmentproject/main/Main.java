package departmentproject.main;

import departmentproject.superdepartment.SuperDepartment;
import departmentproject.superdepartment.admindepartment.AdminDepartment;
import departmentproject.superdepartment.hrdepartment.HrDepartment;
import departmentproject.superdepartment.techdepartment.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDepartment Two = new AdminDepartment();
		SuperDepartment Three = new HrDepartment();
		SuperDepartment Four = new TechDepartment();

		Two.departmentName();
		Two.getTodaysWork();
		Two.getWorkDeadline();
		Two.isTodayAHoliday();
		System.out.println("  ");
		Three.departmentName();
		((HrDepartment) Three).doActivity();
		Three.getTodaysWork();
		Three.getWorkDeadline();
		Three.isTodayAHoliday();
		System.out.println(" ");
		Four.departmentName();
		Four.getTodaysWork();
		Four.getWorkDeadline();
		((TechDepartment) Four).getTechStackInformation();
		Four.isTodayAHoliday();
	}

}
