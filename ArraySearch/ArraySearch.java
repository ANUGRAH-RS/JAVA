import java.util.*;
class ArraySearch
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of Array Elements:");
int size=sc.nextInt();
int numbers[]=new int[size];
System.out.println("Enter The Array Elements:");
for(int i=0;i<size;i++)
{
numbers[i]=sc.nextInt();
}
ArraySearch as=new ArraySearch();
System.out.println("\nEnter The Elemenets to search:");
int se=sc.nextInt();
System.out.println("\nchoose:\n1.LINEAR SEARCH\n2.BINARY SERARCH\n3.BUILT IN SEARCH\n4.RECURSIVE BINARY SEARCH");
System.out.println("\nEnter Your Option:");
int opt=sc.nextInt();
int result=-1;
switch(opt)
{
case 1:result=as.linearSearch(se,numbers);
	break;
case 2:Arrays.sort(numbers);
	result=as.simpleBinarySearch(se,numbers);
	break;
case 3:Arrays.sort(numbers);
	result=as.recursiveBinarySearch(numbers,0,size-1,se);
	break;
case 4:Arrays.sort(numbers);
	result=Arrays.binarySearch(numbers,se);
	break;
default:System.out.println("\nInvalid Option...!");
	break;
}
if(result>-1)
{
System.out.println(se+" found");
}
else
{
System.out.println(se+" not found");
}
}

//LINEAR SEARCH
int linearSearch(int n,int[] numbers)
{
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]==n)
{
return 1;
}
}
return -1;
}

//BINARY SEARCH
int simpleBinarySearch(int n,int[]numbers)
{
int first=0;
int last=numbers.length-1;
int mid=(first+last)/2;
while(first<=last)
{
if(numbers[mid]<n)
{
first=mid+1;
}
else if(numbers[mid]>n)
{
last=mid-1;
}
else
{
return mid;
}
mid=(first+last)/2;
}
return -1;
}

// RECURSIVE BINARY SEARCH 

int recursiveBinarySearch(int[] numbers,int first,int last,int x)
{
if(first<=last && first<=numbers.length -1)
{
int mid=first + (last-first)/2;
if(numbers[mid] < x)
{
return recursiveBinarySearch(numbers,mid+1,last,x);
}
if(numbers[mid] > x)
{
return recursiveBinarySearch(numbers,first,mid-1,x);
}
return mid;
}
return -1;
}
}
