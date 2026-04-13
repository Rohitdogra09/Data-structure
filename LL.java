import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("List");
        list.addFirst("This");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.print("NUll");
        System.out.println();

        list.removeFirst();
        System.out.println(list);
    }
}
