// https://www.hackerrank.com/challenges/30-abstract-classes
//Write MyBook Class
class MyBook extends Book{
    int price =0;
    MyBook(String title, String author, int num){
    super(title, author);
    this.price = num;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}

