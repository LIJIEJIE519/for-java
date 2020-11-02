public class Test01 {

    private int sex;
    private int age;

    Test01(int sex, int age) {
        this.sex = sex;
        this.age = age;
    }
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "sex=" + sex +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Test01 test = new Test01(2, 20);
        System.out.println(test);
    }
}
