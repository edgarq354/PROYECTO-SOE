package edu.soe;

public class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item: items) {
      if (item.name.contains("Aged Brie"))
      { 
             this.incrementQuality(item);
            this.decrementSellInAll(item);
      }
      if(item.name.contains("Backstage passes"))
      {
         
          this.incrementQuality(item);
             this.decrementSellInAll(item);
      }
      
      if(item.name.contains("Sulfuras"))
      {
          this.decrementQuality(item);
              this.decrementSellInAll(item);
          
      }
      if(item.name.contains("Conjured"))
      {
          this.incrementConjured(item);
             this.decrementConjured(item);
         
             
      }
      
  
      
    }
  }

  public void incrementQuality(Item item) {
     if(item.quality>=50)
     {return;
     }else{
        if(item.sellIn<=0){
          return;
        }else if(item.sellIn<=5)
       {
           if(item.quality+3<=50)
           {
        item.quality = item.quality + 3;
           }
       }else if(item.sellIn<=10)
       {
            if(item.quality+2<=50)
            {
             item.quality = item.quality + 2;
            }
       }else
       {
            if(item.quality+1<=50){
         item.quality = item.quality + 1;
            }
       } 
  }
    
  }

  public void decrementQuality(Item item) {
    if (item.sellIn <= 0) {
      item.quality -= 2;
    }
  }
  
   public void incrementConjured(Item item) {
      item.quality-=2;
  }
 public void decrementSellInAll(Item item) {
     if(item.sellIn>0)
     {
         item.sellIn--;
     }else
         return;
      
  }
  public void decrementConjured(Item item) {
     
      item.sellIn--;
  }
}
