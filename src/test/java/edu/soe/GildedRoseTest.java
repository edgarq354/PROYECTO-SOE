package edu.soe;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void testDecrementQuality() {
    Item[] items = new Item[1];
    items[0] = new Item("+5 Dexterity Vest", 10, 20);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(19, items[0].quality);
  }

  @Test
  public void testDecrementX2Quality() {
    Item[] items = new Item[1];
    items[0] = new Item("+5 Dexterity Vest", 0, 20);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(18, items[0].quality);
  }

  @Test
  public void testDecrementNonNegativeQuality() {
    Item[] items = new Item[1];
    items[0] = new Item("+5 Dexterity Vest", 20, 0);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(0, items[0].quality);
  }

  @Test
  public void testIncrementQuality() {
    Item[] items = new Item[1];
    items[0] = new Item("Aged Brie", 2, 0);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(1, items[0].quality);
  }

  @Test
  public void testIncrementQualityNoMoreThan50() {
    Item[] items = new Item[1];
    items[0] = new Item("Aged Brie", 2, 50);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(50, items[0].quality);
  }

  //items[4] = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
  @Test
  public void testIncrementLegendary() {
    Item[] items = new Item[1];
    items[0] = new Item("Sulfuras, Hand of Ragnaros", 0, 80);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(80, items[0].quality);
  }

  @Test
  public void testIncrementBackstage() {
    Item[] items = new Item[1];
    items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(21, items[0].quality);
  }
  @Test
  public void testIncrementBackstage2() {
    Item[] items = new Item[1];
    items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(23, items[0].quality);
  }

  @Test
  public void testIncrementBackstage3() {
    Item[] items = new Item[1];
    items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(22, items[0].quality);
  }
  @Test
  public void testIncrementBackstage4() {
    Item[] items = new Item[1];
    items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 4, 20);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(23, items[0].quality);
  }

  @Test
  public void testIncrementBackstage5() {
    Item[] items = new Item[1];
    items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(0, items[0].quality);
  }

  @Test
  public void testDecrementConjured() {
    Item[] items = new Item[1];
    items[0] = new Item("Conjured Mana Cake", 3, 6);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(4, items[0].quality);
  }

  @Test
  public void testDecrementConjuredNonNegative() {
    Item[] items = new Item[1];
    items[0] = new Item("Conjured Mana Cake", 3, 0);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(0, items[0].quality);
  }

  @Test
  public void testDecrementX2Conjured() {
    Item[] items = new Item[1];
    items[0] = new Item("Conjured Mana Cake", 0, 8);

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();

    assertEquals(4, items[0].quality);
  }
}