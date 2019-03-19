import java.util.Arrays;

public class SimpleArrayList {
    private Object[] array;
    private int size = 0;
    private int length;

    //CONSTRUCTOR
    public SimpleArrayList(){
        array = new Object[16];
        length = 16;
    }

    public int size(){
        return size;
    }

    public int length(){
        return length;
    }

    private void increaseLength(){
        length = length*2;
        array = Arrays.copyOf(array, length() );
    }

    public Object get(int index){
        if (index < size){
            return array[index];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object obj){
        if (array.length - size <= 3){
            increaseLength();
        }
        array[size++] = obj;
    }

    public Object remove(int index) {
        if (index < size) {
            Object obj = array[index];
            array[index] = null;
            int tmp = index;
            while (tmp < size) {
                array[tmp] = array[tmp + 1];
                array[tmp + 1] = null;
            }
            size--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}
