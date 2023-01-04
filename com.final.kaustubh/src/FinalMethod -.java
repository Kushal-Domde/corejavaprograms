
// WAJP to demonstrate use final keyword in case of methods

class FinalMethod 
{
    public final void marry() {System.out.println("you will marry with my choice  girl and due to that you will get my all property");
			      }
}
class Child extends  FinalMethod
{
    void marry()
    {
         System.out.println("Sorry father! but i can't  marry with your choice  girl");
         System.out.println("I am ok with not getting your property i already have Ratan tata sirs property");
    }
}    
class FinalMethodImplementer 
{
    public static void main(String[] args) 
    {
         FinalMethod finalMethod=new FinalMethod();
         finalMethod.marry();
    }
}



