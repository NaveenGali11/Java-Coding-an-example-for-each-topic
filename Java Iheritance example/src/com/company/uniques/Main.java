package com.company.uniques;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Users user = new Users();
        user.createPosts();

        Moderators moderator = new Moderators();
        moderator.movePosts();
        moderator.createPosts();

        Administrator administrator = new Administrator();
        administrator.createCategories();
        administrator.createPosts();
    }
}

class Users{
    public void createPosts(){
        System.out.println("Can Create Posts");
    }
}

class Moderators extends Users{
    public void movePosts(){
        System.out.println("Can Move Posts");
    }
}

class Administrator extends Users{
    public void createCategories(){
        System.out.println("Can Create Categories");
    }
}