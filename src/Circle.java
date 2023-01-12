public class Circle {
    private double radius=0;
    private String color="";

    Circle(double r,String c){
        radius=r;
        color=c;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSize(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
    @Override
    public String toString() {
        return "This is a Circle with radius="+radius+" and color: "+color;
    }
}
