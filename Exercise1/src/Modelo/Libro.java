package Modelo;

import java.util.Scanner;

public class Libro {
    private String title;
    private String author;
    private int pagesNumber;
    private int isbn;

    public Libro() {
    }

    public Libro(String title, String author, int pagesNumber, int isbn) {
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void loadBooks() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        this.title = input.next();
        System.out.println("Enter the author of the book: ");
        this.author = input.next();
        System.out.println("Enter the number of the pages: ");
        this.pagesNumber = input.nextInt();
        System.out.println("Enter the isbn code: ");
        this.isbn = input.nextInt();
    }

    public void showInformation(){
        System.out.printf("ISBN: %d, Title: %s, Author: %s, Number of pages: %d", this.getIsbn(), this.getTitle(), this.getAuthor(), this.getPagesNumber());
    }

}
