# java_programs
<details>
<summary> 1.Basic Calculator. </summary>
Explanation:<br>
The Java program uses the Scanner class to take user input for two numbers.<br>
It defines four functions (add, subtract, multiply, divide) to perform basic arithmetic operations.<br>
The results of these operations are printed to the console.
</details>

<details>
<summary> 2.Number Guessing Game. </summary>
Explanation:<br>
The program uses the Random class to generate a random number between 1 and 100.<br>
It prompts the user to guess the number and provides feedback on whether the guess is too high or too low.<br>
The game continues until the correct number is guessed.
</details>

<details>
<summary>3. To-Do List App. </summary>
Explanation:<br>
The Java program uses an `ArrayList` to store tasks and a `Scanner` for user input.<br>
A menu is displayed with options to add tasks, view tasks, or quit the app.<br>
The app continues running until the user chooses to quit.
</details>

<details>
<summary> 4. Weather App. </summary>
Explanation:<br>
The program prompts the user to enter the city name and constructs a URL to fetch weather data using the OpenWeatherMap API.<br>
It sends an HTTP GET request using `HttpURLConnection` and processes the JSON response.<br>
If the request is successful (status code 200), it extracts and displays the current temperature and weather description.<br>
In case of an error, it prints an error message.<br>
<summary>Important: </summary>
To make the code work, add the 'JSONObject.jar' files to the referenced libraries of Java Project.
</details>

<details>
<summary> 5. Hangman Game. </summary>
Explanation:<br>
The program selects a random word from a predefined list, and the player needs to guess the word by inputting letters.<br>
It displays the current state of the word with underscores for unguessed letters and updates it as the player guesses correctly.<br>
The player has a limited number of attempts (6 in this case) to guess the word.<br>
If the player guesses the word or runs out of attempts, the game ends.
</details>

<details>
<summary> 6. Basic Website Scraper. </summary>
Explanation:<br>
The Java program uses the `jsoup` library to connect to 'https://www.google.com' and parse its HTML.<br>
It selects and prints the `href` attribute of all links (`a` tags) from the Google homepage.<br>
<summary>Important: </summary>
To make the code work, add the 'jsoup.jar' files to the referenced libraries of Java Project.
</details>

<details>
<summary> 7. Basic File Handling. </summary>
Explanation:<br>
The Java program demonstrates basic file handling operations - writing content to a file and reading content from a file.<br>
It writes a sample line to a file, then reads and prints the content of the file.
</details>

<details>
<summary> 8. Program that Accepts a Sentence and Calculates the Number of Letters and Digits. </summary>
Explanation:<br>
The Java program takes a sentence as input and iterates through each character, counting the number of letters and digits.<br>
It then prints the counts of letters and digits in the entered sentence.
</details>


<details>
<summary> 9. Currency Converter. </summary>
Explanation:<br>
The Java program demonstrates a simple currency converter with predefined conversion rates using a HashMap.<br>
It converts 100 USD to INR along with other conversion rates.
</details>

<details>
<summary>10. Random Password Generator. </summary>
Explanation:<br>
The Java program defines a function `generateRandomPassword` that generates a random password of a specified length using letters, digits, and special characters.<br>
The password is then printed.
</details>
