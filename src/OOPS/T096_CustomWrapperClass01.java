package OOPS;

class VIT{
    private double d;

    VIT(double d){
        this.d=d;
    }
    public void setD(double d){
        this.d=d;
    }

    @Override
    public String toString(){
        return Double.toString(this.d);
    }
}
public class T096_CustomWrapperClass01 {
    public static void main(String[] args) {
        VIT vit=new VIT(7.7);
        vit.setD(7.7);
        System.out.println(vit);
    }
}
