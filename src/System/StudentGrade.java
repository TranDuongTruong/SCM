package System;
//this class manage students' scores 
//with specific subjects such as math, Literature, English, Physics.
public class StudentGrade {
	
	private static int mathGrade;
	private static int literatureGrade;
    private static int englishGrade;
    private static int physicsGrade;
    private static int mediumGrade;
    
    
	public static int getMediumGrade() {
		System.out.println("\n The average score of your subjects is " + mediumGrade );
		return mediumGrade;
	}

	public static void setMediumGrade(int mediumGrade) {
		StudentGrade.mediumGrade = mediumGrade;
	}

	public int getMathGrade() {
		System.out.println("  Your math score is " + mathGrade );
		return mathGrade;
	}

	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}

	public int getLiteratureGrade() {
		System.out.println("\n Your score in literature is " + literatureGrade );
		return literatureGrade;
	}

	public void setLiteratureGrade(int literatureGrade) {
		this.literatureGrade = literatureGrade;
	}

	public int getEnglishGrade() {
		System.out.println("\n Your score in English is " + englishGrade );
		return englishGrade;
	}

	public void setEnglishGrade(int englishGrade) {
		this.englishGrade = englishGrade;
	}

	public int getPhysicsGrade() {
		System.out.println("\n Your score in physics is " + physicsGrade );
		return physicsGrade;
	}

	public void setPhysicsGrade(int physicsGrade) {
		this.physicsGrade = physicsGrade;
	}
	public float AverageScore(){
	    return (physicsGrade+englishGrade+literatureGrade+mathGrade)/4;
	}

}
