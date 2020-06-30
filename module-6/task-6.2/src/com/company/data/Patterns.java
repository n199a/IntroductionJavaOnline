package com.company.data;

public interface Patterns {
    /**
     * Правило №1:
     * ^ - начало строки;
     * \\S - не может содержать Пробельные символы: включает в себя символ пробела, табуляции \t,
     * перевода строки \n и некоторые другие редкие пробельные символы, обозначаемые как \v, \f и \r;
     * \\s - пробельные символы (см. выше);
     * \\w - символ «слова», а точнее – буква латинского алфавита или цифра или подчёркивание _ (без русских символов);
     * \\W - любой символ, кроме буквенного, цифрового или знака подчёркивания (с русскими символами);
     * \\D - нецифровой символ;
     * [] - любой из перечисленных символов, которых находятся внутри скобок;
     * * - ноль или более раз.
     * + - один или более раз
     * ([.]*) - любой символ ноль или более раз
     */
    String CORRECT_PATTERN_DATE = "^(\\d{1,2})(\\.)(\\d{1,2})(\\.)(\\d{4})";
    String CORRECT_PATTERN_THEME = "(^\\S)([^\\W])+([\\w\\s]*)";
    String CORRECT_PATTERN_MAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    String PATTERN_NOTE = "\\[The Note\\]";
    String PATTERN_DATE = "^(DATE:)";
    String PATTERN_THEME = "^(THEME:)";
    String PATTERN_MAIL = "^(MAIL:)";
    String PATTERN_MESSAGE = "^(MESSAGE:)";

    String SEARCH_ANY_CHARACTERS = "(.*?)";                     // любой набор символов
    String SEARCH_BEFORE_COLON = "(.*?:)";                      // любой набор символов ДО ДВОЕТОЧИЯ
}
