package BinarySearch;

/**
 * Created by RajeshAatrayan|InterviewPreparation|BinarySearch|FirstBadVersion| on May,2020
 *  
 * Happy Coding :)
 * <p>
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * <p>
 * Example:
 * <p>
 * Given n = 5, and version = 4 is the first bad version.
 * <p>
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * <p>
 * Then 4 is the first bad version.
 **/
public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int beg = 1;
        int end = n;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            boolean cur = isBadVersion(mid);
            if (cur && !isBadVersion(mid - 1)) return mid;
            if (!cur) beg = mid + 1;
            else end = mid - 1;
        }
        return -1;

    }

    /**
     * isBadVersion is from the driver code so dont implement it
     */
    private boolean isBadVersion(int mid) {
        return true;
    }
}
