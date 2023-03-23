import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        Scanner myobj=new Scanner();
        t.side1=myobj.nextDouble();
        t.side2=myobj.nextDouble();
        t.side3=myobj.nextDouble();
        t.color=myobj.nextLine();
        t.filled=myobj.nextBoolean();
        System.out.println(t.area(),t.permiter(),t.filled,t.color);
    }
}