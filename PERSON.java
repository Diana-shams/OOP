package Q6;

public class PERSON {
    String name;
    String address;
    String email;
    String Phoneno;
    public PERSON(){}

    @Override
    public String toString() {
        return "class name"+getClass().getName()
                +"person name"+name;
    }
}
