public class Main {
    public static void main(String[] args) {
        Task john = new Task();
        john.displayTriangles();
        System.out.println(john.isRightTriangle());
        john.alterMaxi(29.4);
        john.displayTriangles();
        System.out.println(john.perimeter());
        System.out.println(john.isTriangle());

        Task greg = new Task(4,7,2);
        greg.displayTriangles();
        System.out.println(greg.area());
        System.out.println(greg.isRightTriangle());
        System.out.println(greg.perimeter());
        System.out.println(greg.isTriangle());
    }
}
