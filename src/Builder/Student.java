package Builder;

public class Student {
    String name;
    int age;
    int gradYear;
    int phoneNo;

    private Student (Builder builder){
        this.name=builder.getName();
        this.age=builder.getAge();
        this.gradYear= builder.getGradYear();
        this.phoneNo=builder.getPhoneNo();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradYear=" + gradYear +
                ", phoneNo=" + phoneNo +
                '}';
    }

    public static class Builder{
        String name;
        int age;
        int gradYear;
        int phoneNo;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public int getPhoneNo() {
            return phoneNo;
        }

        public Builder setPhoneNo(int phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Student build(){
            if(this.getAge()<18){
                throw new RuntimeException("Age should not be less than 18");
            }
            if(this.getGradYear()>2023){
                throw new RuntimeException("Grad yr should not be greater than 2023");
            }

            return new Student(this);
        }
    }

}
