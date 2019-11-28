public class Test{
    public static void main (String[] args) {
        
        double num[] ={5.5,10.1,11,12.8,56.9,2.5};
        float floatResult = 0;
        for(int i =0;i<6;++i)
        floatResult = (float)(floatResult+num[i]);
        System.out.println(floatResult/6);
    }
}