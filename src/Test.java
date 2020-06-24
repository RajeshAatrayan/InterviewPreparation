import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class InvalidInputException extends Exception {

}

class Employee {

    private int id = 0;
    private String name = null;
    private boolean male = true;

    Employee(int id, String name, boolean male) {
        super();
        this.id = id;
        this.name = name;
        this.male = male;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ",  male=" + male + "]";
    }

    @Override
    public int hashCode() {
        // Complete all relevent code
        return this.id;
    }


}

public class Test {

    public int isMatch(final String str, final String pattern) {
        char pat[] = new char[pattern.length()];
        int windex = 0;
        boolean firstTime = true;
        for (char ch : pattern.toCharArray()) {
            if (ch == '*' && firstTime) {
                pat[windex++] = ch;
                firstTime = false;
            } else if (ch != '*') {
                pat[windex++] = ch;
                firstTime = true;
            }
        }
        System.out.println(windex);
        boolean dp[][] = new boolean[str.length() + 1][windex + 1];
        dp[0][0] = true;
        if (pat[0] == '*') {
            dp[0][1] = true;
        }


        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str.charAt(i - 1) == pat[j - 1] || pat[j - 1] == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pat[j - 1] == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        return dp[dp.length - 1][windex] ? 1 : 0;
    }

    public static void main(String[] str) {
        System.out.println(new Test().isMatch("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "*b"));
    }

}