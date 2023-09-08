# 🏧 Terminal Account Challenge

Digital Innoation One's basic java course coding challenge

## 🧩 Challenge Description

You must create a Java project applying what we saw until now, incluiding: Git and GitHub for version control and code sharing, Java naming conventions and adequate Java synthax usage for algorithm implemenation.

1. Create a project "BankAccount" which will receive data through console about a bank account following the example bellow.

    | Attribute | Type | Example |
    |-----------|------|---------|
    | Number | Integer | 1021 |
    | Agency | Text | 067-8 |
    | Full Name | Text | Mario Andrade |
    | Balance | Decimal | 237.48 |

2. Inside the project, create a class "TerminalAccount.java" to elaborate your solution.

## ⚙ What I did

**First**, I made a small list about what the programm should be able to do:

    1. Show a welcome message;
    2. Ask for user inputs;
    3. Read user inputs;
    4. Show a message that includes user input data

Then, I looked for information to build the programm upon that list.

**Second**, as I coded the main function, I noticed it was getting a bit crowded with messages that were not necessary functionality wise. So, I decided to create a separate class *'WelcomeMessage'* to contain a greeting.

<details>
<summary>Considerations for <i>'WelcomeMessage'</i> class in a larger system </summary>

     In a larger system it could be called 'PoliteFeedbackMessages' as it would contain several messages triggered by user actions. As an example, when contracting a service or submitting a complaint, there would be messages such as "We're glad you decided to rely on us for your new investment!" or "We're sorry you had a bad experience with our 'X' service. We'll consider your feedback in future updates.".

     Another class such as 'TipMessages' or 'HelpMessages' would also be good. A tip/help request would trigger message depending on user navigation.

 </details>
   
<br/>

**Third**, I had input problems using a sole string to alocate user's full name, said problem was caused by a white space between first and last name. As a *temporary* solution, I separated the original userName variable in two variables firstName and lastName.









