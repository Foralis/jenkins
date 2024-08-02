package org.example.tmp.tinkoffExerсise;

public class ex01 {
    /*
    ЗАДАЧА 1
Дана строка из латинских заглавных букв. Необходимо заменить все повторы одинаковых подряд идущих букв на букву + цифру. Одиночные буквы заменять не надо.

Примеры

encode("AAAABBBC") => "A4B3C"
encode("AAAABBBCAAA") => "A4B3CA3"
     */
    public static void main(String[] args) {
        String input1 = "AAAABBBV";
        String input2 = "AAAABBBCAAA";

        System.out.println(encode(input1));
        //encode(input2);
    }

    private static String encode(String input) {
        String[] strArray = input.split("");
        String tmp = "";
        StringBuilder result = new StringBuilder();
        for (String s : strArray
        ) {
            if (tmp.contains(s)) {
                tmp = tmp + "s";
            } else {
                if (tmp.length() > 0) {
                    //System.out.print(tmp.split("")[0] + (tmp.length() > 1 ? tmp.length() : ""));
                    result.append(tmp.split("")[0]).append(tmp.length() > 1 ? tmp.length() : "");
                }
                tmp = s;
            }
        }
        //System.out.print(tmp.split("")[0] + (tmp.length() > 1 ? tmp.length() : ""));
        result.append(tmp.split("")[0]).append(tmp.length() > 1 ? tmp.length() : "");
        //System.out.println();
        return result.toString();
    }
}
