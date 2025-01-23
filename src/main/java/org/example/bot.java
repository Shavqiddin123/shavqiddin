package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        String text = message.getText();
        Long chatId = message.getChatId();
        System.out.println(message.getPhoto());
        switch (text) {
            case "/start" ->
                    sendIshorinlari(chatId, "Assalomu alaykum! Chopar Pizza yetkazib berish xizmatiga xush kelibsiz.");
            case "Toshkent" -> sendIshlarga(chatId, "");
            case "Andijon" -> sendIshlarga(chatId, text);
            case "Nukus" -> sendIshlarga(chatId, "");
            case "Qo'qon" -> sendIshlarga(chatId, "");
            case "Farg'ona" -> sendIshlarga(chatId, "");
            case "Marg'ulon" -> sendIshlarga(chatId, "");
            case "Chirchiq" -> sendIshlarga(chatId, "");
            case "Xorazim" -> sendIshlarga(chatId, "");
            case "\uD83C\uDF55 Buyurtma berish" -> sendOnix(chatId, "");
            case "\"☎\\uFE0F Chopar bilan aloqa" -> sendOnix(chatId, "");


        }
    }

    private void sendIshorinlari(long chatId, String text) {
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Toshkent");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Andijon");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Nukus");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Qo'qon");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Farg'ona");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Marg'ulon");
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Chirchiq");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Xorazim");


        KeyboardRow keyboard1 = new KeyboardRow();
        keyboard1.add(button1);
        keyboard1.add(button2);
        KeyboardRow keyboard2 = new KeyboardRow();
        keyboard2.add(button3);
        keyboard2.add(button4);
        KeyboardRow keyboard3 = new KeyboardRow();
        keyboard3.add(button5);
        keyboard3.add(button6);
        KeyboardRow keyboard4 = new KeyboardRow();
        keyboard4.add(button7);
        keyboard4.add(button8);


        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(keyboard1);
        qatorlar.add(keyboard2);
        qatorlar.add(keyboard3);
        qatorlar.add(keyboard4);


        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(qatorlar);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(true);
        markup.setSelective(false);
        markup.setIsPersistent(false);


        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Botga hush kelibsiz");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendIshlarga(long chatId, String text) {
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("\uD83C\uDF55 Buyurtma berish");
        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCD6 Buyurtmalar tarixi");
        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("☎\uFE0F Chopar bilan aloqa");
        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("⚙\uFE0FSozlash ℹ\uFE0F Ma'lumotlar");
        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("\uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0F Jamoamizga qo'shiling");
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        KeyboardRow keyboardRow1 = new KeyboardRow();
        keyboardRow1.add(keyboardButton1);
        keyboardRow1.add(keyboardButton2);
        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton3);
        keyboardRow2.add(keyboardButton4);
        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(keyboardRow);
        qatorlar.add(keyboardRow1);
        qatorlar.add(keyboardRow2);
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(qatorlar);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.getOneTimeKeyboard();
        replyKeyboardMarkup.setSelective(false);
        replyKeyboardMarkup.setIsPersistent(false);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("rahmat");
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendBuyurtma(long chatId, String text) {
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDFC3 Olib ketish");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDE99 Yetkazib berish");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅\uFE0F Ortga");
        KeyboardRow keyboard1 = new KeyboardRow();
        keyboard1.add(button1);
        keyboard1.add(button2);
        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(button3);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        ArrayList<KeyboardRow> qatorlar1 = new ArrayList<>();
        qatorlar1.add(keyboard1);
        qatorlar1.add(keyboardRow2);
        markup.setResizeKeyboard(true);
        markup.setSelective(false);
        markup.setIsPersistent(false);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("nma kerak");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);

        }
    }

    private void sendOnix(long chatId, String text) {
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDFC3 Olib ketish");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDE99 Yetkazib berish");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅\uFE0F Ortga");
        KeyboardRow keyboard1 = new KeyboardRow();
        keyboard1.add(button1);
        keyboard1.add(button2);
        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(button3);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        ArrayList<KeyboardRow> qatorlar1 = new ArrayList<>();
        qatorlar1.add(keyboard1);
        qatorlar1.add(keyboardRow2);
        markup.setResizeKeyboard(true);
        markup.setSelective(false);
        markup.setIsPersistent(false);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("nma kerak");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);

        }
    }

    private void sendMalibu(long chatId, String text) {
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Malibo turbo");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Malibo xl");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Malibo 2");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Malibu");
        KeyboardRow keyboard1 = new KeyboardRow();
        keyboard1.add(button1);
        keyboard1.add(button2);
        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(button3);
        keyboardRow2.add(button4);
        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(keyboard1);
        qatorlar.add(keyboardRow2);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(qatorlar);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(true);
        markup.setSelective(false);
        markup.setIsPersistent(false);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("qaysi markasi!");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    private void sendCoblt(long chatId, String text) {
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Cobalt 2023 ");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Cabalt 2024 ");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Cobalt 2025");

        KeyboardRow keyboard1 = new KeyboardRow();
        keyboard1.add(button1);
        keyboard1.add(button2);
        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(button3);

        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(keyboard1);
        qatorlar.add(keyboardRow2);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(qatorlar);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(true);
        markup.setSelective(false);
        markup.setIsPersistent(false);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("qaysi markasi!");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


    }

    private void senMalibuxl(long chatId, String text) {
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        try {
            execute(photo);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendMalibuInleni(long chatId, String text) {
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("Malibi tg kanali");
        btn1.setUrl("t.me/moshina_bozorim");
        ArrayList<InlineKeyboardButton> row = new ArrayList<>();
        row.add(btn1);
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        rows.add(row);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(rows);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Siz ucun telegram bot");
        sendMessage.setChatId(chatId);
        sendMessage.setReplyMarkup(markup);
    }

    private  void sendXonzo(long chatId, String text){
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("");
        KeyboardRow keyboard1 = new KeyboardRow();
        keyboard1.add(button1);
        keyboard1.add(button2);
        KeyboardRow keyboardRow2= new KeyboardRow();
        keyboardRow2.add(button3);
        ArrayList<KeyboardRow> qatorlar = new ArrayList<>();
        qatorlar.add(keyboard1);
        qatorlar.add(keyboardRow2);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(qatorlar);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(true);
        markup.setSelective(false);
        markup.setIsPersistent(false);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("qaysi markasi!");
        sendMessage.setReplyMarkup(markup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public String getBotUsername() {
        return "@shavqiddin123bot";
    }
    @Override
    public  String getBotToken(){
        return "7860932749:AAFo5A3x30VwD-J4uk5sL4N1cAL87leGgvA";
    }
}
