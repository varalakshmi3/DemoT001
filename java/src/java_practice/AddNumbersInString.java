package java_practice;

public class AddNumbersInString {
    public static int addNumbers(String input) {
        String[] elements = input.split("\\s+"); // Split string into elements using spaces as delimiter
        int total = 0;

        for (String element : elements) {
            if (element.matches("\\d+")) { // Check if the element is a number
                total += Integer.parseInt(element);
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String input = "abc 123 def 456 ghi";
        int result = addNumbers(input);
        System.out.println(result); // Output: 579
    }
}

