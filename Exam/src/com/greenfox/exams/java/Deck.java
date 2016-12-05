package com.greenfox.exams.java;

import java.util.ArrayList;

public class Deck extends ArrayList<Cards>{

    public Deck(int nrOfCards) {
        for (int i= 0; i<nrOfCards;i++){
            Cards myCard = new Cards(i);
        }
    }

}
