package OOP;


public class MyClass {
     
    

     public int avg(int a, int b, int c) {
         return (a + b + c) / 3;
     }

     public int avg(double a, double b, double c) {
         return (int) (a + b + c) / 3;
     }

     public int avg(long a, long b, long c) {
         return (int) (a + b + c) / 3;
     }


    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.avg(1, 2, 3));
        System.out.println(myClass.avg(1.0, 2.0, 3.0));
        System.out.println(myClass.avg(1L, 2L, 3L));
    }
}