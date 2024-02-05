package org.example.week1_if_else_statements;

import static input.InputUtils.*;



public class ScopeExample { // primary scope

    // A new scope is created everytime curly braces are introduced

    public static void main(String[] args) { // secondary scope

        String[] bookList = {
                "Automate the boring stuff with python",
                "Java Programming",
                "A very complex and long programming book title with a lot of words but also a lot of information inside."
        };

        printBookList(bookList);

        String email = stringInput("Enter your email");

        double bookPrice = 40;

        double discount = 0;

        if (email.endsWith(".edu")) { // tertiary scope
            System.out.println("Your student email is " + email);
            discount = 10; // 10% student discount
            // If discount is defined in this if-statement like "double discount = 10;",
            // then variables within this if-statement/scope will be discarded after the statement has finished.
            // This means that we can't use the defined discount in a previous scope.
            // It's also why we can have variables of the same name in different methods
            // that are placed within the same scope.
        } // end of tertiary scope

        System.out.println(email);
        // Calculates final price with any discounts
        bookPrice = bookPrice / 100 * (100 - discount);
    } // end of secondary scope

    public static void printBookList(String[] books) { // secondary scope

        for (int i = 0; i < books.length; i++) { // tertiary scope
            String book = books[i];

            // Truncate longer book names
            if (book.length() > 50) { // quaternary scope
                book = book.substring(0,50) + "...";
            } // end of quaternary scope
            System.out.println(i + 1 + ": " + book);
        } // end of tertiary scope

        // does i exist here?:      no
        // does book exist here?:   no
        // does books exist here?:  yes!
        System.out.println(books);

    } // end of secondary scope

} // end of primary scope
