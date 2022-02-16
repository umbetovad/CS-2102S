package assignment1;

        import java.io.FileNotFoundException;
        import java.util.ArrayList;
        import java.util.Scanner;
        import java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException  {
        Shape shape1;
        shape1 = new Shape();
        Shape shape2 = new Shape();
        Scanner scanner1 = new Scanner(new File("C:/Users/Lenovo IP5/IdeaProjects/untitled/src/assignment1/file1.txt"));
                Scanner scanner2 = new Scanner(new File("C:/Users/Lenovo IP5/IdeaProjects/untitled/src/assignment1/file2.txt"));
        int x;
        int y;
        while(scanner1.hasNextLine()) {
            x = scanner1.nextInt();
            y = scanner1.nextInt();
            Point point = new Point(x, y);
            shape1.addPoint(point);
        }
        while(scanner2.hasNextLine()) {
            x = scanner2.nextInt();
            y = scanner2.nextInt();
            Point point = new Point(x, y);
            shape2.addPoint(point);
        }
        shape1.pointDistance();
        shape2.pointDistance();
        System.out.println("Perimeter of 1 shape: " + shape1.calculatePerimeter());
        System.out.println("Longest side length: " + shape1.longestSide());
        System.out.println("Perimeter of 2 shape: " + shape2.calculatePerimeter());
        System.out.println("Longest side length: " + shape2.longestSide());
        System.out.println("Average length of 1 shape sides: " + shape1.average());
        System.out.println("Average length of 2 shape sides: " + shape2.average());
        ArrayList<Point> copiedPointArrayList = shape2.getPointArrayList();
    }
}
