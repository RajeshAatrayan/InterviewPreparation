

import com.sun.deploy.util.ArrayUtil;
import netscape.security.UserTarget;
import org.omg.CORBA.INTERNAL;
import org.omg.CORBA.MARSHAL;


import javax.print.attribute.HashAttributeSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

import static BinarySearch.IsPerfectSquare.isPerfectSquare;

/**
 * Created by RajeshAatrayan|InterviewPreparation|PACKAGE_NAME|null.java| on Oct,2019
 * Happy Coding :)
 */
public class Test {
    static int count = 0;

    public int numSquarefulPerms(int[] arr) {
        count = 0;
        ArrayList<Integer> aux = new ArrayList<>();
        boolean visited[] = new boolean[arr.length];
        Arrays.sort(arr);
        backtrack(arr, visited, aux);
        return count;
    }

    private void backtrack(int[] arr, boolean[] visited, ArrayList<Integer> aux) {

        if (aux.size() == arr.length) {
            count++;
        }


        for (int i = 0; i < arr.length; i++) {
            if (visited[i] || i > 0 && arr[i] == arr[i - 1] && !visited[i - 1]) continue;
            if (aux.isEmpty()) {
                aux.add(arr[i]);
                visited[i] = true;
                backtrack(arr, visited, aux);
                visited[i] = false;
                aux.remove(aux.size() - 1);

            } else {
                if (IsPerfectSquare(aux.get(aux.size() - 1), arr[i])) {
                    aux.add(arr[i]);
                    visited[i] = true;
                    backtrack(arr, visited, aux);
                    visited[i] = false;
                    aux.remove(aux.size() - 1);
                }
            }

        }
    }

    private boolean IsPerfectSquare(int a, int b) {
        int num = a + b;
        double sqrt = Math.sqrt(num);
        return sqrt - Math.floor(sqrt) == 0;
    }


    public static void main(String[] args) {


    }
}