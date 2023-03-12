package departmentproject.main;

import departmentproject.superdepartment.admindepartment.AdminDepartment;
import departmentproject.superdepartment.hrdepartment.HrDepartment;
import departmentproject.superdepartment.techdepartment.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment Two = new AdminDepartment();
		HrDepartment Three = new HrDepartment();
		TechDepartment Four = new TechDepartment();

		System.out.println(Two.departmentName());
		System.out.println(Two.getTodaysWork());
		System.out.println(Two.getWorkDeadline());
		System.out.println(Two.isTodayAHoliday());
		System.out.println("  ");
		System.out.println(Three.departmentName());
		System.out.println(Three.doActivity());
		System.out.println(Three.getTodaysWork());
		System.out.println(Three.getWorkDeadline());
		System.out.println(Three.isTodayAHoliday());
		System.out.println("  ");
		System.out.println(Four.departmentName());
		System.out.println(Four.getTodaysWork());
		System.out.println(Four.getWorkDeadline());
		System.out.println(Four.getTechStackInformation());
		System.out.println(Four.isTodayAHoliday());
	}

}
