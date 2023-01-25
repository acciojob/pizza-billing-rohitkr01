package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg == true){
            price += 300;
        }
        else{
            price += 400;
        }
        bill = "Base Price of the Pizza: "+ price + "\n";
    }

    public int getPrice(){

        return this.price;
    }

    boolean isExtraCheese = false;
    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheese == false){
            this.price += 80;
            bill += "Extra Cheese Added: 80\n";
            isExtraCheese = true;
        }
    }

    boolean isExtraTopping = false;
    public void addExtraToppings(){
        // your code goes here
        if(isExtraTopping == false){
            if(isVeg == true){
                this.price += 70;
                bill += "Extra Toppings Added: "+120+"\n";
            }
            else{
                this.price +=120;
                bill +="Extra Topping Added: "+120+"\n";
            }
            isExtraTopping = true;
        }
    }

    boolean isTakeaway = false;
    public void addTakeaway(){
        // your code goes here
        if(isTakeaway == false){
            this.price += 20;
            bill += "Paperbag Added: "+20+"\n";
            isTakeaway = true;
        }

    }

    public String getBill(){
        // your code goes here

        this.bill = ("Base Price Of The Pizza: " + (isVeg ? 300 : 400)+
                (isExtraCheese ? ("\nExtra Cheese Added: 80"):" ")+
                (isExtraTopping ? ("\nExtra Toppings Added: " + (isVeg ? 70 : 120)): "") +
                (isTakeaway ? ("\nPaperbag Added: 20"):"")+
                "\nTotal Price: "+this.price +"\n"
                );
        return this.bill;
    }
}
