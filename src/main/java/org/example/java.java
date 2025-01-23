package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class java extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message message = update.getMessage();
            String userMessage = message.getText();
            String chatId = message.getChatId().toString();

            // Javob berish
            String reply;
            if (userMessage.equalsIgnoreCase("/start")) {
                reply = "Salom! Chopar Pizza botiga xush kelibsiz. Buyurtma berishni boshlash uchun 'Menu'ni tanlang.";
            } else if (userMessage.equalsIgnoreCase("Menu")) {
                reply = "1. Margarita - 50,000 so'm\n" +
                        "2. Pepperoni - 60,000 so'm\n" +
                        "3. Mix Pizza - 70,000 so'm\n" +
                        "Buyurtma berish uchun raqamni kiriting.";
            } else if (userMessage.equals("1")) {
                reply = "Margarita tanlandi. Buyurtmangiz tayyorlanmoqda.";
            } else if (userMessage.equals("2")) {
                reply = "Pepperoni tanlandi. Buyurtmangiz tayyorlanmoqda.";
            } else if (userMessage.equals("3")) {
                reply = "Mix Pizza tanlandi. Buyurtmangiz tayyorlanmoqda.";
            } else {
                reply = "Kechirasiz, sizni tushunmadim. 'Menu'ni tanlang yoki /start bosing.";
            }

            // Foydalanuvchiga javob yuborish
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText(reply);

            try {
                execute(sendMessage); // Javobni jo'natish
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public void main(String[] args) throws TelegramApiException {
        // Botni ishga tushirish uchun TelegramBotsApi dan foydalanamiz
        org.telegram.telegrambots.meta.TelegramBotsApi botsApi = new org.telegram.telegrambots.meta.TelegramBotsApi(DefaultBotSession.class);
        try {
            botsApi.registerBot(new java());
            System.out.println("Bot muvaffaqiyatli ishga tushirildi!");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String getBotUsername() {
        return "@shavqiddin123bot";
    }
    @Override
    public String getBotToken(){
        return "7860932749:AAFo5A3x30VwD-J4uk5sL4N1cAL87leGgvA";
    }
}
