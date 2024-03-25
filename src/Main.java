
// Ali Eren KÖSE

public class Main {
    public static void main(String [] args) {
        ListClass<Integer> list = new ListClass<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.print(); // Print list
        System.out.println();

        System.out.println("Third value is "+ list.get(2));

        System.out.println("Index 1 is removed!");
        list.remove(1);
        list.print();
    }
}
