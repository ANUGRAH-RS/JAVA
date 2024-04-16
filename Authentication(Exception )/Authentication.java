import java.util.Scanner;
class InvalidUserException extends Exception{
public InvalidUserException(String msg){
super(msg);
}
}
public class Authentication{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Username:");
String username =sc.nextLine();
System.out.println("Enter Password:");
String password= sc.nextLine();
try{
if(username.length()<8)
throw new InvalidUserException("Invalid username,username must be greater than 8 characters!🥲️");
else if(!password.equals("g0dBle2sU"))
{
throw new InvalidUserException("Incorrect password,enter correct password🥲️");
}
else{
System.out.println("Login Succesful🕺️");
}
}catch(InvalidUserException e){
e.printStackTrace();
}
}
}
