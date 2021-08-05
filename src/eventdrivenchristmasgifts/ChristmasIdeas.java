/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventdrivenchristmasgifts;

/**
 * ChristmasIdeas.java
 * john
 * 28th/11/2020
 */
public class ChristmasIdeas 
{
    //Private Variables//
    private String name;
    private String gift;
    private String url;
    
    //DEFAULT CONSTRUCTOR//
    public ChristmasIdeas()
    {
        name = "";
        gift = "";
        url = "";
    }
    
    //OVERLOADED CONSTRUCTOR//
    public ChristmasIdeas(String nameSetter, String giftSetter, String urlSetter)
    {
        this.name = nameSetter;
        this.gift = giftSetter;
        this.url = urlSetter;
    }
    
    //SETTERS//
    //Name Setter//
    public void nameSetter(String setName)
    {
        this.name = setName;
    }
    //Gift Setter//
    public void giftSetter(String setGift)
    {
        this.gift = setGift;
    }
    //URL Setter//
    public void urlSetter(String setUrl)
    {
        this.url = setUrl;
    } 
    //GETTERS//
    //Get Name//
    public String getName()
    {
        return name;
    }
    //Get Gift//
    public String getGift()
    {
        return gift;
    }
    //Get URL//
    public String getUrl()
    {
        return url;
    }
    //Get Full Data//
    @Override
    public String toString()
    {
        return "\n"
                + "Recipient Name: " + name + 
                "\n" +
                "Gift: " + gift +
                "\n" +
                "URL: " + url
                + "\n\n";
    }
}
