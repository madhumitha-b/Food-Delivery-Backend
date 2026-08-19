# Food Delivery Backend
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

placed in model folder as this are the DOMAIN entity 
service - what the application do 