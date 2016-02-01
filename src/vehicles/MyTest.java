package vehicles;

/**
 * Created by Christian on 30-1-2016.
 */

interface Drawable {
    int x = 5;   //   public static final (niet nodig om dit expliciet te benoemen. Is impliciet in deze interface //
    void draw();
}

class MyDrawableImp implements Drawable {
    int xx = 5;
    @Override
    public void draw() {
        System.out.println("I am Drawing");
    }
}

class MyDrawableImp2 implements Drawable {
        @Override
        public void draw() {
       }
}

abstract class MyAbstract implements Drawable{
}

class MyTest2 extends MyDrawableImp {

    int xx = 8;
}

public class MyTest {
    public static void main(String[] args) {
        Drawable d = new MyDrawableImp();

        Drawable d3 = new Drawable(){
            //interface = new interface kan niet want mist een implementatie.
            // Hier een implementatie on the fly van een anonymous class
            @Override
            public void draw() {
                }
            };
        Drawable d2 = new MyDrawableImp2();

        MyDrawableImp chk = new MyTest2();
        System.out.println(chk.xx);
        MyTest2 gg = (MyTest2) new MyDrawableImp();

        System.out.println (new MyTest2().xx);
        // interface is een implementatie van de class. Bij het aanroepen van een interface naam zijn verschillende implementaties te maken.
    }

void method(){

    }
}
