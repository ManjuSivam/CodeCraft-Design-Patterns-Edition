package Creational.Prototype;

public class IntelligentStudent extends Student{

    int iq;
    public IntelligentStudent(IntelligentStudent st) {
        super(st);
        this.iq=st.iq;
    }

    public IntelligentStudent() {
        super();

    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this); //returning cloned obj
    }
}
