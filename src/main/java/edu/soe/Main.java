package edu.soe;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    Item[] items = new Item[4];

    items[0] = new Item("Aged Brie", 4,49 );
    items[1] = new Item("Backstage passes", 5, 7);
    items[2] = new Item("Sulfuras", 12, 80);
    items[3] = new Item("Conjured", 5, 6);
    printItems(items);

    GildedRose gildedRose = new GildedRose(items);

    for (int i = 1; i<=10; i++ ) {
      gildedRose.updateQuality();
      
      printItems(items);
    }
  }

  public static void printItems(Item[] items) {
    System.out.println("#################");
    for (Item item : items) {
      System.out.println(item);
    }
  }
}
