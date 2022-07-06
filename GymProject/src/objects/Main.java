package objects;
import java.util.*;
import structures.*;


public class Main {
	
	static Scanner input = new Scanner(System.in);
	static Menu menu = new Menu();
	

	public static void main(String[] args) {
		
		int option = 0;
		ArrayList<Members> listMembers = new ArrayList<>();
		ArrayList<Staff> listStaff = new ArrayList<>();
		ArrayList<Classes> listClasses = new ArrayList<>();	
		

		while (option != 5) {		
			
			menu.mainMenu();
			System.out.format("\nOption: ");			
			option = input.nextInt();
			
			switch(option) {
			case 1: 
				System.out.print("Name: ");
				String name = input.next();
				
				System.out.print("Age: ");
				int age = input.nextInt();				
				
				System.out.print("E-mail: ");
				String email = input.next();
				
				System.out.print("CellPhone: ");
				String cellPhoneNum = input.next();
				
				System.out.print("Birthday: ");
				String birthday = input.next();
				
				System.out.print("Start Date: ");
				String startDate = input.next();
				
				
				int checkLisMembers =  listMembers.size();
			
				Members member = new Members();					
				member.setName(name);
				member.setAge(age);
				member.setEmail(email);
				member.setCellphone(cellPhoneNum);
				member.setBirthday(birthday);
				member.setStartDate(startDate);	
				break;
			
			case 2:
				System.out.print("Name: ");
				String nameStaff = input.next();
				
				System.out.print("Age: ");
				int ageStaff = input.nextInt();				
				
				System.out.print("E-mail: ");
				String emailStaff = input.next();
				
				System.out.print("CellPhone: ");
				String cellPhoneNumStaff = input.next();
				
				System.out.print("Birthday: ");
				String birthdayStaff = input.next();
				
				System.out.print("Start Date: ");
				String startDateStaff = input.next();
				
				System.out.print("Function: ");
				String functionStaff = input.next();
				
				System.out.print("Salary: ");
				double salaryStaff = input.nextDouble();
				
				Staff staff = new Staff();
				staff.setName(nameStaff);
				staff.setAge(ageStaff);
				staff.setEmail(emailStaff);
				staff.setCellphone(cellPhoneNumStaff);
				staff.setBirthday(birthdayStaff);
				staff.setStartDate(startDateStaff);	
				staff.setSalary(salaryStaff);
				staff.setFunction(functionStaff);				
				break;
			
			case 3:
				
				System.out.print("Class Name: ");
				String className = input.next();
				
				System.out.print("Class Treiner: ");
				String classTreiner = input.next();
				
				System.out.print("Class Date: ");
				String classDate = input.next();
				
				System.out.print("Class Time: ");
				String classTime = input.next();
				
				System.out.print("Class Capacity: ");
				int  classCapacity = input.nextInt();
				
				Classes classes = new Classes();
				
				classes.setClassName(className);
				classes.setClassTreiner(classTreiner);
				classes.setClassDate(classDate);
				classes.setClassTime(classTime);
				classes.setClassCapacity(classCapacity);
				
				break;
				
			case 4:
			case 5: option = 5;break;

				
				
			} 

		}
	}
}