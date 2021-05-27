package l11assign_runner;

public class CalculateAreas {
    public static void calArea(Shape[] S)
    {
        double[] AreasOfRectangles = new double[1];
        double[] AreasOfCircles = new double[1];
        double[] AreasOfTriangles = new double[1];
        
        for(int i = 0; i < S.length; i++)
        {
            if (S[i] instanceof Rectangle)
            {
                double r = ((Rectangle)S[i]).area();
                AreasOfRectangles = CalculateAreas.append(AreasOfRectangles, r);
            }
            else if (S[i] instanceof Circle)
            {
                double c = ((Circle)S[i]).area();
                AreasOfCircles = CalculateAreas.append(AreasOfCircles, c);
            }
            else if (S[i] instanceof Triangle)
            {
                double t = ((Triangle)S[i]).area();
                AreasOfTriangles = CalculateAreas.append(AreasOfTriangles, t);
            }
        }
        System.out.print("Areas of rectangles: ");
        for(int i = 0; i < AreasOfRectangles.length; i++)
        {
            System.out.printf("%.1f, ", AreasOfRectangles[i]);
        }
        System.out.print("\nAreas of circles: ");
        for(int i = 0; i < AreasOfCircles.length; i++)
        {
            System.out.printf("%.1f, ", AreasOfCircles[i]);
        }
        System.out.print("\nAreas of triangles: ");
        for(int i = 0; i < AreasOfTriangles.length; i++)
        {
            System.out.printf("%.1f, ", AreasOfTriangles[i]);
        }
        System.out.println(" ");
    } 
    
    public static double[] append(double[] list, double area)
    {
        if(list[0] == 0)
        {
            list[0] = area;
            return list;
        }
        else
        {
            double[] temp = list;
            list = new double[temp.length + 1];
            for(int i = 0; i < list.length - 1; i++)
            {
                list[i] = temp[i];
            }
            list[list.length-1] = area;
            return list;
        }
    }
}