import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(word.substring(a, b + 1));
    }
}