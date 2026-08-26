food delivery backend application 
 
- hotel list 
- food list 
- rating for each hotel 
- filter on search
- user profile 
- past orders
- delivery partner details 


lets start by creating class for each features

** lets consider this food delivery app of a particular hotel like dominoes so we would not need the hotel list 

User class
- contains name, address, phone number, order history , cart things
food list 
- food name, description, image, rating , price
Delivery partner
- user name, rating, phone number
Order
- food name, count of food , total price

classes
User
Food
Cart
CartItem
Order
OrderItem
DeliveryPartner

create tables for all the class name in db so update it as @Entity

we need to update primary key for every objects it seems - every entity should for sure contain primary key 

now we need to find the relationship between this entities 

one to one / one to many / many to many 

example one to one 

user ------ cart [ a user can have one cart ]

one to many 

order ----- ordercart [ a order can have multiple orders in it ]

JPA may try to create a relationship from both sides. if both class have onetoone declaration in class

// Cart
@OneToOne(mappedBy = "cart")
private User user;


@OneToOne

User - Cart

@ManyToOne
CartItem → Food
OrderItem → Food
Order → DeliveryPartner

@OneToMany
User → Order
Order → OrderItem
Cart → CartItem

after creating this relationships we need to create DB

Step 1 — Start MySQL container

Run this in your Codespace terminal:

docker run --name food-delivery-mysql \
  -e MYSQL_ROOT_PASSWORD=root \
  -e MYSQL_DATABASE=food_delivery \
  -p 3306:3306 \
  -d mysql:8.0

next time you dont need to create the container but just start 
docker start food-delivery-mysql

run the application 

dont need to commit the target file changes sinces they are done by the maven in run time like the meta data 
Now to update the tables we have created now we need to create Repository - so that we can use it for updating the tables 

Repository = "How do I talk to the database?"

Service = "What should my application do?"

next we need to create service class to do the math
next create controller class

Run this everytime you start the server:

export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH

mvn spring-boot:run

In Postman, use:

GET http://localhost:8080/foods - this is for desktop version 
since we are using codespace
https://bug-free-pancake-jw4vpr66wg63j7j4-8080.app.github.dev/foods

to run in codespace instead of postman 
curl http://localhost:8080/foods
