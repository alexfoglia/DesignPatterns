# Design Principles

* Identify the aspects of your application that vary and separate them from what stays the same.
* Program to an interface, not an implementation.
* Favor composition (has-a) over inheritance (is-a).
* Strive for loosely coupled designs between objects that interact.
* Classes should be open for extension, but closed for modification (very important design principle). This is the **"Open-Closed"** principle.
* Depend upon abstractions. Do not depend upon concrete classes. This is the **"Dependency Inversion Principle"**.
* Principle of Least Knowledge: talk only to your immediate friends.
* The Hollywood Principle: Don't call us, we will call you. Parent classes call subclasses, not the other way around.
* A class should have only **one reason** to change (Single Responsibility).