public class Cylinder extends Circle{
    private double height;
    Cylinder(double r,String c,double h){
        super(r, c);
        height=h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getRadius()*height;
    }

    @Override
    public String toString() {
        return "a Cylinder with height of "+height+", radius of "+super.getRadius()+" and color "+super.getColor();
    }
}
