public class ComplexRecordPatternExample {
    public static void main(String[] args) {
        Object addressObj = new Address("name1", "Hyderabad", "India");
        Object personObj = new Person("Balakrishna", 25, (Address) addressObj);
        String _ = "hello";
        String var1 = "hello";



        //older version using (if and instanceOf)
        if (personObj instanceof Person p) {
            System.out.println("the type 1");
            System.out.printf("name :%s, age:%d,city:%s,country:%s\n",
                    p.name(), p.age(), p.address().city(), p.address().country());
        }
        //java 21 Record Pattern feature (if and instanceOf)
        if (personObj instanceof Person(String name, int age, Address(String n, String city, String country))) {
            System.out.println("the type 2");
            System.out.printf("name :%s, age:%d,city:%s,country:%s\n", name, age, city, country);
        }
        //java 21 record pattern in switch case
        switch (addressObj) {
            case Person(String name, int age, Address(String n, String city, String country)) ->
                    System.out.printf(" Person -->name:%s, age:%d,Address-->name:%s,city:%s,country:%s\n",
                            name, age, n, city, country);
            case Address(String name, String city, String country) ->
                    System.out.printf("Address:---> name:%s,city:%s,country:%s", name, city, country);
            default -> System.out.println("No data matched");
        }
    }
}

