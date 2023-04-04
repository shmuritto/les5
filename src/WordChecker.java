import java.util.Arrays;
/**
 * Описание задания находиться в методе checkThatWorkHasSameLetters.
 */
public abstract class WordChecker {


    public static void main(String[] args) {
        taskChecker("som", "mos", true);
        taskChecker("Макс", "Сом", false);
        taskChecker("Макс", "Маакс", false);
        taskChecker("пустая", "сом", false);
        taskChecker("Макс", "макс", true);
        taskChecker("ром", "ром", true);
        taskChecker("", "ром", false);
        taskChecker(null, "ром", false);
        taskChecker(null, null, true);
        taskChecker("", null, false);
        taskChecker("", "", true);
    }

    private static boolean checkThatWorkHasSameLetters(String left, String right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            char[] leftWord = (left.toLowerCase()).toCharArray();
            char[] rightWord = (right.toLowerCase()).toCharArray();
            Arrays.sort(leftWord);
            Arrays.sort(rightWord);
            return Arrays.equals(leftWord, rightWord);
        }
    }

    private static void taskChecker(String left, String rigth, boolean expected) {
        if (checkThatWorkHasSameLetters(left, rigth) == expected) {
            final String checkResult = expected ? "состоят" : "не состоят";
            System.out.printf("Проверка успешна. %s и %s %s из одних букв\n", left, rigth, checkResult);
        } else {
            final String checkResult = expected ? "состоять" : "не состоять";
            System.out.printf("Проверка не прошла! %s и %s должны %s из одних букв\n", left, rigth, checkResult);
        }
    }
}