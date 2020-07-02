package com.company;

public class Phrase {
    public static void main(String[] args) {
        String[] wordListOne = {"USA", "Brazil", "India", "Russia", "China", "Canada", "england", "Peru", "Mexico"};
        String[] wordListTwo = {"Capitalist", "Soccer", "Population", "Communism", "Money", "Peace", "History", "Cute", "Beer"};
        String[] wordListThree = {"Invention", "Hard-working", "Engineer", "Politics", "Product", "Policy", "Tradition", "Travel", "Enjoy"};

        // FIND OUT HOW MANY WORDS ARE IN THE LIST
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // GENERATE THREE RANDOM NUMBERS

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * oneLength);
        int rand3 = (int) (Math.random() * oneLength);

        // NOW BUILD A PHRASE
        String Phrase1 = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(" What we need is a " + Phrase1);
        System.out.println(" What we need is a " + Phrase1);
        System.out.println(" What we need is a " + Phrase1);
        System.out.println(" What we need is a " + Phrase1);
        System.out.println(" What we need is a " + Phrase1);



    }
}



