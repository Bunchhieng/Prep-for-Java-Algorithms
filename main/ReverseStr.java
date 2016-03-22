package main;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "Bunchhieng";
        System.out.println("Reverse of: " + str + " is " + reverse(str));
    }

    public static String reverse(String str) {
        char[] in = str.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}
