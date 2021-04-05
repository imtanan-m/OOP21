package p_l1act2_runner;

public class Car {
    int carModel;
    String carName;
    int carPrice;
    String carOwner;
    
    
public void setcarModel(int m)
{
    carModel = m;
}

public void setcarName(String n)
{
    carName = n;
}

public void setcarPrice (int p)
{
    carPrice = p;
}

public void setcarOwner(String o)
{
    carOwner = o;
}

public void Display()
{
    System.out.println("Car Model: " + carModel + "\nCar Name: " + carName + "\nCar Price: " + carPrice + "\nCar Owner: " + carOwner);
}

}
