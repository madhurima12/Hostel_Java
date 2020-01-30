import java.util.*;
import Student_info.Student;

public class Student_Interface
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String student_Name,elective_subject,hostel_Name,hostel_location,regdNo; 
int avgMarks,no_of_rooms;
Student[] obj=new Student[10];
int x=1,i=1,z,o;
while(x!=0)
{
System.out.println("Admit");
System.out.println("Migrate");
System.out.println("Show");
z=sc.nextInt();
if(z==1)
{
System.out.println("Enter Student Name");
student_Name=sc.next();
regdNo="UEMk"+i;
System.out.println("Enter elected subject");
elective_subject=sc.next();
System.out.println("Enter average marks");
avgMarks=sc.nextInt();
System.out.println("Enter hostel name");
hostel_Name=sc.next();
System.out.println("Enter hostel location");
hostel_location=sc.next();
System.out.println("Enter number of rooms");
no_of_rooms=sc.nextInt();
obj[i++]=new Student(hostel_Name,hostel_location,no_of_rooms,student_Name,regdNo,elective_subject,avgMarks);
System.out.println("Student Added::Reg Id "+regdNo);
}
else if(z==2)
{
System.out.println("Enter the last digit of the id");
o=sc.nextInt();
obj[o]=null;
}
else if(z==3)
{
System.out.println("Enter the last digit of the id");
o=sc.nextInt();
System.out.println(obj[o].printData());
}
else
{
x=0;
}
}
}
}
