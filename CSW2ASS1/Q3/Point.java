package CSW2ASS1.Q3;

public class Point {
    private int x, y;

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    Point(Point obj){
        this.x = obj.x;
        this.y = obj.y;
    }

    void setX(int x){
        this.x=x;
    }

    void setY(int y){
        this.y=y;
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }


    public static void main(String[] args) {
        Point p = new Point(12,34);
        Point k = new Point(p);

        System.out.println("Values of p:" +
                "\n X: "+p.getX()+
                "\n Y: "+p.getY());

        System.out.println("Values of k:" +
                "\n X: "+k.getX()+
                "\n Y: "+k.getY());

        k.setX(32);
        k.setY(1);

        System.out.println("Updated Values of k:" +
                "\n X: "+k.getX()+
                "\n Y: "+k.getY());
    }

}


/*
    Output
        Values of p:
         X: 12
         Y: 34
        Values of k:
         X: 12
         Y: 34
        Updated Values of k:
         X: 32
         Y: 1

 */
