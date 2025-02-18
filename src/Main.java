public class Main {
    public static void main(String[] args) {

        Question1();
        Question2();
        Question3();



        }
        public  static void Question1(){

            System.out.println("Question #1");
            Person p = new Person("Bryan","512 Rubyville", 22);
            Person p1 = new Person("Alice","123 Main St.", 19);
            Person p2 = new Person("Mark","712 Pinagbuhatan", 25);
            Person p3 = new Person("Leah","22 New york Ave.", 32);
            Person p4 = new Person("Ryan","66 Malinao St.", 29);

            p.Objectinfo();
            p1.Objectinfo();
            p2.Objectinfo();
            p3.Objectinfo();
            p4.Objectinfo();
        }

        public  static  void Question2(){

            System.out.println("Question #2");
            Dog d = new Dog("Rocky","Aspin");
            d.Objectinfo();
            d.setName("Bato");
            d.setBreed("Filipino witch dog");
            System.out.println("Modified Attributes");
            d.Objectinfo();

            Dog d1 = new Dog("Sky", "Shih Tzu");
            d1.Objectinfo();
            d1.setName("Langit");
            d1.setBreed("Poodle");
            System.out.println("Modified Attributes");
            d1.Objectinfo();
        }

        public  static  void Question3(){

            System.out.println("Question #3");
            Rectangle r = new Rectangle(55, 29);
            System.out.println("Area of the Rectange was "+ r.Area());
            System.out.println("Perimeter of the Rectangle was "+ r.Perimeter());
        }
    }
