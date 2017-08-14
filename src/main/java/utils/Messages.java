package utils;

import java.util.Locale;
import java.util.ResourceBundle;

import static utils.TimeOfDay.getTimeOfDay;

public class Messages {

    public static ResourceBundle getMessagesForLocale(Locale locale) {
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        return messages;
    }

    public static String showMessage(ResourceBundle messages, int hour) {
        String message = messages.getString(getTimeOfDay(hour));
        System.out.println(message);
        return message;
    }
}
