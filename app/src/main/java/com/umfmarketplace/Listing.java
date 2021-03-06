package com.umfmarketplace;

public class Listing {
    private String TheAuthor;
    private String TheBook;
    private String ClassUsed;
    private String Condition;
    private String ISBNasString;
    private String PriceasString;
    private String SellerEmail;

    public Listing(){}

    public Listing(String theAuthor, String theBook, String classUsed, String condition, String ISBNasString, String priceasString, String sellerEmail) {
        TheAuthor = theAuthor;
        TheBook = theBook;
        ClassUsed = classUsed;
        Condition = condition;
        this.ISBNasString = ISBNasString;
        PriceasString = priceasString;
        SellerEmail = sellerEmail;
    }

    public String getClassUsed() {
        return ClassUsed;
    }

    public void setClassUsed(String classUsed) {
        this.ClassUsed = classUsed;
    }

    public String getSellerEmail() {
        return SellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.SellerEmail = sellerEmail;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        this.Condition = condition;
    }

    public String getISBNasString() {
        return ISBNasString;
    }

    public void setISBNasString(String ISBNasString) {
        this.ISBNasString = ISBNasString;
    }

    public String getPriceasString() {
        return PriceasString;
    }

    public void setPriceasString(String priceasString) {
        this.PriceasString = priceasString;
    }

    public String getTheAuthor() {
        return TheAuthor;
    }

    public void setTheAuthor(String theAuthor) {
        this.TheAuthor = theAuthor;
    }

    public String getTheBook() {
        return TheBook;
    }

    public void setTheBook(String theBook) {
        this.TheBook = theBook;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "Author='" + TheAuthor + '\'' +
                ", Book Title='" + TheBook + '\'' +
                ", ISBN='" + ISBNasString + '\'' +
                ", Condition='" + Condition + '\'' +
                ", Price='" + PriceasString + '\'' +
                ", Class Used='" + ClassUsed + '\'' +
                ", Class Used='" + SellerEmail + '\'' +
                '}';
    }
}
