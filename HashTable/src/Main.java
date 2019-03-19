public class Main {

    public static void main(String[] args) {
        HashTable<String, Integer> map = new HashTable<String, Integer>();
        map.add("Keith", 22);
        map.add("JP", 19);
        map.add("Caleb", 20);
        map.add("Keith", 21);

        System.out.println("Hash Table Size: " + map.size());
        System.out.println("Value for key Keith: " + map.get("Keith") );
        System.out.println("Removing key Keith: " + map.remove("Keith"));
        System.out.println("Removing key Keith: " + map.remove("Keith"));
        System.out.println("Hash Table Size: " + map.size());
        System.out.println("Hash Table isEmpty: " + map.isEmpty());
    }
}
