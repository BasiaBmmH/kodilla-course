package Modul0_6.New;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        System.out.println(getAge());
        Post nazwa = new Post("Tutorial");
        System.out.println(nazwa.createNewPost());
        Post post2 = new Post("Tresc", "B");
        System.out.println(post2.createNewPost());
        System.out.println(post2.getAuthor());



//        System.out.println(Post.staticCreateNewPost());
    }
    static int getAge() {
        return 23;
    }
}

class Post {

    public Post(String content) {
        this.content = content;
    }

    public Post(String content, String author){
        this.content=content;
        this.author=author;
    }

    public Post(String author, LocalDateTime createdAt){
        this.createdAt=createdAt;
        this.author=author;
    }

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String content;
    private String author;


    public String createNewPost() {
        return content;
    }

    public String getAuthor() {
        return author;
    }



    public static String staticCreateNewPost() {
        return "STATIC POST CONTENT";
    }
}
