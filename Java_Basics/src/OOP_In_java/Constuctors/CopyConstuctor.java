package OOP_In_java.Constuctors;
import java.io.*;

class geeks{

    String name;
    int id;

    geeks(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    geeks(geeks obj){
        this.name= obj.name;
        this.id= obj.id;


    }


}

class CopyConstuctor {

    public static void main(String[] args) {
        System.out.println("First Object");
        geeks obj=new geeks("prasad",50);
        System.out.println("GeekName: " + obj.name
                + " and GeekId: " + obj.id);
        geeks obj2 = new geeks(obj);

        System.out.println("Copy Constructor used Second Object");

        System.out.println("GeekName: " + obj2.name
                + " and GeekId: " + obj2.id);
    }
}
