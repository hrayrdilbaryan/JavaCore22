package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o')
                count++;
        }
        System.out.println(count);

        int middleIndex = chars.length / 2;
        System.out.print(chars[middleIndex]);
        System.out.println(chars[middleIndex - 1]);

        char[] chars1 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        int lastIndex = chars1.length - 1;
        if (chars1[lastIndex - 1] == 'l'
                && chars1[lastIndex] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean bobThere = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobThere = true;
                break;
            }
        }
        System.out.println(bobThere);

        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' '){
                System.out.print(text[i]);
            }
            
        }

    }


}
