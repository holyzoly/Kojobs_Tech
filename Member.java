package MembershipManager;

/**
 * 
 * @author Seewan
 * 02/17/2015
 * A class that stores each member's information.
 * 
 */

public class Member {
	private String name;
	private String sid;
	private String year;
	private boolean isOfficer;

	public Member() {
	}
	
	public Member(String name, String sid, String year, boolean isOfficer) {
		this.name = name;
		this.sid = sid;
		this.year = year;
		this.isOfficer = isOfficer;
	}
	
	public Member(String name, String sid) {
		this.name = name;
		this.sid = sid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSid() {
		return sid;
	}
	
	public String getYear() {
		return year;
	}
	
	public boolean checkOfficer() {
		return isOfficer;
	}
	
	public String toString() {
		return sid + "/" + name + "/" + year + "/" + isOfficer;
		
	}
	
	public void setName(String given) {
		name = given;
	}
	
	public void setSid(String given) {
		sid = given;
	}
	
	public void setYear(String given) {
		year = given;
	}
	
	public void setOfficer(boolean given) {
		isOfficer = given;
	}

}
