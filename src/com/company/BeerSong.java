package com.company;

public class BeerSong {

    public static void main(String[] args) {
	// write your code here
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            word = "bottle";   // singular, as in one bottle
        }
        System.out.println( beerNum + " " + word + "beer on the wall");
        System.out.println(beerNum + " " + word + "of beer");
        System.out.println("Take one down please");
        System.out.println("Pass me one please");

        beerNum = beerNum - 1;

        if (beerNum > 0) {
            System.out.println(beerNum + " " + word + "beer on the wall");
        } else {
                System.out.println("no more beer left");
        }

    }


}

