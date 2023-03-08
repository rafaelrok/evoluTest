import java.util.Scanner;

/**
 * @author rafae
 */

public class Palindromo {

    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String name = sc.nextLine();
        boolean isPalindrome = palindromo.isPalindrome(name);
        System.out.println(isPalindrome);
        sc.close();
    }

    public boolean isPalindrome(String name) {

        String processedName = name.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = processedName.length() - 1;
        while (left < right) {
            if (processedName.charAt(left) != processedName.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
