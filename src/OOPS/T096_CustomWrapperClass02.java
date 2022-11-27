package OOPS;

class VIT02{
    private int i;
    VIT02(int i){
        this.i=i;
    }

    @Override
    public String toString(){
        return Double.toString(i);
    }
}
public class T096_CustomWrapperClass02 {
    public static void main(String[] args) {
        VIT02 vit02=new VIT02(45);
        //want to convert the above String into primitive(int)
//        int a=Integer.parseInt(vit02.toString()); ---> to convert to integer, but yaha p error dega ye bcz hum double ko int m rakhne ki kosis kr rhe hai
        //want to convert the above String into primitive(float)
        float aF=Float.parseFloat(vit02.toString());
        //want t convert the above String into object(Integer)
//        Integer aObj=Integer.valueOf(vit02.toString()); ---> to convert to Integer Object, but yaha p error dega ye bcz hum double ko int m rakhne ki kosis kr rhe hai
        //want t convert the above String into object(Float)
        Float aObjF=Float.valueOf(vit02.toString());



        System.out.println(vit02);//it will call .toString() as default
        System.out.println(aObjF);
    }
}