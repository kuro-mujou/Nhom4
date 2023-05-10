package nhom4;

public class ComplexNumber 
{
	double a,b;
	
	ComplexNumber()
	{
		a = 0;
		b = 0;
	}
	ComplexNumber(double a,double b)
	{
		setA(a);
		setB(b);
	}
	public double getA() 
	{
		return a;
	}
	public void setA(double a) 
	{
		this.a = a;
	}
	public double getB() 
	{
		return b;
	}
	public void setB(double b) 
	{
		this.b = b;
	}
	public void output()
	{
		if(this.b > 0)
			System.out.println(this.a + " +" + this.b + "i");
		else
			System.out.println(this.a + " " + this.b + "i");
	}
	
	//bao
	public void add(ComplexNumber c) 
	{
		class ComplexNumber {
		    int real, image;
		    public ComplexNumber(int r, int i)
		    {
		        this.real = r;
		        this.image = i;
		    }
		    public void showC()
		    {
		        System.out.println(this.real + " +i " + this.image);
		    }
		    public complex add(ComplexNumber, ComplexNumber);
		}
	}
	
	//hieu
	public void subtract(ComplexNumber c)
	{
		ComplexNumber temp = new ComplexNumber();
		temp.a = this.a - c.a;
		temp.b = this.b - c.b;
		System.out.println("Subtract: ");
		temp.output();
	}
	
	//thanh
	public void multiply(ComplexNumber c) 
	{
		
	}
	
	//giang
	public void divide(ComplexNumber c) 
	{
		
	}
	public static void main(String[] args) 
	{
		ComplexNumber c = new ComplexNumber(1,2);
		ComplexNumber d = new ComplexNumber(3,4);
		c.add(d);
		c.subtract(d);
		c.multiply(d);
		c.divide(d);
	}
}
