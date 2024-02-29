class Cpu
{
int price=44000;
    class Processor
    {
    int noofcores=6;
    String Manufacture="AMD RYZEN";
    void display()
    {
    System.out.println("Number Of Cores:"+noofcores);
    System.out.println("Manufacture:"+Manufacture);
    }
    }

void display()
{
Processor P=new Processor();
P.display();
System.out.println("price:"+price);
}

static class Ram
{
int Memory=8;
String Manufacturer="Jerry Sanders";

void display()
    {
    System.out.println("Memory:"+Memory);
    System.out.println("Manufacturer:"+Manufacturer);
    }
   }
  }
class Cpus
{
public static void main(String[] args)
{
 Cpu c1=new Cpu();
 c1.display();
 Cpu.Ram r1=new Cpu.Ram();
 r1.display();
 }
}  

