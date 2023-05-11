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
		ComplexNumber temp = new ComplexNumber();
		temp.a = this.a*c.a - this.b*c.b;
		temp.b = this.a*c.b + this.b*c.a;
		System.out.print("Multiply: ");
		temp.output();
	}
	
	//giang
	public void divide(ComplexNumber c) 
	{
		ComplexNumber temp = new ComplexNumber();
		temp.a = (this.a*c.a + this.b*c.b)/(this.a*this.a + this.b*this.b);
		temp.b = (this.a*c.b - this.b*c.a)/(this.a*this.a + this.b*this.b);
		System.out.print("Divide: ");
		temp.output();	
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
