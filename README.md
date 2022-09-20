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

- Class Kartei
- Class Freund
- Class Adresse
- Class FreundBuilder

- Class Main




Following code returns following things

``` 

Kartei fooKartei = new Kartei();

Freund x = new FreundBuilder().withName("X", "Y").withGeburtsdatum("99.99.9999").withAdresse(9999, "XYZ", "ZYX"). build();

fooKartei.addFreund(x);

System.out.println 

etc...
``` 

*Picture of sample output*

