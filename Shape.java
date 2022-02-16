package assignment1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shape {
    ArrayList<Point> pointArrayList;
    ArrayList<Double> pointDistance;

    public Shape(){
        pointArrayList = new ArrayList<>();
        pointDistance = new ArrayList<>();
    }

    public void addPoint (Point point){
        pointArrayList.add(point);
    }
    public ArrayList <Point> getPointArrayList(){
        return pointArrayList;
    }

    public void pointDistance(){
        for(int i = 0; i < pointArrayList.size(); i++) {
            pointDistance.add(pointArrayList.get(i).distance(pointArrayList.get((i+1)%pointArrayList.size())));
        }
    }

    public double calculatePerimeter() {
        double P = 0;
        for(int i = 0; i < pointArrayList.size(); i++) {
            P += pointDistance.get(i);
        }
        return P;
    }

    public double longestSide() {
        double longest = 0;
        for(int i = 0; i < pointArrayList.size(); i++) {
            longest = (longest < pointDistance.get(i)) ? pointDistance.get(i) : longest;
        }
        return longest;
    }
    public double average() {
        double diana;
        diana = calculatePerimeter() ;
        return diana;
    }
}
