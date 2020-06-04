


import com.sun.deploy.util.ArrayUtil;
import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import netscape.security.UserTarget;
import org.omg.CORBA.INTERNAL;
import org.omg.CORBA.MARSHAL;
import sun.rmi.runtime.Log;


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
    static class node {
        int x;
        int y;
        int z;

        public node(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public int twoCitySchedCost(int[][] costs) {
        ArrayList<node> list = new ArrayList<>();

        for (int i = 0; i < costs.length; i++) {
            list.add(new node(costs[i][0], costs[i][1], costs[i][1] - costs[i][0]));
        }
        list.sort(new Comparator<node>() {
            @Override
            public int compare(node o1, node o2) {
                return -(o1.z - o2.z);
            }
        });
        int n = costs.length;
        int ans = 0;
        for (int i = 0; i < n / 2; i++) {
            ans += list.get(i).x;
        }
        for (int i = n / 2; i < n; i++) {
            ans += list.get(i).y;
        }
        return ans;
    }

    public static void main(String[] args) {
        Collections.max(new ArrayList<Integer>());
    }
}