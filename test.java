//a393081f2aca9b580dedbd330635f63355c6acf4 Access Token Git
class Triangle{
    private int base, height;
    public Triangle(int b, int h){
        this.base = b;
        this.height = h;
        trace();
    }
    private void trace(){
        System.out.println("Area is: " + area() + "\nBase is: " + this.base + "\nHeight is: " + this.height);
    }
    //GET & SET 
    public int getHeight(){
        return this.height;
    }
    public void setHeight(int h){
        this.height = h;
    }
    //////////////////////////////////////
    public boolean isTall(){
        return this.height > 20;
    }
    public float area(){
        return ((float)((this.base * this.height) / 2));
    }
    public void shorten(int h){
        this.height -= h;
        trace();
    }
}
public class week3_oop_quiz {
    public static void main(String args[]) {
        Triangle piramidFace = new Triangle(15, 30);
        System.out.println("Is our figure tall?: " + piramidFace.isTall());
        piramidFace.shorten(11);
        System.out.println("Is our figure tall?: " + piramidFace.isTall());
        

    }
}
