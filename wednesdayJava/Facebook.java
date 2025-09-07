
/* Facebook – Friends & Posts
Instance variables: userId, name, friendsCount
Static variable: platformName = "Facebook"

Methods (all void):
addFriend(String friendName) -> increases friendsCount and prints message
createPost(String message) -> prints post details with user name
displayProfile() -> prints profile info

//Task: Create 3 users, add friends, create posts, and display profiles*/

package wednesdayJava;

import java.util.Scanner;

public class Facebook {
    int userId;
    String name;
    int friendsCount = 0;
    static String platformName = "Facebook";

    public void addFriend(String friendName) {
        friendsCount++;
        System.out.println(friendName + " Is the new Friend added");
        System.out.println(" Friends: " + friendsCount);

    }

    public void createPost(String message) {
        System.out.println(name + "Posted a picture" + message + "Please like the pictue");

    }

    public void displayProfile() {
        System.out.println("UserId: " + userId);
        System.out.println("User Name: " + name);
        System.out.println("Friends: " + friendsCount);
        System.out.println("Platform Name: " + platformName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Facebook user1 = new Facebook();
        System.out.println("Enter User ID:");
        user1.userId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Username:");
        user1.name = sc.nextLine();
        user1.friendsCount = 0;
        user1.displayProfile();

        System.out.println("Enter a friend to add:");
        String friendName = sc.nextLine();
        user1.addFriend(friendName);

        System.out.println("Enter a post message:");
        String postMessage = sc.nextLine();
        user1.createPost(postMessage);

        user1.displayProfile();
        sc.close();

    }
}
