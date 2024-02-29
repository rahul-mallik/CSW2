package CSW2ASS1.Q2;

public class Rectangle {
    private double length,width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    void setLength(double length){
        this.length=length;
    }

    void setWidth(double width){
        this.width=width;
    }

    double getLength(){
        return length;
    }

    double getWidth(){
        return width;
    }


    double area(){
        return length*width;
    }

    double perimeter(){
        return 2*(length+width);
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12.5,7);
        System.out.println("Area: "+r1.area()+
                "\nPerimeter: "+ r1.perimeter());
    }
}


/*
    Output
        Area: 87.5
        Perimeter: 39.0
 */
