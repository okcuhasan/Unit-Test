package app;

public class JunitExam {
   
    public static int wordsCount(String[] words, int len) {

        int count = 0;
        if (len <= 0) {
            throw new IllegalArgumentException();
        }
            for (String str : words)
                if (str.length() == len) {
                    count++;
                }
            return count;
        }

}

