package Q6;

public class Student extends PERSON{

    final String status;
    public Student(String status)
    {   if(status="freshman"||status="sophomore"||status="senior"||status="jenior")
        this.status=status;
    }
}
