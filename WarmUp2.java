/**
 * @link https://codingbat.com/java/Warmup-2
 */
public class WarmUp2 {

    /**
     * Given a string and a non-negative int n, return a larger string that is n
     * copies of the original string.
     * 
     * @param str
     * @param n
     * @return
     */
    public String stringTimes(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }

        return result;
    }

    /**
     * Given a string and a non-negative int n, we'll say that the front of the
     * string is the first 3 chars, or whatever is there if the string is less than
     * length 3. Return n copies of the front;
     * 
     * @param str
     * @param n
     * @return
     */
    public String frontTimes(String str, int n) {
        String firstThree = (str.length() < 3) ? str : str.substring(0, 3);
        String result = "";

        for (int i = 0; i < n; i++) {
            result += firstThree;
        }

        return result;
    }

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is
     * allowed, so "xxx" contains 2 "xx".
     * 
     * @param str
     * @return
     */
    public int countXX(String str) {
        int countXX = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                countXX++;
            }
        }

        return countXX;
    }

    /**
     * Given a string, return true if the first instance of "x" in the string is
     * immediately followed by another "x".
     * 
     * 
     * @param str
     * @return
     */
    public boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }

        return false;
    }

    /**
     * Given a string, return a new string made of every other char starting with
     * the first, so "Hello" yields "Hlo".
     * 
     * 
     * @param str
     * @return
     */
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }

        return result;
    }

    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     * 
     * 
     * @param str
     * @return
     */
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 1; i <= str.length(); i++) {
            result += str.substring(0, i);
        }

        return result;
    }

    /**
     * Given a string, return the count of the number of times that a substring
     * length 2 appears in the string and also as the last 2 chars of the string, so
     * "hixxxhi" yields 1 (we won't count the end substring).
     * 
     * @param str
     * @return
     */
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        String lastTwo = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(lastTwo)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, return the number of 9's in the array.
     * 
     * 
     * @param nums
     * @return
     */
    public int arrayCount9(int[] nums) {
        int countNine = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                countNine++;
            }
        }

        return countNine;
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the
     * array is a 9. The array length may be less than 4.
     * 
     * 
     * @param nums
     * @return
     */
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }

    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3
     * appears in the array somewhere.
     * 
     * @param nums
     * @return
     */
    public boolean array123(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }

        return false;
    }

    public int stringMatch(String a, String b) {
        int n = a.length() < b.length() ? a.length() : b.length();
        int count = 0;

        for (int i = 0; i <= n - 2; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }

        return count;
    }

    /**
     * Given a string, return a version where all the "x" have been removed. Except
     * an "x" at the very start or end should not be removed.
     * 
     * @param str
     * @return
     */
    public String stringX(String str) {
        if (str.length() < 2) {
            return str;
        }

        String result = str.substring(0, 1);
        for (int i = 1; i < str.length() - 1; i++) {
            result += (str.charAt(i) == 'x') ? "" : str.charAt(i);
        }

        return result + str.charAt(str.length() - 1);
    }

    /**
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
     * ... so "kittens" yields "kien".
     * 
     * 
     * @param str
     * @return
     */
    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            result += str.substring(i, i + 1);

            if (str.length() >= (i + 2)) {
                result += str.substring(i + 1, i + 2);
            }
        }

        return result;
    }

    /**
     * Suppose the string "yak" is unlucky. Given a string, return a version where
     * all the "yak" are removed, but the "a" can be any char. The "yak" strings
     * will not overlap.
     * 
     * 
     * @param str
     * @return
     */
    public String stringYak(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != 'y') {
                result += str.charAt(i);
                i++;
                continue;
            }

            if ((i + 2) < str.length() && str.charAt(i + 2) == 'k') {
                i += 3;
                continue;
            } else {
                result += str.charAt(i);
            }

            i++;
        }

        return result;
    }

    /**
     * Given an array of ints, return the number of times that two 6's are next to
     * each other in the array. Also count instances where the second "6" is
     * actually a 7.
     * 
     * 
     * @param nums
     * @return
     */
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Given an array of ints, we'll say that a triple is a value appearing 3 times
     * in a row in the array. Return true if the array does not contain any triples.
     * 
     * 
     * @param nums
     * @return
     */
    public boolean noTriples(int[] nums) {
        if (nums.length >= 3) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a
     * value, followed by the value plus 5, followed by the value minus 1.
     * Additionally the 271 counts even if the "1" differs by 2 or less from the
     * correct value.
     * 
     * 
     * @param nums
     * @return
     */
    public boolean has271(int[] nums) {
        if (nums.length > 3) {
            for (int i = 0; i <= nums.length - 2; i++) {
                if (nums[i] + 5 == nums[i + 1] && Math.abs(nums[i] - 1 - nums[i + 2]) <= 2) {
                    return true;
                }
            }
        }

        return false;
    }

}