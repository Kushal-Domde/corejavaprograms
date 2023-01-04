  WAJP to demonstrate use final keyword in case of variable

class FinalVariable 
{
    final int marks1=56;
    int marks2=76;
    int marks3=98;
    void change()
    {
		int marks2=65;
		int marks3=88;
		System.out.println("Marks of second and third  subjects are  " +marks2+"  "+marks3); 
    }
    class   FinalVariableChild extends FinalVariable 
    {
		void change()
		{
            	marks1=75;
		}
	}
    public void display()
    {
        System.out.println("Marks of 3 subjects are "+marks1+" "+marks2+" "+marks3); // error: cannot assign a value to final variable marks1
    }
}
class FinalVariableImplementer
{
    public static void main(String[] args) 
    {
         FinalVariable finalVariable=new FinalVariable();  
    }
}


