package com.company;

public class BlogPost {
    /*Create a BlogPost class that has
            an authorName
            a title
            a text
            a publicationDate
    Create a few blog post objects:
    "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
    Lorem ipsum dolor sit amet.
    "Wait but why" titled by Tim Urban posted at "2010.10.10."
    A popular long-form, stick-figure-illustrated blog about almost everything.
    "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
    Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.
    */

    String blogPostAuthorName;
    String blogPostTitle;
    String blogPostText;
    String blogPostDate;

    public static void main(String[] args) {

        BlogPost post1 = new BlogPost();
        post1.blogPostAuthorName = "John Doe";
        post1.blogPostTitle = "Lorem Ipsum";
        post1.blogPostText = "Lorem ipsum dolor sit amet.";
        post1.blogPostDate = "2000.05.04.";

        BlogPost post2 = new BlogPost();
        post2.blogPostAuthorName = "Tim Urban";
        post2.blogPostTitle = "Wait but why";
        post2.blogPostText = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        post2.blogPostDate = "2010.10.10.";

        BlogPost post3 = new BlogPost();
        post3.blogPostAuthorName = "William Turton";
        post3.blogPostTitle = "Wait but why";
        post3.blogPostText = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        post3.blogPostDate = "2017.03.28.";

        System.out.println("\"" + post1.blogPostTitle + "\" titled by " + post1.blogPostAuthorName + " posted at \"" + post1.blogPostDate + "\"\n" + post1.blogPostText);
        System.out.println("\"" + post2.blogPostTitle + "\" titled by " + post2.blogPostAuthorName + " posted at \"" + post2.blogPostDate + "\"\n" + post2.blogPostText);
        System.out.println("\"" + post3.blogPostTitle + "\" titled by " + post3.blogPostAuthorName + " posted at \"" + post3.blogPostDate + "\"\n" + post3.blogPostText);
    }
}
