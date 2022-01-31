class Base{
    int x;


    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x= x;
        System.out.println("I'mm getting printed now in base X!");
    }

    public void printMe(){
        System.out.println("I'mm getting printed now!");

    }
}

    class Derived extends Base{
        int y;


        public int getY(){
            return y;
        }
    
        public void setY(int y){
            this.y= y;
        }
    
    }
    





public class HarryInheritance {
    public static void main(String[] args){

        // Creating an object of base class
        
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class

        Derived d = new Derived();
        d.setX(45);
        System.out.println(d.getY());
    }
}
