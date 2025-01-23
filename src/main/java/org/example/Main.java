package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws TelegramApiException {
        bot b = new bot();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(b);
        System.out.println("ishladi");
//        org.telegram.telegrambots.meta.TelegramBotsApi botsApi = new org.telegram.telegrambots.meta.TelegramBotsApi(DefaultBotSession.class);
//        try {
//            botsApi.registerBot(new java());
//            System.out.println("Bot muvaffaqiyatli ishga tushirildi!");
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
        }
    }
