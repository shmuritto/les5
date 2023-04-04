import java.util.Arrays;
public class ArrayPrettyPrinter {

    public static void main(String[] args) {
        System.out.println(formatArray(new String[]{"", ""}));
    }

    /**
     * <pre>
     * Превратить массив символов в строку со следущеми требованиями:
     * 1. Первая буква в строке всегда заглавная
     * 2. Элементы массива должны быть разделены проблами
     * 3. Все остальные символы за первым, должны быть строчными
     * 4. В конце должен быть восклицательный знак
     * 5. Если массив пустой или null, то должна быть возвращена пустая строка.
     * 6. Если один из элементов массив null, то его нужно вывести как null, правило 1. должно действовать
     * 7. Если один из элементов массива пустой, то его выводим как empty, правило 1. должно действовать
     *
     * Примеры:
     * ["hellow", "my friend] = "Hellow my friend!"
     * ["hellow] = "Hellow!"
     * ["Hi", "Mari"] = "Hi mari!"
     * [null", "Mari"] = "Null mari!"
     * [null", "null"] = "Null null!"
     * ["", "Mari"] = "Empty mari!"
     * ["", ""] = "Empty empty!"
     * null --> ""
     * [] ---> ""
     * </pre>
     *
     * @param strArray массив для форматирования
     * @return результат форматирования
     */
    private static String formatArray(String[] strArray) {
        StringBuilder string = new StringBuilder();
        if (strArray.length == 0 || Arrays.toString(strArray).equals("")) {
            return string.toString();
        } else {
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i] == null) {
                    strArray[i] = "null";
                }
                if (strArray[i].equals("")) {
                    strArray[i] = "empty";
                }
                if (i != 0) {
                    string.append(" ").append(strArray[i]);
                } else {
                    string.append(strArray[i]);
                }
                if (i == strArray.length - 1) {
                    string.append("!");
                }
            }

            string = new StringBuilder(string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase());

        }
        return string.toString();
    }
}