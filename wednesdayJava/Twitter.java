
package wednesdayJava;

import java.util.Scanner;

class Twitter {
    int userId;
    String username;
    int followersCount;
    static String platformName = "Twitter";

    void postTweet(String username) {
        System.out.println(username + " posted a tweet");

    }

    void followUser(String anotherUser) {
        followersCount++;
        System.out.println(username + " followed " + anotherUser);
        System.out.println("New followers count: " + followersCount);
        if (followersCount > 1000) {
            System.out.println(username + " is now a verified user!");

        }
    }

    void displayUserInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Username: " + username);
        System.out.println("Followers Count: " + followersCount);
        System.out.println("Platform Name: " + platformName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Twitter user1 = new Twitter();
        System.out.println("Enter User ID:");
        user1.userId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Username:");
        user1.username = sc.nextLine();
        user1.followersCount = 0;
        user1.displayUserInfo();
        System.out.println("Enter another user to follow:");
        String anotherUser = sc.nextLine();
        user1.followUser(anotherUser);
        user1.postTweet(user1.username);
        user1.displayUserInfo();
        sc.close();

    }

}