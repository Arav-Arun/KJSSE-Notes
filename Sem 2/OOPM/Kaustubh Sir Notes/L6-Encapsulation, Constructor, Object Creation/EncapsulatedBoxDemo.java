class Box {
        
    private double width;         
    private double height;
    private double depth;
    public void setDimensions(double w, double h, double d){
        width=w;
        height=h;
        depth = d;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getDepth(){
        return depth;
    }
}
public class EncapsulatedBoxDemo {
    public static void main(String[] args) {
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol1,vol2;
    // assign values to instance variables
    mybox1.setDimensions(10, 20, 30);
    mybox2.setDimensions(30, 40, 50);
    // compute volume of first box
    vol1 = mybox1.getWidth() * mybox1.getHeight() * mybox1.getDepth();
    System.out.println("Volume of box 1 is " + vol1);
    // compute volume of second box
    vol2 = mybox2.getWidth() * mybox2.getHeight() * mybox2.getDepth();
    System.out.println("Volume of box 2 is " + vol2);
    }
   }
   
