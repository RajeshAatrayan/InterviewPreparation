

import com.sun.deploy.util.ArrayUtil;
import netscape.security.UserTarget;
import org.omg.CORBA.INTERNAL;
import org.omg.CORBA.MARSHAL;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by RajeshAatrayan|InterviewPreparation|PACKAGE_NAME|null.java| on Oct,2019
 * Happy Coding :)
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Test {
    static String obt = "";
    static boolean res = false;

    public boolean isValidSequence(TreeNode root, int[] arr) {
        String given = "";
        obt = "";
        res = false;
        for (int x : arr) given += x;
        preorder(root, given);
        return res;

    }

    private void preorder(TreeNode root, String given) {
        if (root != null) {
            obt += root.val;
            preorder(root.left, given);
            preorder(root.right, given);
            if (root.left == null && root.right == null) {
                if (obt.equals(given)) {
                    res = true;
                }
            }
            if (obt.length() != 0) ;
            obt = obt.substring(0, obt.length() - 1);


        }


    }

    public static void main(String[] args) {


    }
}