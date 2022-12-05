import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        constructor demo=new constructor("wambua",2022);
        System.out.println(demo.name);
        System.out.println(demo.year);
        dog obj=new dog();
        obj.bark();
        obj.eat();
        simple ob=new simple();
        ob.simple();
        area ur=new area();
        ur.area();
        circle ci=new circle();
        ci.circle();
        ci.neticome();
        add u=new add();
        u.add();
        u.pattern();
        HashMap <String, Integer> students_reg=new HashMap <>();
        students_reg.put("Mutua",20200);
        students_reg.put("urbanus",20000);
        System.out.println(students_reg);
        System.out.println(students_reg.get("Mutua"));
        mango mu=new mango();
        mu.vitamins();
        mu.fruits();
        mu.mango();
        son g=new son();
        g.son();
        Gson G=new Gson();
        G.Gson();
        G_daughter k=new G_daughter();
        k.granddaughter();
        k.daughter();
        k.father();
    }
}
class constructor{
    String name;
    int  year;
 public  constructor(String name,int year){
   this.name=name;
     this.year=year;

 }
}
class animal{
   public void eat(){
       System.out.println("eating");
   }
}
class dog extends animal{
    public void bark(){
        System.out.println("barking");
    }
}
class simple{
   public static void simple(){
       Scanner simple=new Scanner(System.in);
       System.out.println("enter principle");
       int p= simple.nextInt();
       System.out.println("enter rate");
       double r=simple.nextDouble();
       System.out.println("enter time in years");
       double t=simple.nextDouble();
       double amount;
       double simpleintrest;
       simpleintrest=p*r*t;
       System.out.println("simpleintrest =" +simpleintrest);
       amount=simpleintrest+p;
       System.out.println("amount =" +amount);
   }
}
class area{
    public static void area(){
        Scanner area=new Scanner(System.in);
        System.out.println("enter length");
        double l=area.nextDouble();
        System.out.println("enter width");
        double w=area.nextDouble();
        double perimeter;
        double Area;
        perimeter=2*(l+w);
        System.out.println("perimeter=" +perimeter);
        Area=l*w;
        System.out.println("Area="+Area);

    }
}
class circle {
    public static void circle() {
        Scanner circle = new Scanner(System.in);
        System.out.println("enter radius of circle");
        double r = circle.nextDouble();
        System.out.println("enter phi");
        double phi = circle.nextDouble();
        double d = 2 * r;
        double area = r * phi * r;
        System.out.println("area =" + area);
        double circumference = phi * d;
        System.out.println("circumference=" + circumference);
    }

    public static void neticome() {
        Scanner neticome = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        int s = neticome.nextInt();

        System.out.println("Enter house allowance");
        int h = neticome.nextInt();
        System.out.println("enter transport allowances");
        int t = neticome.nextInt();
        System.out.println("Enter hospital allowance");
        int H = neticome.nextInt();
        System.out.println("enter security allowances");
        int S = neticome.nextInt();
        int total_allowances;
        total_allowances = h + t + H + S;
        System.out.println("total_allowances=" + total_allowances);
        int total_income;
        total_income = total_allowances + s;
        System.out.println("total_income=" + total_income);

    }
}
class add {

    public static int add() {
        int i, sum = 0;
        for (i = 1; i <= 10; i++)
        {
            sum = sum + i;
            System.out.println("sum is =" + sum);
        }
        System.out.println();
        return sum;
    }

    public static void pattern() {
        int m;
        int n;
        for (m = 0; m < 3; m++)
        {
            for (n = 0; n < 5; n++)
            {
                System.out.print("o");
            }
            System.out.println();
        }
    }
}
class vitamins{
    public static void vitamins(){
        System.out.println("they are protective foods");
    }
}
class fruits extends vitamins{
    public static void fruits(){
        System.out.println("vitamis are types of fruits");
    }
}
class mango extends fruits{
    public static void mango(){
        System.out.println("mango is a fruit");
    }
} class father {
    public static void father(){
        System.out.println("Munyao is father to mutua");
    }
}
class son extends father{
    public static void son(){
        System.out.println("Mutua is the son to munyao");
    }
}
class daughter extends father{
    public static void daughter(){
        System.out.println("Damaris is munyao daughter");
    }
}
class Gson extends daughter{
    public static void Gson(){
        System.out.println("symo is grandchild to munyao");
    }
}
class G_daughter extends daughter{
    public static void granddaughter(){
        System.out.println("silvia is grand daughter to munyao");
    }
}