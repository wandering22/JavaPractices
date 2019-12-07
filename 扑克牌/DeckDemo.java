package 扑克牌;

import java.util.*;

class Card{
    int rank;
    String color;

    public Card(int rank,String color) {
        this.rank = rank;
       this.color = color;
    }
        @Override
        public String toString(){

    String valueStr=null;
        if(rank==1){
        valueStr="A";
    }else if(rank>10){
        if(rank==11){
            valueStr="J";
        }else if(rank==12){
            valueStr="Q";
        }else{
            valueStr="K";
        }
    }else{
        valueStr=String.valueOf(rank);
    }
        return String.format("(%s,%s)",color,valueStr);
}
}
public class DeckDemo {

    public static final String[] Color={"♥","♦","♣","♠"};

    public static List<Card> Deck(){
        List<Card> deck=new ArrayList<>(52);
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String color = Color[i];
                int rank = j;
                Card card = new Card(rank,color);
                card.rank = rank;
                card.color = color;
                deck.add(card);

            }
        }
        return deck;
    }
    //public static String judge(List<Card> deck,int rank,String color){

    public static void shuffle(List<Card> deck){
        Random rand=new Random();
        for(int i=deck.size()-1;i>0;--i){
            int pos=rand.nextInt(i);
            swap(deck,i,pos);
        }
    }

    private static void swap(List<Card> deck, int i, int j) {
        Card tmp=deck.get(i);
        deck.set(i,deck.get(j));
        deck.set(j,tmp);
    }

    public static void send(List<Card> deck,List<List<Card>> persons,int numberCard,int numberPerson){

        List<List<Card>> person=new ArrayList<>();
        person.add(new ArrayList());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                person.get(j).add(deck.remove(0));
            }
        }

    }

    public static void main(String[] args) {
        List<Card> deck=Deck();
        System.out.println(deck);

        shuffle(deck);
        System.out.println(deck);

       // send(deck,)
        List<List<Card>> hands = new ArrayList<>();
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                hands.get(j).add(deck.remove(0));
            }
        }

        System.out.println("剩余的牌:");
        System.out.println(deck);
        System.out.println("A 手中的牌:");
        System.out.println(hands.get(0));
        System.out.println("B 手中的牌:");
        System.out.println(hands.get(1));
        System.out.println("C 手中的牌:");
        System.out.println(hands.get(2));

    }
}
