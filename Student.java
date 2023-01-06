public class Student {
    public String name;
    public int age;
    public String group;

    public static void main(String[] args) {
        Student Nan = new Student();
        /*
         * Nan.name = "ffff";
         * Nan.age = 9999;
         * Nan.group = "65/45";
         */

        Nan.setData("ffff", 9999, "65/45");

        Nan.getData();
        // Nan.printName();
        // Nan.printAge();
        // Nan.printGroup();
    }

    public void setData(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void getData() {
        System.out.println(this.name + " is " + this.age + " years old and is in group " + this.group);
    }

}
