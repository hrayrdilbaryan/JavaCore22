package classwork.lesson12;

import java.util.Locale;

public class StringTest {

    public static void main(String[] args) {

        String name = "Poxos;Poxosyan";
        name = name.trim();
        System.out.println(name.trim());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String ly = "asdsfly";
        System.out.println(ly.contains("ly"));

        String subName = name.substring(6, 14);
        System.out.println(subName);

        System.out.println("lenght: " + name.length());

        String[] s = name.split(";");
        if (s.length >= 1) {
            System.out.println(s[0]);
            System.out.println(s[1]);
        }

        char[] chars = name.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o'){
                result += "o".toUpperCase();
            }else {
                result += chars[i];
            }
        }
        System.out.println(result);

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));

        }


    }
}
