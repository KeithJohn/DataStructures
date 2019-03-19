public class Main {

    public static void main(String[] args) {
        SimpleArrayList arrayList = new SimpleArrayList();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(20);

        for(int i = 0; i < arrayList.size(); i++){
            System.out.println("Element at index " + i + ": " + arrayList.get(i));
        }
        System.out.println("Array Length before size 13: " + arrayList.length());
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println("Array Length after size 13: " + arrayList.length());
    }
}
