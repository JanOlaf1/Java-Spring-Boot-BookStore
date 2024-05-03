# Java-Spring-Boot-BookStore
School course work.
The primary emphasis of this course was on developing a BookStore Backend. While highlighting functionalities including delete, edit, add, and basic login. However, bear in mind that the primary focus was not on project and login security. Additionally, one main criterion was that certain functions are only accessible with admin-level authorization.
![image](https://github.com/JanOlaf1/Java-Spring-Boot-BookStore/assets/122294366/614f1d8f-f0b0-40f5-99af-51df53a15910)
If you attempt to access the app using the credentials 'admin' and 'admin', you will gain entry. On the initial page, you have the option to search a book from BookStore or cd from cd list from the repository
![image](https://github.com/JanOlaf1/Java-Spring-Boot-BookStore/assets/122294366/385ae55b-fd5f-41e2-b5f8-f5d23ad09178)
Please note that the dropdown navbar menu contains admin-level functions. If you log in with the credentials 'user' and 'user', you will observe that some functions have disappeared from the dropdown menu due to lack of authorization. Example below.
![image](https://github.com/JanOlaf1/Java-Spring-Boot-BookStore/assets/122294366/fd30617e-4a3a-4387-9b60-9b16cba84219)

With admin credentials, there is the possibility to add, delete, and/or edit. Please note that the add function can be accessed from the menu in the upper-right corner. You can see this menu options in the first picture of this ReadMe file. Below are pictures of the edit and delete functions.
![image](https://github.com/JanOlaf1/Java-Spring-Boot-BookStore/assets/122294366/7df322d6-40a3-418f-8b07-802ba22d03b1) 
The app also includes validation, requiring certain fields to be filled in. Saving information is not possible unless text is entered into these required fields.
![image](https://github.com/JanOlaf1/Java-Spring-Boot-BookStore/assets/122294366/f0ccf560-d8b0-433a-89e3-e61ec5a7b6a9)
The Book and CD lists have been synchronized to use the same categories when editing or adding information.
![image](https://github.com/JanOlaf1/Java-Spring-Boot-BookStore/assets/122294366/be8cf4b4-94b1-4644-9a28-4efb9a6681e7)
Below is a picture demonstrating how the search bar works on the front page when you input only 'as' into the search console.
![image](https://github.com/JanOlaf1/Java-Spring-Boot-BookStore/assets/122294366/85437b14-2bce-4be5-be5e-eb40bed813f3)
The Book and CD lists also feature ascending or descending order. For example, below is a picture demonstrating the ascending function, organized by authors starting from the letter 'A'.
![image](https://github.com/JanOlaf1/Java-Spring-Boot-BookStore/assets/122294366/ffdae4a8-94d1-4bc0-ad1b-7c976db51faa)
Note that if you use this app, it operates via H2 console, and the data won't be saved if the app is shut down. To ensure data persistence even if the app is shut down, I recommend using PostgreSQL.

Thank you for your interest in this project!

Wishing you the best,

Jan / creator of this project.

