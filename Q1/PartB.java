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
