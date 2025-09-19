import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor mặc định
    public Circle() {
        this.radius = 1;
    }

    // Getter & Setter
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // Nhập bán kính
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        this.radius = sc.nextDouble();
    }

    // Xuất thông tin
    public void output() {
        System.out.println("Thong tin hinh tron:");
        System.out.println("Ban kinh r: " + radius);
    }

    // Diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();  // mặc định
        c1.output();

        Circle c2 = new Circle();
        c2.input();
        c2.output();
        System.out.println("Dien tich: " + c2.getArea());
        System.out.println("Chu vi: " + c2.getPerimeter());
    }
}
