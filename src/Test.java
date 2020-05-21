

import com.sun.deploy.util.ArrayUtil;
import com.sun.org.apache.regexp.internal.RE;
import netscape.security.UserTarget;
import org.omg.CORBA.INTERNAL;
import org.omg.CORBA.MARSHAL;


import javax.print.attribute.HashAttributeSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static BinarySearch.IsPerfectSquare.isPerfectSquare;

/**
 * Created by RajeshAatrayan|InterviewPreparation|PACKAGE_NAME|null.java| on Oct,2019
 * Happy Coding :)
 */


public class Test {
    public int countSquares(int[][] matrix) {
        if (matrix.length == 0) return 0;
        int dp[][] = new int[matrix.length + 1][matrix[0].length + 1];
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 1; i < dp.length; i++) {

            for (int j = 1; j < dp[0].length; j++) {

                if (matrix[i - 1][j - 1] == 1) {
                    int min = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j]));
                    dp[i][j] = min + 1;
                    map.put(dp[i][j], map.getOrDefault(dp[i][j], 0) + 1);
                }

            }

        }
        int arr[] = new int[map.size()];
        int i = arr.length - 1;
        int sum = 0;
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {

            if ((i + 1) < arr.length) {
                arr[i] = arr[i + 1] + x.getValue();
            } else {
                arr[i] = x.getValue();
            }
            i--;
        }

        for (int x : arr) sum += x;
        return sum;


    }

    public static void main(String[] args) {

        int a=6;
        int b=3;
        System.out.println(BigInteger.valueOf(a).isProbablePrime(1));
    }
}