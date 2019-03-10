package edu.dmacc.codedsm.homework10;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeckOfCards {
    private static ArrayList<Card> newArrayList;

    public static <suits> void main(String[] args) {
        int[] deck = new int[52];

        HashMap<String, List> suits = new HashMap<>();

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(13);

        suits.put("Hearts", values);
        suits.put("Diamonds", values);
        suits.put("Spades", values);
        suits.put("Clubs", values);

        for( Map.Entry<String, List> entry : suits.entrySet()){

        for ( int i = 1; i < 14; i++ ) {

            System.out.println(entry.getKey() + " - " + i);
            }

           //   System.out.println(suits + " - " + values);

          //  suits.forEach((Key, value) -> System.out.println(Key + " - " + value));



        }
    }
}









