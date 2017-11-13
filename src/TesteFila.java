
public class TesteFila {

    public static void main(String[] args) {
        Fila f = new Fila();
        f.enqueue('a');
        f.enqueue('b');
        f.enqueue('c');
        while (!f.isEmpty()) {
            int x = (int) f.dequeue();
            System.out.print(x);
        }
    }
}
