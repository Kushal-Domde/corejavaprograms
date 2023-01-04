WAJP to demonstrate use final keyword in case of class

final class ParentClass 
{
    void showData() 
    {
        System.out.println("This is a method of final Parent class");
    }
}
class ChildClass extends ParentClass 

{
    void showData() 
    {
        System.out.println("This is a method of Child class");
    }
}
class MainClass
{
    public static void main(String arg[])
    {
        ParentClass parentClass= new ChildClass();
        parentClass.showData();
    }
}
