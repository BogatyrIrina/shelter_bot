package com.example.shelter_bot.configuration;

import com.pengrad.telegrambot.TelegramBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ShelterBotConfiguration {
    @Bean
    public TelegramBot telegramBot(@Value("${telegram.bot.token}")String token){

        return new TelegramBot(token);

    }
}
