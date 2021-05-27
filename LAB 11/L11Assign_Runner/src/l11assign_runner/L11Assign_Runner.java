package l11assign_runner;

public class L11Assign_Runner {

    
    public static void main(String[] args) {
        Shape[] S = new Shape[6];
        S[0] = new Rectangle(3.1, 3);
        S[1] = new Rectangle(5, 2.7);
        S[2] = new Circle(3);
        S[3] = new Circle(2.2);
        S[4] = new Triangle(5.5, 7);
        S[5] = new Triangle(9, 1.1);
        CalculateAreas.calArea(S);
    }
}