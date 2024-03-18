import Collection.GbList;
import Lists.GbArrayList;

public class Main {
    public static void main(String[] args) {
        GbList<Integer>list = new GbArrayList<>();
        list.add(5);
        list.add(6);
        System.out.println(list.size());
        System.out.println(list);

    }
}