package com.example.mockservice.learning;

import org.hibernate.annotations.Comments;

import java.util.ArrayList;

public class JsonToJava {

}

class Book{
    String title;
    String content;
    Author author;
    ArrayList<String> tags;
    ArrayList<Comment> comments;

}

class Author{
    String name;
    String email;

}

class Comment {
    String user;
    String text;
}

