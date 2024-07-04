package Creational.Prototype;

public class Student implements Proto{

    String name;
    String batch;
    int gradYr;
    double psp;
    private double avgBatchPsp;

    public Student(Student st) {

        this.name=st.name;
        this.batch=st.batch;
        this.gradYr= st.gradYr;
        this.psp=st.psp;
        this.avgBatchPsp = st.avgBatchPsp;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                ", gradYr=" + gradYr +
                ", psp=" + psp +
                ", avgBatchPsp=" + avgBatchPsp +
                '}';
    }

    public Student() {

    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setGradYr(int gradYr) {
        this.gradYr = gradYr;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public Student clone(){
        return new Student(this);
    }
}
