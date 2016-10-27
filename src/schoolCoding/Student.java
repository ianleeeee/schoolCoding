package schoolCoding;

public class Student {
	private int iD;
	private int numHours;
	private int pointsEarned;
	private double GPA;

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public int getNumHours() {
		return numHours;
	}

	public void setNumHours(int numHours) {
		this.numHours = numHours;
	}

	public int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		GPA = pointsEarned / numHours;
	}

	public void displayID(){
		System.out.println(iD);
	}
	
	public void displaynumHours(){
		System.out.println(numHours);
	}
	
	public void displaypointsEarned(){
		System.out.println(pointsEarned);
	}
	
	public void displayGPA(){
		System.out.println(GPA);
	}

}