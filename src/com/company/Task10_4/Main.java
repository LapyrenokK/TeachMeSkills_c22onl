package com.company.Task10_4;


public class Main {
    public static void main(String[] args) {
        String words = "ffff ab f 12344 jkjkk ttttt";
        String[] arrWords = words.split(" ");
        int count = 0;
        int[] arrSymbolNum;
        int[] arrInt = new int[arrWords.length];
        int firstNumInArr = arrInt[0];
        int index = 0;
        for (int i = 0; i < arrWords.length; i++) {
            arrSymbolNum = new int[arrWords[i].length()];
            for (int j = 0; j < arrWords[i].length(); j++) {
                arrSymbolNum[j] = arrWords[i].charAt(j);
            }
            for (int a = 0; a < arrSymbolNum.length; a++) {
                for (int b = a + 1; b < arrSymbolNum.length; b++) {
                    if (arrSymbolNum[a] == arrSymbolNum[b]) {
                        count++;
                    }
                }
            }
            arrInt[i] = count;
            count = 0;
        }
        for (int i = 0; i < arrWords.length; i++) {
            if (arrInt[i] > firstNumInArr) {
                firstNumInArr = arrInt[i];
                index = i;
            }
        }
        System.out.println("Word in which the number of different characters is minimal: " + arrWords[index]);
    }
}
