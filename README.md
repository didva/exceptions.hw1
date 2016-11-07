OOP + Exceptions. Home work 1 
=============================

1 Extended Integer 
------------------
Implement all methods for ExtendedInteger class. The class contains:

1. An int data field named value that stores the int value reprinted by this object. 
2. A constructor that creates a ExtendedInteger object for the specified int value. 
3. A get method that returns the int value. 
4. Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime respectively. 
5. Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime respectively. 
6. Static methods isEven(ExtendedInteger), isOdd(ExtendedInteger), and isPrime(ExtendedInteger) that return true if the specified value is even, odd, or prime respectively. 
7. Methods equals(int) and equals(Object) that return true if the value in the object is equal to the specified value. 
8. A static method parseInt(char\[\]) that converts an array of numeric characters to an int value. 
9. A static method parseInt(String) that converts a string to an int value.

2 Vehicles 
----------
Implement Vehicle class hierarchy. There should be the following: 

1. Parent Class: Vehicle. 
This abstract parent class has private instance variables, mutator methods, accessor methods, and constructor parameters for: Year manufactured; Make; Model.
2. Child Classes: Car, Boat, Airplane. 
Class Vehicle has child classes which have additional private instance variables, mutator methods, accessor methods, and constructor parameters for:

            Car has "int horsepower"; 
            Boat has "boolean motorized"; 
            Airplane has "int maximumHeightFeet".

3. Each of the Car, Boat, and Airplane classes must override the equals() and toString() methods.

        Methods equals(): 
            Cars are equal if their horsepower is within 10 of one another. 
            Boats are equal if they are both motorized, or both unmotorized. 
            Airplanes are equal if their maximumHeightFeet is within 1000 of one another.         
        The toString methods must return a String in these formats: 
            This car is a 1999 Toyota Corrola with 140 hp. 
            This boat is a 1980 Bayliner Extreme (with motor). 
            This airplane is a 1998 ABC Motors Comac that can reach 10000 feet.

4. Implementing Steerable Interface. 
```
    Each of the Car, Boat, and Airplane classes must implement the Steerable interface. 
    This interface has methods to accelerate(), steerLeft(), and steerRight().   
        Methods accelerate():
            Cars that accelerate simply return "fire pistons, turn wheels"; 
            Boats that accelerate simply return "jet water";
            Airplanes that accelerate simply return "fire engines on wings".
        Methods steerLeft():
            Cars that steer left simply return "turn wheels left";
            Boats that steer left simply return "turn tiller left"; 
            Airplanes that steer left simply return "lift wing flaps to turn left".
        Methods steerRight():
            Cars that steer right simply return "turn wheels right"; 
            Boats that steer right simply return "turn tiller right"; 
            Airplanes that steer right simply return "lift wing flaps to turn right".
```
3 Bank Account
--------------
Create class that implements BankAccount interface. Your task is to write that class.
The primary task of the BankAccount object is to keep track of the account balance. 
However, different accounts may earn interest at different rates, so the object must also track its own interest rate.
The BankAccount class should has three constructors:

1. one takes an initial balance and an interest rate;
2. one takes just the initial balance (the interest rate is set to the default interest rate, which is 1.0%); 
3. one takes no arguments (the balance is set to $0.00, and the interest rate to the default).

Each BankAccount object is assigned an account number in the order that it was created. 
That is, the account number for the first account is 1, for the second account 2, and so on. 
This account number is available through the instance constant ACCOUNT_NO.
BankAccounts also have the following methods:

1. **getBalance** - returns the balance in this account;
2. **getRate** - returns the rate for this account;
3. **withdraw** - takes money out of the account -- but only if there's enough money in the account to cover the withdrawal; 
4. **deposit** - adds money to the account;
5. **addInterest** adds interest to the account. It adds one year's interest to the account (at the account's individual interest rate). For example, if the balance is $1000.00 and the rate is 10%, then addInterest() increases the balance to $1100 ($1000 plus 10% of $1000); 
6. **setRate** - changes the interest rate on this account;
7. **toString** - returns a String representing this account. The String is of the form "Account #N, ($bbb.bb)", where N is the account number and bbb.bb is the account balance. Balance must have exactly two digits after the decimal with DOWN rounding.

4 Transaction management for Bank Account
-----------------------------------------
Implement TransactionalBankAccount interface. There are several additional things:

1. **setAutoCommit** - determine whether each specific operation is automatically committed (can't be reverted);
2. **commit** - when auto commit is disabled, commits all changes;
3. **revert** - when auto commit is disabled, revert all uncommitted changes.

Feel free to use BankAccount implemented in previous task.

5 Transaction manager
---------------------

As soon as we have TransactionalBankAccount it's not very convenient to execute bunch of operations in one transaction. 
Implement AccountTransactionManager which allows to execute several operations at once.
There two methods:
 
1. **execute** - executes array of operations. Do not guaranty that all operations are executed without errors and do not revert previous operations in case of errors.
2. **executeInTransaction** - executes array of operations in transactions. Guaranty that ALL operations are executed or none of them (in case of any error). Should disable autoCommit after execution.
