public class Main {
    public static void main(String[] args) {

        Question1();

        }
        public  static void Question1(){
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
    }
