package org.loginservlet;


    public class TestInsert {
           public static void main(String[] args) {
                String username = "marcel";
                String password = "1234";

                // Insert new user
                boolean inserted = LoginDao.insertUser(username, password);
                if (inserted) {
                    System.out.println("User inserted successfully.");
                } else {
                    System.out.println("Failed to insert user.");
                }

                // Validate inserted user
                boolean validated = LoginDao.validate(username, password);
                if (validated) {
                    System.out.println("User validated successfully.");
                } else {
                    System.out.println("Failed to validate user.");
                }
            }
    }


