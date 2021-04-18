# ENSE 370 Winter 2019 Final Exam - Question 2

**PROMPT:** Consider the following implementation of a `Car` class:

~~~~
public class Car
{
    private Engine engine;
    private Weight weight;
    
    public void printClassification()
    {
        if (engine.getEngineSize() <= 2000) // less than 2000cc
        {
            if (weight.getWeight() <= 1000) // less than 1000kg
                System.out.println("Light car");
                
            else System.out.println("Heavy car");
        }
        
        else // greater than 2000cc
        {
            if (weight.getWeight() > 1000) // greater than 2000cc
                System.out.println("Heavy car")
            
            else System.out.println("Light car");
        }
    }
}

public class Engine
{
    private int engineSize;
    
    public int getEngineSize()
    {
        return engineSize;
    }
    
    public void setEngineSize(int engineSize)
    {
        this.engineSize = engineSize;
    }
}

public class Weight
{
    private int weight;
    
    public int getWeight()
    {
        return weight;
    }
    
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
}
~~~~

Give at least **two** reasons why the above code is undesirable and refactor it to make it better.
