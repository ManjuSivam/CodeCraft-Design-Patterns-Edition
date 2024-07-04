package Creational.Prototype;

public class Client {

    private static void fillRegistry(Registry studentRegistry) {
        Student student = new Student();
        student.setBatch("CS2009");
        student.setAvgBatchPsp(76.9);
        student.setGradYr(2013);
        studentRegistry.addStudentType("CS2009",student);

        Student student2 = new Student();
        student2.setBatch("CS2010");
        student2.setAvgBatchPsp(87.8);
        student2.setGradYr(2014);
        studentRegistry.addStudentType("CS2010",student2);

        IntelligentStudent student3 = new IntelligentStudent();
        student3.setBatch("CS2011");
        student3.setAvgBatchPsp(99.2);
        student3.setIq(100);
        student3.setGradYr(2015);
        studentRegistry.addStudentType("CSInt2011",student3);

    }

    public static void main(String[] args) {
        Registry stReg = new Registry();
        fillRegistry(stReg);

        Student abc = stReg.getStudent("CS2009").clone();
        abc.setName("abc");
        abc.setPsp(98.0);

        Student qwer = stReg.getStudent("CSInt2011").clone();
        qwer.setPsp(99.0);
        qwer.setName("qwer");

        System.out.println(abc.toString());
        System.out.println(qwer.toString());


    }
}
