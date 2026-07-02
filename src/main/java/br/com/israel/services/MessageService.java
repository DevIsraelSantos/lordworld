package br.com.israel.services;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class MessageService {

    public Component getPingMessage() {
        String message = "Pongado";
        return green(message);

    }

    private Component white(String message) {
        return Component.text(
                message,
                NamedTextColor.WHITE);
    }

    private Component green(String message) {
        return Component.text(
                message,
                NamedTextColor.GREEN);
    }

    private Component red(String message) {
        return Component.text(
                message,
                NamedTextColor.RED);
    }

}
