# ENSE 370 Winter 2019 Final Exam – Question 3

**PROMPT**: Consider an online banking application on a PC where a human user can perform any of the following two actions: (i) view his account balance, and (ii) transfer funds. However, prior to doing any of the two actions, the human user must sign in with his bank account number and password. When the application is launched, a sign-in page is loaded and the human user is prompted to enter his bank account number and password. After the bank account number and password are verified, the application provides a menu to the human user with only two options: view account balance or transfer funds. The human user may select either of the two transactions, and upon completing the transaction, the same menu is presented to the human user again (i.e. the human user can view his account balance, or transfer funds, or alternate between the two actions, an infinite number of times). To leave the menu screen, the human user must press the ESC key on the keyboard, and the application will automatically sign the user out and return to the sign-in screen. 

In addition, the bank’s server is able to remotely update the software on the PC anytime that it wishes. However, if a human user is currently using the system, the software update will be delayed until the human user has completed all his transactions and signed out.

PART A: Draw the use case diagram.

PART B: Write the use case description for the “Sign-in” use case. This use case is started by the human user entering his bank account number and password on the sign-in page. After successful verification of the bank account number and password, the system will display a menu with two options (view account balance and transfer funds) for the human user to choose. You may assume that if the bank account number and password combination failed to match with the bank’s records after three tries, the bank account will be blocked from signing in for a period of 24 hours.

PART C: Now write the use case description for the “View Account Balance” use case. This use case starts from the sign-in page and includes the “Sign-in” use case. Upon the human user’s selection of view account balance, the system will read the account balance from the bank database and display it on the screen. The menu is then displayed to the user again and the system will prompt the human user for another selection. At any point, if the human user presses the ESC key on the keyboard, the user will be signed out and the system will return to the sign-in screen.

PART D: Draw the software system context class diagram.

PART E: Draw the object structuring diagram, including all external objects, boundary objects and internal objects. Hint: Notice that this is a state dependent system so you will need a "state dependent control" object. You will also need an "entity" object to store the account information (such as account number and balance). Include stereotypes for all your objects.
  
PART F: The message sequence for the “Sign in” use case, which starts with input from the primary actor, the human user, is as follows:

- S1: The Human User enters the bank account number and password on the sign-in page. The Human User Interaction object reads the user input.
- S1.1: The Human User Interaction object sends the input data to the Account Information entity object.
- S1.2: The Human User Interaction object sends a Sign-in Input Received message to the State Dependent Control object. The equivalent Sign-in Input Received event causes the State Dependent Control statechart to transition from the Idle state (initial state) to the Validating Account and Password state. The output event associated with this transition is Validate Account and Password.
- S1.3: The State Dependent Control object sends a Validate Account and Password request to the Bank’s server.
- S1.4: The Bank’s server validates the account number and password and sends a Valid Account and Password response to the State Dependent Control object. As a result of this event, the State Dependent Control object transitions to Waiting For Human User Choice state. The output event for this transition is Display Menu, which corresponds to the output message sent by the State Dependent Control object.
- S1.5: The State Dependent Control object sends the Display Menu message to the Human User Interaction object.
- S1.6: The Human User Interaction object displays a menu showing View Account Balance and Transfer Funds options to the human user.

Draw the communication diagram (or sequence diagram) for the “Sign in” use case.

PART G: Using the message sequence in Q3(f), draw the statechart for the State Dependent Control object for the “Sign in” use case.
