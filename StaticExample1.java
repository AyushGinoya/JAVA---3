class Student
{
    private String roll_num;
    private static int count=1;

    private String generaterollnum()
    {
        //Date d=new Date();
        String rn="DDU-"+"2022"+"-"+count;
        count++;
        return rn;
    }
    Student()
    {
        roll_num=generaterollnum();
    }  
    public String getroll()
    {
        return roll_num;
    }

}
public class StaticExample1 {
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        System.out.println(s1.getroll());
        System.out.println(s2.getroll());
        System.out.println(s3.getroll());
    }
}
