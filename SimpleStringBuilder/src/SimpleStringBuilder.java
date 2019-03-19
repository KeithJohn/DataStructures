public class SimpleStringBuilder {

    private static final int BUFFER_MULTIPLIER = 2;
    private static final int DEFAULT_SIZE = 32;

    private char[] str;
    private int size;
    private int charCount;

    //CONSTRUCTORS
    public SimpleStringBuilder(){
        this.size = DEFAULT_SIZE;
        this.str = new char[DEFAULT_SIZE];
    }

    public SimpleStringBuilder(char[] str){
        this.append(str.toString());
    }

    public SimpleStringBuilder(String str){
        this.append(str);
    }

    public SimpleStringBuilder(int size){
        this.size = size;
    }

    //METHODS
    public SimpleStringBuilder append(String str){
        while (resizeRequired(str)){
            resizeBuffer(str);
        }
        addString(str);
        updateCharCount(str.length());
        return this;
    }

    private boolean resizeRequired(String str){
        return this.charCount + str.length() > this.size;
    }

    private void resizeBuffer(String str){
        int oldSize = this.size;
        this.size *= BUFFER_MULTIPLIER;
        char[] newStr = new char[this.size];
        System.arraycopy(this.str, 0, newStr, 0, oldSize);
        this.str = newStr;
    }

    private void addString(String str){
        System.arraycopy(str.toCharArray(), 0, this.str, this.charCount, str.length());
    }

    private void updateCharCount(int charCount){
        this.charCount += charCount;
    }
}
