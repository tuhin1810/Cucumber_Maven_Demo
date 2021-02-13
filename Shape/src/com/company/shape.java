package com.company;


public interface shape{

    public void draw();
    public void erase();
}
class circle implements shape{

    public void draw()
    {
        System.out.println("Circle draw");
    }
    public void erase()
    {
        System.out.println("Erase Circle");
    }
}
class triangle implements shape{
    public void draw()
    {
        System.out.println("Draw Triangle");
    }
    public void erase()
    {
        System.out.println("Erase Circle");
    }

}
class square implements shape{

    public void draw()
    {
        System.out.println("Draw Square");
    }
    public void erase()
    {
        System.out.println("Erase Square");
    }

}

class Main {

    public static void main(String[] args) {
	// write your code here
        shape s1, s2, s3;

        s1= new circle();
        s2= new triangle();
        s3= new square();

        s1.draw();
        s2.draw();
        s3.draw();

         s1.erase();
         s2.erase();
         s3.erase();

    }
}
