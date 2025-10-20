class employee{

    int salary;
    String name;

    public int getSalary(){

        return salary;
    }

    public String getName(){

        return name;


    }

    public void setname(String n){

        name=n;
    }








}

class cellphone{

    public void ringing(){

        System.out.println("phone is ringing");
    }

    public void vibrating(){

        System.out.println("phone is vibrating");
    }

}

class square{

    int side;

    public int area(){

        return side*side;


    }

    public int parametre(){

        return 4*side;
    }
}


public class OopPRA {


    public static void main(String[] args) {


        employee persion=new employee();
        employee persion1=new employee();
        employee persion2=new employee();





        persion.setname("prasad mhetre");

        System.out.println( persion.getName());

        persion.salary=788;

        System.out.println(persion.getSalary());

        cellphone asus=new cellphone();


            asus.ringing();
            asus.vibrating();


            square obj =new square();
            obj.side=34;


            int x=obj.area();
            int y = obj.parametre();

             System.out.println("the area of square is "+"\n"+x+"\nand the parameter of square is"+"\n"+y);















    }

}
