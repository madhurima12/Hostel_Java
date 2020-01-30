package Student_info;
import Student_Hostel.Hostel;
import java.io.*;
interface Department{
public final String dept_name="CSE";
public final String dept_head="AB_Sir";
public abstract String printData();
} 
public class Student extends Hostel implements Department
{
public String student_Name,elective_subject,regdNo;
public int avgMarks; 

public Student(String hostel_Name,String hostel_Location,int no_of_rooms,String student_Name,String elective_subject,String regdNo,int avgMarks)
{
super(hostel_Name,hostel_Location,no_of_rooms);
this.student_Name=student_Name;
this.elective_subject=elective_subject;
this.regdNo=regdNo;
this.avgMarks=avgMarks;
}
public String printData()
{
return  "Student[student_Name="+student_Name+",regdno="+regdNo+",elective_subject="+elective_subject+",avgMarks="+avgMarks+",hostel_Name="+hostel_Name+",hostel_location="+hostel_Location+",no_of_rooms="+no_of_rooms+",dept_name="+dept_name+",dept_head="+dept_head+"]";
}
}

 