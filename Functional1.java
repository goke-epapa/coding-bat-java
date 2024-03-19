import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {

    /**
     * Given a list of integers, return a list where each integer is multiplied by
     * 2.
     * Solved with basic functional API
     * 
     * @param nums
     * @return
     */
    public List<Integer> doublingWithFunctions(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);

        return nums;
    }

    /**
     * Given a list of integers, return a list where each integer is multiplied by
     * 2.
     * Solved with Java Streams API
     * 
     * @param nums
     * @return
     */
    public List<Integer> doublingWithStreams(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    /**
     * Given a list of integers, return a list where each integer is multiplied with
     * itself.
     * Solved with basic functional API
     * 
     * @param nums
     * @return
     */
    public List<Integer> squareWithFunctions(List<Integer> nums) {
        nums.replaceAll(n -> n * n);

        return nums;
    }

    /**
     * Given a list of integers, return a list where each integer is multiplied with
     * itself.
     * Solved with basic Java Streams API
     * 
     * @param nums
     * @return
     */
    public List<Integer> squareWithStreams(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    /**
     * Given a list of strings, return a list where each string has "*" added at its
     * end.
     * Solved with basic functional API
     * 
     * @param strings
     * @return
     */
    public List<String> addStarWithFunctions(List<String> strings) {
        strings.replaceAll(string -> string + "*");

        return strings;
    }

    /**
     * Given a list of strings, return a list where each string has "*" added at its
     * end.
     * Solved with Java Streams API
     * 
     * @param strings
     * @return
     */
    public List<String> addStarWithStreams(List<String> strings) {
        return strings.stream()
                .map(string -> string + "*")
                .collect(Collectors.toList());
    }

    /**
     * Given a list of strings, return a list where each string is replaced by 3
     * copies of the string concatenated together.
     * Solved with basic functional API
     * 
     * @param strings
     * @return
     */
    public List<String> copies3WithFunctions(List<String> strings) {
        strings.replaceAll(string -> string + string + string);

        return strings;
    }

    /**
     * Given a list of strings, return a list where each string is replaced by 3
     * copies of the string concatenated together.
     * Solved with Java Streams API
     * 
     * @param strings
     * @return
     */
    public List<String> copies3WithStreams(List<String> strings) {
        return strings.stream()
                .map(string -> string + string + string)
                .collect(Collectors.toList());
    }

    /**
     * Given a list of strings, return a list where each string has "y" added at its
     * start and end.
     * 
     * Solved with basic functional API
     * 
     * @param strings
     * @return
     */
    public List<String> moreYWithFunctions(List<String> strings) {
        strings.replaceAll(string -> "y" + string + "y");

        return strings;
    }

    /**
     * Given a list of strings, return a list where each string has "y" added at its
     * start and end.
     * 
     * Solved with Java Streams API
     * 
     * @param strings
     * @return
     */
    public List<String> moreYWithStreams(List<String> strings) {
        return strings.stream()
                .map(string -> "y" + string + "y")
                .collect(Collectors.toList());
    }

    /**
     * Given a list of integers, return a list where each integer is added to 1 and
     * the result is multiplied by 10.
     * Solved with basic functional API
     * 
     * @param nums
     * @return
     */
    public List<Integer> math1WithFunctions(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);

        return nums;
    }

    /**
     * Given a list of integers, return a list where each integer is added to 1 and
     * the result is multiplied by 10.
     * Solved with Java Streams API
     * 
     * @param nums
     * @return
     */
    public List<Integer> math1WithStreams(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n + 1) * 10)
                .collect(Collectors.toList());
    }

    /**
     * Given a list of non-negative integers, return an integer list of the
     * rightmost digits. (Note: use %)
     * 
     * Solved with basic functional API
     * 
     * @param nums
     * @return
     */
    public List<Integer> rightDigitWithFunctions(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);

        return nums;
    }

    /**
     * Given a list of non-negative integers, return an integer list of the
     * rightmost digits. (Note: use %)
     * 
     * Solved with Java Streams API
     * 
     * @param nums
     * @return
     */
    public List<Integer> rightDigitWithStreams(List<Integer> nums) {
        return nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
    }

    /**
     * Given a list of strings, return a list where each string is converted to
     * lower case (Note: String toLowerCase() method).
     * 
     * Solved with basic functional API
     * 
     * @param strings
     * @return
     */
    public List<String> lowerWithFunctions(List<String> strings) {
        strings.replaceAll(string -> string.toLowerCase());

        return strings;
    }

    /**
     * Given a list of strings, return a list where each string is converted to
     * lower case (Note: String toLowerCase() method).
     * 
     * Solved with Java Streams API
     * 
     * @param strings
     * @return
     */
    public List<String> lowerWithStreams(List<String> strings) {
        return strings.stream()
                .map(string -> string.toLowerCase())
                .collect(Collectors.toList());
    }

    /**
     * Given a list of strings, return a list where each string has all its "x"
     * removed.
     * Solved with basic functional API
     * 
     * @param strings
     * @return
     */
    public List<String> noXWithFunctions(List<String> strings) {
        strings.replaceAll(string -> string.replaceAll("x", ""));

        return strings;
    }

    /**
     * Given a list of strings, return a list where each string has all its "x"
     * removed.
     * Solved with Java Streams API
     * 
     * @param strings
     * @return
     */
    public List<String> noXWithStreams(List<String> strings) {
        return strings.stream()
                .map(string -> string.replaceAll("x", ""))
                .collect(Collectors.toList());
    }

}
