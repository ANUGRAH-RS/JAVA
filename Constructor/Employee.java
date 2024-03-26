import java.util.Scanner;
class Employee
{
int Empid,salary;
String name,Address;
Employee(int Empid,String name,String Address,int salary)
{
this.Empid=Empid;
this.name=name;
this.Address=Address;
this.salary=salary;
}
Employee(){}
}
class Teacher extends Employee
{
String department;
String subject;
Teacher(int Empid,String name,String Address,int salary,String department,String subject)
{
super(Empid,name,Address,salary);
this.department=department;
this.subject=subject;
}
Teacher()
{
super();
}

//Function To Display
void displayTeachers(Teacher[] teachers)
{
String format="%-10s %-20s %-20s %-10s %-20s %-20s";
System.out.format(format,"Empid","Name","Address","Salary","Department","Subject");
System.out.println();
System.out.format(format,"-------","-------","-------","-------","-------","-------");
System.out.println();
for(Teacher t: teachers)
{
System.out.format(format,t.Empid,t.name,t.Address,t.salary,t.department,t.subject);
System.out.println();
}
}
}

class Employees
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The No of Employees :");
int ecount=sc.nextInt();
Teacher[] teachers = new Teacher[ecount];
for(int i=0; i<ecount; i++)
{
System.out.println("Enter The Empid :");
int Empid = sc.nextInt();
sc.nextLine();
System.out.print("Enter The Name :");
String name = sc.nextLine();
System.out.print("Enter The Address :");
String Address = sc.nextLine();
System.out.print("Enter The Salary :");
int salary = sc.nextInt();
sc.nextLine();
System.out.print("Enter The Department :");
String dep = sc.nextLine();
System.out.print("Enter The Subject :");
String sub = sc.nextLine();
teachers[i] = new Teacher(Empid, name, Address, salary, dep, sub);
}
Teacher t1 =new Teacher();
t1.displayTeachers(teachers);
}
}

