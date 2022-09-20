# Address book in Java (Coursework) 

### A simple address book application written in Java as coursework for JAV41 at AKAD University.

Hello to whoever might be reading this!

This repository contains a small school project that I had to do for University. 
Therefore it is mainly for myself as version control while I am taking this project past the requirements set by the course. It was made public so the code can be shared with classmates who might be interested in seing someone elses implementation of the previously mentioned requirements.


*Just to avoid any confusion;  Class-, Variable- and Method declarations will be German as I am attending a German university. Nameing conventions in Java were still followed resulting in a mix of German and English as for example ```getVorname()```.* 

#### Future improvements

This will be quick overview of future improvements that I have planned. These are purely for my own interest.

- [ ] Implementing a hash map improve on the current search time of (O)N of the ``` getFreund()``` method. 
- [ ] Using JDBC to connect the address book to an SQL database to make changes, additions etc. permanent on disk rather than temporary in memory. (The addition will be found in the *JDBC* branch of this repo.)
- [ ] Refactoring the code and add comments for better understanding (famous last words lol). 


#### Current Implementation 

The class **Kartei** creates an ArrayList when instantiated. Stored inside are the address book entries. The entries are of type Freund. The **Freund** class describes the friend who is to be stored. It holds a first- and last name, the birtdate as well as the address as attributes. The address itself is implemented as its own seperate class **Adresse**. Address' attributes are a postal code, city name and street name. 

**Freund** is not instantiated by the user using it's constructor directly, but using the class **FreundBuilder**. The class follows the builder design pattern. It is more user friendly and allows for the entire object to be built, even if certain attributes are missing. As those are then filled with *null* values, they have to be caught when using any ``` get() ``` method. 

The main class is not included in this repo, because it is irrelevant to the rest of the code. Some sample inputs and the resulting outputs are found below.


#### Sample input

``` 
        //Building address book:
        Kartei fooKartei = new Kartei();
        
        
        //Building new friend:
        Freund fooBar = new FreundBuilder().withName("Foo", "Bar").withGeburtsdatum("19.09.1990").withAdresse(9999, "fooTown", "Bar Strasse").build();

        //Adding friend to address book:
        fooKartei.addFreund(fooBar);

        //Printing friend
        System.out.println("Name: " + fooKartei.getFreund("bar", 1).getVorname() + ", Birthday " + fooKartei.getFreund("bar", 1).getGeburtsdatum() + ",   City " + fooKartei.getFreund("bar", 1).getAdresse().getOrt());

        //Check amount of people saved
        System.out.println("Amount of contacts in this address book: " + fooKartei.getGesamtZahl());

        //Attempt to delete non-existant entry: 
        fooKartei.delFreund("Peter", 3);

        //Confirm no entry has been deleted 
        System.out.println("Amount of contacts in this address book: " + fooKartei.getGesamtZahl());

        //Deletion of existing entry: 
        fooKartei.delFreund("bar", 1);
        
        
        //Confirm entry has been deleted 
        System.out.println("Friends in this address book: " + fooKartei.getGesamtZahl());
``` 

#### Sample Output

``` 

//Building new friend:
/Foo/ erfolgreich erstellt.  Schlüssel Nummer: 1

//Printing friend after they have been added: 
Name: Foo, Birthday 19.09.1990, City fooTown

Amount of contacts in this address book: 1

//Attempt to delete non-existant entry: 
Freund nicht in der Kartei oder schon geloescht.

Amount of contacts in this address book: 1

//Deletion of existing entry: 
Name: bar, Schlüssel: 1- erfolgreich gelöscht

Friends in this address book: 0

```
