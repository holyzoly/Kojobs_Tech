package MembershipManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Seewan
 * 02/13/2015
 * Program that reads csv formatted membership information file in KOJOBS and
 * manage membership.
 */
public class MembershipManager {
	public static final String FILE_NAME =
			"/Users/Seewan/workspace/Kojobs/Members.csv";
	
	public static void main(String[] args) throws FileNotFoundException {
		List<Member> memList = new ArrayList<Member>();
		Scanner input = new Scanner(new File(FILE_NAME));
		Scanner console = new Scanner(System.in);
		String line = "";
		String csvSplitBy = ",";
		int option = 10;
		
		// skip the first row of the file
		input.nextLine();
		
		// put member info into the arraylist.
		while (input.hasNextLine()) {
			line = input.nextLine();
			String[] info = line.split(csvSplitBy);
			boolean isOfficer = false;
			if(info[3].equals("yes")) {
				isOfficer = true;
			}
			Member newMember = new Member(info[1], info[2]);
				
			memList.add(newMember);
		}
		
		while (option != 0) {
			System.out.println("Options: \n 1) Membership check \n 0) Exit");
			option = console.nextInt();
			if (option == 1) {
				checkMember(memList, console);
			}
		}
		System.out.println("Thank you!");
	}
	
	public static String askSid(Scanner console) {
		System.out.println("Student ID?");
		String sid = console.next();
		return sid;
	}
	
	public static void checkMember(List<Member> list, Scanner console) {
		boolean isMember = false;
		Member searched = new Member();
		String sid = askSid(console);
		for (int i = 0; i < list.size(); i++) {
			Member each = list.get(i);
			if (each.getSid().equals(sid)) {
				isMember = true;
				searched = each;
			} 
		}
		if (isMember) {
			System.out.println("is a Member");
			System.out.println("Do you want to see this member's info?");
			String answer = console.next();
			if (answer.equals("yes")) {
				System.out.println(searched.toString());
			}
		} else {
			System.out.println("not a Member");
		}
		
		
		System.out.println();

	}
	
	public static void changeInfo(Member m, Scanner console) {
		System.out.println("Options: \n 1)Name\n2)Student ID\n3)Year\n4)Officer)\n0)Exit");
		int option = 6;
		while (option != 0) {
			if (option == 1) {
				System.out.println("");
			}
			
		}
	}
	
}
