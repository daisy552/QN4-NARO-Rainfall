public class ArrayTraceDemo {
    public static void main(String[] args) {
        int[] r = {12, 5, 20, 8, 15};
        int t = 0;
        for (int i = 0; i < r.length; i++) {
            if (r[i] > 10) t += r[i];
        }
        System.out.println(t);
    }
}