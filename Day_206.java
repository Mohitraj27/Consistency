//Example of Abstract Class
abstract class Day_206
{
    abstract void draw();


} 
class Rectangle extends Day_206{
    void draw(){
        System.out.println("drawing Rectangle");
        
    }
    }
    class Circle1 extends Day_206{
        void draw(){
            System.out.println("drawing circle");
        }
        }
    class Shape{
            public static void main(String args[])
            {
                Day_206 s=new Circle1();
                s.draw();
            }
        }
