package System;
import java.util.Scanner;
import java.util.ArrayList;
// this class used to manage a list of students
//added functions: enter, print information, sort students by score ascending, search students by ID, Find students with (highest, lowest score), add 1 student, delete 1 student
public class SudentManager {
	public  ArrayList<Student> studentList;
	static Scanner nhap=new Scanner(System.in);
	//tìm học sinh với số điểm trung bình cao nhất
	Student highestScore()
	{
		int vitri=0,highestScore=studentList.get(0).getMediumGrade();
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getMediumGrade()>highestScore)
			{
				vitri=i;
				highestScore=studentList.get(i).getMediumGrade();
			}
		}
		
		return studentList.get(vitri);
	}
	
	//tìm học sinh với số điểm trung bình thấp nhất
	Student lowestScore()
	{
		int vitri=0,lowestScore=studentList.get(0).getMediumGrade();
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getMediumGrade()<lowestScore)
			{
				vitri=i;
				lowestScore=studentList.get(i).getMediumGrade();
			}
		}
		
		
		return studentList.get(vitri);
	}
	
	//Thêm 1 học sinh
	void add()
	{
		Student m=new Student();
		m.input();
		studentList.add(m);
		
	}
	
	//Xóa 1 học sinh
	void delete()
	{
		String ID;
		System.out.println("Nhap ID hoc sinh can xoa: ");ID=nhap.nextLine();
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getStudentId()==ID)
				studentList.remove(i);
		}
	}
	
	
}

