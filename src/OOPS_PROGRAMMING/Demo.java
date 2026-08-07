package OOPS_PROGRAMMING;

public class Demo {
    int age;
    String name;

    @Override
    public String toString() {
        return "Demo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
        Demo( int age, String name){
            this.age = age;
            this.name = name;
        }

        public static void main (String[] args){
            Demo ravi = new Demo(18, "ravi gupta");

            Demo aman = new Demo(30, "aman gupta");

            System.out.println(ravi);
            System.out.println(aman);
        }
    }
