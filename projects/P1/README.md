# Scrabble

This project is designed to test your ability to apply the concepts of File Reading and Inheritance. For this project, you will complete a supplied `TextFileAccessor` class and then extend this class with a new class; `MaxScrabbleScore`. You will be supplied with the `ScrabbleDriver` class, which uses both `TextFileAccessor` and `MaxScrabbleScore`, as well as the basic structure of the `TextFileAccessor` and `MaxScrabbleScore` classes. It is the expectation that you (and then I), can compile all three documents in an IDE and run the Driver program. Additionally supplied will be some test text files whose outputs are listed later in this document.
	
In Scrabble, each letter is assigned a point value. Specifically:

| A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q  | R | S | T | U | V | W | X | Y | Z  |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|----|---|---|---|---|---|---|---|---|----|
| 1 | 3 | 3 | 2 | 1 | 4 | 2 | 4 | 1 | 8 | 5 | 1 | 3 | 1 | 1 | 3 | 10 | 1 | 1 | 1 | 1 | 4 | 4 | 8 | 4 | 10 |


These scores are modified based upon the location of the letter in line. If the position of the letter is divisible by 4, then it scores **double** points. If it is divisible by 9, it then scores **triple** points. In the case that both criteria are met, its point value is **doubled**. The 0 position counts as divisible by 4 only.

The driver functions by accepting a file name input by the user via the console (including the file extension). It creates a new `MaxScrabbleScore` type `TextFileAccessor` object and opens the file with the supplied name. It processes the file, going through each line in the document and scoring it by these rules. The highest scoring line in the document is stored along with its corresponding score as parameters of the object (by parameters here I mean more traits, properties), then both are reported by printing to console. Your output should have the structure:

Max scrabble score: [int value] for this line: [line that corresponds to the max score]

Here are some known results from supplied text files.

```
Enter the file name:
HeartOfDarkness.txt
Max scrabble score: 192 for this line: plenty time. I can manage. You take kurtz away quick--quick--i tell```
```

```
Enter the file name:
sampletext.txt
Max scrabble score: 40 for this line: and aid. their. Party?
```

```
Enter the file name:
othertest.txt
Max scrabble score: 38 for this line: dave, i am afraid.
```
