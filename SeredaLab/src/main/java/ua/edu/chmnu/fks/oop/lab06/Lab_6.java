package ua.edu.chmnu.fks.oop.lab_6;

public class Lab_6 {

    static public void main(String[] args) {
        Manual manual = new Manual(
                "Нормальная физиология",
                "Агаджанян Николай Александрович",
                2001,
                233,
                500
        );
        Textbook textbook = new Textbook(
                "Всеобщая история. История Нового времени.",
                "Бурин Сергей Николаевич , Ведюшкин Владимир Александрович",
                2013,
                165,
                350
        );
        Encyclopedia encyclopedia = new Encyclopedia(
                "Все о лечебных и магических минералах",
                "Стоун Джаспер",
                2005,
                321,
                645
        );
        System.out.printf(manual.toString());
        System.out.printf(textbook.toString());
        System.out.printf(encyclopedia.toString());
    }

    static abstract class Book{
        private String name;
        private String author;
        private int year;
        private int pageNumber;
        private int price;

        public Book(String name, String author, int year, int pageNumber, int price){
            this.name = name;
            this.author = author;
            this.year = year;
            this.pageNumber = pageNumber;
            this.price = price;
        }

        public abstract String getBookType();

        public String getName(){
            return name;
        }

        public String getAuthor(){
            return author;
        }

        public int getYear(){
            return year;
        }

        public int getPageNumber(){
            return pageNumber;
        }

        public int getPrice(){
            return  price;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAuthor(String author){
            this.author = author;
        }

        public void setYear(int year){
            this.year = year;
        }

        public void setPageNumber(int pageNumber){
            this.pageNumber = pageNumber;
        }

        public void setPrice(int price){
            this.price = price;
        }
    }

    static class Textbook extends Book{
        private String bookType = "Учебник";

        public Textbook(String name, String author, int year, int pageNumber, int price) {
            super(name, author, year, pageNumber, price);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "Тип книги: " + bookType + '\n' +
                    "Имя: " + getName() + '\n' +
                    "Автор: " + getAuthor() + '\n' +
                    "Год: " + getYear() + '\n' +
                    "Кол-во страниц: " + getPageNumber() + '\n' +
                    "Цена: " + getPrice() + '\n';
        }
    }

    static class Manual extends Book{
        private String bookType = "Пособие";

        public Manual(String name, String author, int year, int pageNumber, int price) {
            super(name, author, year, pageNumber, price);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "Тип книги: " + bookType + '\n' +
                    "Имя: " + getName() + '\n' +
                    "Автор: " + getAuthor() + '\n' +
                    "Год: " + getYear() + '\n' +
                    "Кол-во страниц: " + getPageNumber() + '\n' +
                    "Цена: " + getPrice() + '\n';
        }
    }

    static class Encyclopedia extends Book{
        private String bookType = "Энциклопедия";

        public Encyclopedia(String name, String author, int year, int pageNumber, int price) {
            super(name, author, year, pageNumber, price);
        }

        @Override
        public String getBookType() {
            return bookType;
        }

        @Override
        public String toString() {
            return '\n' + "Тип книги: " + bookType + '\n' +
                    "Имя: " + getName() + '\n' +
                    "Автор: " + getAuthor() + '\n' +
                    "Год: " + getYear() + '\n' +
                    "Кол-во страниц: " + getPageNumber() + '\n' +
                    "Цена: " + getPrice() + '\n';
        }
    }
}
