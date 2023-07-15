package forPractice;

public interface Subtraction {
    int sub(int x, int y);
}

 class Sub {
    public static void main(String[] args) {
        Subtraction s = (x, y) -> x - y;
        int z = s.sub(10, 4);
        System.out.println(z);
    }
}