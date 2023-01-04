//WAJP to illustrate Use of All Features of Abstract Class

abstract class HelloAbstract 
{
    int number1=56;
    int number2=43;
    int result;
    public abstract void add();
    public void subtract()
    {
        result=number1-number2;
        System.out.println("Subtraction is"+result);
    }
    public abstract void multiply();
    public void divide()    
    {
        result=number1/number2;
        System.out.println("Division is "+result);
    }
} 
class IntermediateAbstract extends HelloAbstract
{
        public void add()
        {
                result=number1+number2;
                System.out.println("Addition is"+result);
        }
        public void multiply()
        {
            result=number1*number2;
            System.out.println("Multiplication is"+result);
        }
}
class Implementer
{
        public static void main(String[] args) 
        {
            IntermediateAbstract intermediateAbstract= new IntermediateAbstract();
            intermediateAbstract.add();
            intermediateAbstract.subtract();
            intermediateAbstract.multiply();
            intermediateAbstract.divide();
            
    }
}
