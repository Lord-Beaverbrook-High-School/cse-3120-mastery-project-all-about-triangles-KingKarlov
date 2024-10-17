import java.util.Arrays;
import static java.lang.Math.round;

public class Task {
  private double mini = 3.0;
  private double medi = 4.0;
  private double maxi = 5.0;

  //empty constructor
  public Task()
  {
      this.mini = mini;
      this.medi = medi;
      this.maxi = maxi;
  }
    // input constructor
    public Task(double num1, double num2, double num3)
    {
        double[] sides = {num1, num2, num3};
        Arrays.sort(sides);

        this.mini = sides[0];
        this.medi = sides[1];
        this.maxi = sides[2];
    }
    // maximum mutator
    public void alterMaxi(double num1)
    {
        this.maxi = num1;
    }

    // Medium mutator
    public void alterMedi(double num1)
    {
        this.medi = num1;
    }

    // minimum mutator
    public void alterMini(double num1)
    {
        this.mini = num1;
    }

    public void displayTriangles()
    {
      System.out.println("Smallest side: " + this.mini);
      System.out.println("Medium side: " + this.medi);
      System.out.println("Maximum side: " + this.maxi);
    }

    public double perimeter()
    {
      return this.mini + this.medi + this.maxi;
    }

    public double area()
    {
        double vari = this.perimeter() / 2;
        double temp = vari - this.mini;
        temp += vari - this.medi;
        temp += vari - this.maxi;
        temp *= vari;
        return Math.sqrt(temp);
    }

    public boolean isTriangle()
    {
        if (this.mini + this.medi > this.maxi){
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isRightTriangle()
    {
        double miniS = this.mini * this.mini;
        double mediS = this.medi * this.medi;
        double maxiS = this.maxi * this.maxi;

        double temp = miniS + mediS;
        temp = round(temp * 10) / 10.0;

        if (temp == maxiS){
            return true;
        }
        else
        {
            return false;
        }
    }
}