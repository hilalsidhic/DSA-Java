public class Wrappereg {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b =20;
        swap(a,b);
        System.out.println(a+" "+b);
        final A hilal = new A("hilal");
        hilal.name = "altered";
        System.out.println(hilal.name);
        A obj;
        for (int i = 0; i < 10000000; i++) {
            obj = new A("new name for the variabel");
        }
    }
    public static void swap(Integer a ,Integer b){
        Integer temp =  a;
        a = b ;
        b = temp ;
    }
}
 class A{
    final int marks = 10;
    String name;
    A(String name) {
        this.name = name;
    }

     @Override
     protected void finalize() throws Throwable {
         System.out.println("OBject is destroyed");
     }
 }
