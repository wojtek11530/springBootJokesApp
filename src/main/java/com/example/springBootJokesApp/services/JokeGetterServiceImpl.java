package com.example.springBootJokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import guru.springframework.norris.chuck.ChuckNorrisQuotes.*;
import org.springframework.stereotype.Service;

@Service
public class JokeGetterServiceImpl implements JokeGetterService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeGetterServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
