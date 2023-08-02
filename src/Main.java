import com.workintech.inheritance.mathModel.mathModel.developerCompany.Employee;
import com.workintech.inheritance.mathModel.mathModel.developerCompany.JuniorDeveloper;
import com.workintech.inheritance.mathModel.mathModel.developerCompany.MidDeveloper;
import com.workintech.inheritance.mathModel.mathModel.mathModel.Circle;
import com.workintech.inheritance.mathModel.mathModel.mathModel.Cuboid;
import com.workintech.inheritance.mathModel.mathModel.mathModel.Cylinder;
import com.workintech.inheritance.mathModel.mathModel.mathModel.Rastgele;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------");
        Circle circle= new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= "+circle.getArea());
        Cylinder cylinder= new Cylinder(5.55,7.25);
        System.out.println("sclinder.radius= " + cylinder.getRadius());
        System.out.println("sclinder.height= " + cylinder.getHeight() );
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("--------------------------------------------");
        Rastgele rastgele = new Rastgele(5, 10);
        System.out.println("rectangle.width= " + rastgele.getWidth());
        System.out.println("rectangle.length= " + rastgele.getLength());
        System.out.println("rectangle.area= " + rastgele.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("--------------------------------------------");
        Employee employee= new Employee(2 , "Yusuf");
        employee.Work();

    }
}