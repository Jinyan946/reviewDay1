import java.util.Scanner;

/**
 * A password generator based on given user information.
 *
 * <p>Purdue University -- CS18000 -- Fall 2021</p>
 *
 * @author Purdue CS
 * @version August 23, 2021
 */
public class AccountGenerator {
    static final String FIRST_NAME_QUESTION = "What's your first name?";
    static final String LAST_NAME_QUESTION = "What's your last name?";
    static final String AGE_QUESTION = "How old are you?";
    static final String BIRTHDAY_QUESTION = "What is your birthday? Enter the month, " +
            "the day and then the year (MM DD YYYY).";
    static final String FINAL_USERNAME_SENTENCE = "The generated username is: ";
    static final String FINAL_PASSWORD_SENTENCE = "The generated password is: ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(FIRST_NAME_QUESTION);
        String firstName = scanner.nextLine();

        System.out.println(LAST_NAME_QUESTION);
        String lastName = scanner.nextLine();

        System.out.println(AGE_QUESTION);
        double age = scanner.nextDouble();

        scanner.nextLine();

        System.out.println(BIRTHDAY_QUESTION);
        String birthday = scanner.nextLine();

        String firstLetter = firstName.substring(0,1);
        String birthYear = birthday.substring(6,10);
        System.out.println(FINAL_USERNAME_SENTENCE + firstLetter + lastName + birthYear);

        int lenFirst = firstName.length();
        String halfFirst = firstName.substring (0, lenFirst/2);

        int lenLast = lastName.length();
        int lengthLast= lenLast/2;
        String halfLast = lastName.substring(lengthLast,lenLast);

        int myAge = (int) age%26+65;
        char ch = (char) myAge;
        String birthMonth = birthday.substring(0,2);
        int bm = Integer.parseInt(birthMonth);
        String birthDate = birthday.substring(3,5);
        int bd = Integer.parseInt(birthDate);
        int by = Integer.parseInt(birthYear);
        int sum = (bm + bd +by)%12;


        System.out.println(FINAL_PASSWORD_SENTENCE + halfFirst + halfLast + ch + sum);
    }

}
