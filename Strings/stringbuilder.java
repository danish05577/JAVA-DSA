public class stringbuilder {

    public static void uppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1 ; i < str.length() ; i++) {
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    //String compression
    public static void compress(String str3) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0 ; i< str3.length() ; i++) {
            char ch = str3.charAt(i);
            Integer count = 1;
            while (i < str3.length()-1 && str3.charAt(i+1) == ch) {
                count++;
                i++;
            }
            sb.append(ch);
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        System.out.println(sb);
    }
    public static void main(String arg[]) {
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a' ; ch <= 'z' ; ch++) {
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        // String str = "hi, i am danish";
        // uppercase(str);
        String str3 = "aaabbcccdd";
        compress(str3);
    }
}
