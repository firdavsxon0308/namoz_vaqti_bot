package uz.pdp;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
            api.registerBot(new MyBot("7567427978:AAFCIEMYGk9To_VhmN156MRkdO6OF6n-JV0"));
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
