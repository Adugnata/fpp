package collection;
import java.util.ArrayList;
import java.util.Arrays;
public class StringList {
    private final int INITIAL_LENGTH = 4;
    private String[] a;
    private int size;

    public StringList()
    {
        a = new String[INITIAL_LENGTH];
        size = 0;
    }
    public void add(String s){
        if(s==null) return;
        if(size == a.length) resize();
        a[size++] = s;

    }
    public String get(int i){
        if(i<0 || i >= size)
            return null;
        return a[i];
    }
    public boolean find(String s){
        if(s==null) return false;
        for(String t: a)
            if(t.equals(s))
                return true;
        return false;
    }
    public void insert(String s, int pos){
        if(pos > size || pos < 0 ) return;
        if(pos== a.length || size + 1 > a.length)
            resize();
        String [] t = new String[a.length+1];
        System.arraycopy(a, 0, t,0,pos);
        t[pos] = s;
        System.arraycopy(a, pos,t,pos+1,a.length-pos);
        a = t;
        ++size;
    }
    public boolean remove(String s){
        if(size == 0) return false;
        if(s==null) return false;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(a[i].equals(s))
            {
                index =i;
                break;
            }
        }
        if(index == -1) return false;
        String[] t = new String[a.length];
        System.arraycopy(a,0,t,0,index);
        System.arraycopy(a,index+1,t,index,a.length-(index+1));
        a = t;
        --size;
        return true;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size-1; i++) {
            sb.append(a[i] + ", ");
        }
        sb.append(a[size-1] + "]");
        return sb.toString();
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void resize(){
        a = Arrays.copyOf(a,a.length<<1);
    }
    public Object clone(){
        return Arrays.copyOf(a,size);
    }

    public static void main(String[] args) {
        StringList sl = new StringList();
        sl.add("Tesfa");
        sl.add("Michael");
        sl.add("Amsalu");
        System.out.println(sl);
        sl.remove("Tesfa");
        for (int i = 0; i < sl.size; i++) {
            System.out.println(sl.get(i));
        }
        System.out.println(sl.find("Michael"));
        sl.insert("tesfa",0);
        System.out.println(sl);
    }

}
