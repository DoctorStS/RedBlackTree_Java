public class Main {

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        for (int i = 1; i <= 6; i++) {
            tree.ins(i);
        }
        System.out.println(tree.find(6));
        System.out.println(tree.find(7));
    }
}    