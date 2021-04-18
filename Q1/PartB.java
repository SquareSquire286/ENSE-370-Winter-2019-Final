/*

Assume that all classes in your design in Part A have been implemented except the public class MathSolverDemo. Write the Java implementation of the MathSolverDemo class. In your main() method, you should create all the necessary object instances in your design, and then call the appropriate methods to (i) get user input, (ii) get an algorithm, (iii) solve the math problem, and (iv) update the display. State any other assumptions that you have made.

*/

public class MathSolverDemo
{
    public static void main(String[] args)
    {
        MathSolverDemo demo = new MathSolverDemo();
      
        MathSolverDisplay view = new MathSolverDisplay();
        MathSolver model = new MathSolver();
      
        MathSolverInterface controller = new MathSolverInterface(model, view);
      
        controller.getUserInput(); // obtain user input
        controller.setAlgorithmID(String); // obtain an algorithm from the library (internal logic handled in the model, which is invoked by the controller)
        String solution = controller.solveProblem(); // solve the math problem (internal logic handled in the model, which is invoked by the controller)
        controller.updateDisplay(solution); // update the display with the information retrieved from the model
      
        return;
    }
}
