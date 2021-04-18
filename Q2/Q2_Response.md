# Question 2 Response

The code for the Car class is undesirable for three primary reasons:

1. The `Engine` and `Weight` classes are data classes; in other words, they serve no meaningful purpose besides storing a particular value in an attribute. It would be much more desirable to merge these classes into `Car`, seeing as though their attributes pertain directly to a physical car.
2. The `Car` class lacks an appropriate design pattern that would enable it to know its own weight class. The conditional logic in `printClassification()` reflects the class' lack of knowledge of its own weight, and is also overly complicated and difficult to read. Creating a `Car` hierarchy predicated on the Factory design pattern would alleviate the need for this conditional logic.
3. Additionally, the conditional logic is unnecessarily repeated twice within the `printClassification()` method. Based on this repetition, it actually appears as if the `engineSize` attribute has no effect on the classification of `Car`. Instead, a `weight` greater than 1000 indicates a heavy `Car`, while a `weight` less than or equal to 1000 indicates a light `Car`. It would likely be more suitable to either remove the `engineSize` attribute, or create a four-subclass hierarchy that accommodates the attribute rather than the two-subclass hierarchy produced from `weight`.

If I were to refactor this code, I would probably implement the following changes:

~~~~
public abstract class Car
{
    public int engineSize;
    public int weight;
    
    public void printClassification()
    {
        System.out.println("Abstract Car");
    }
}
~~~~
~~~~
public class LargeHeavyCar extends Car
{
    public LargeHeavyCar(int engineSize, int weight)
    {
        this.engineSize = engineSize;
        this.weight = weight;
    }
    
    @Override
    public void printClassification()
    {
        System.out.println("Large Heavy Car");
    }
}
~~~~
~~~~
public class LargeLightCar extends Car
{
    public LargeLightCar(int engineSize, int weight)
    {
        this.engineSize = engineSize;
        this.weight = weight;
    }
    
    @Override
    public void printClassification()
    {
        System.out.println("Large Light Car");
    }
}
~~~~
~~~~
public class SmallLightCar extends Car
{
    public SmallLightCar(int engineSize, int weight)
    {
        this.engineSize = engineSize;
        this.weight = weight;
    }
    
    @Override
    public void printClassification()
    {
        System.out.println("Small Light Car");
    }
}
~~~~
~~~~
public class SmallHeavyCar extends Car
{
    public SmallHeavyCar(int engineSize, int weight)
    {
        this.engineSize = engineSize;
        this.weight = weight;
    }
    
    @Override
    public void printClassification()
    {
        System.out.println("Small Heavy Car");
    }
}
~~~~
~~~~
public class CarFactory()
{
    public Car createCar(int engineSize, int weight)
    {
        if (engineSize <= 2000)
        {
            if (weight <= 1000)
                return new SmallLightCar(engineSize, weight);
                
            else return new SmallHeavyCar(engineSize, weight);
        }
        
        else
        {
            if (weight <= 1000)
                return new LargeLightCar(engineSize, weight);
                
            else return new LargeHeavyCar(engineSize, weight);
        }
    }
}
~~~~
