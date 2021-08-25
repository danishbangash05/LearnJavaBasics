package SET;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> set = new java.util.HashSet<String>();

        set.add("Danish");
        set.add("Hamza");
        System.out.println(set);

        if (set.contains("Danish")){
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }

    }
}
