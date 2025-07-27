menu={
    'Pizza':40,
    'Burger':60,
    'Pasta':70,
    'Salad':80,
    'Coffee':90,
}
#Greet
print("When to the python Restaurant");
print("Pizza: Rs40\nBurger: Rs60\nPasta: Rs70\nSalad: Rs80\nCoffee: Rs90\n");

total_order=0;
item_1=input("Enter the name of items you want to order = ");
if item_1 in menu:
    total_order+=menu[item_1];
    print(f"Your item {item_1} has been added to your order")
else:
    print(f"Ordered item {item_1} is not available yet!");

another_order=input("Do you want to add another items? (Yes/No) ");
if another_order=="Yes":
    item_2=input("Enter the name of second item = ");
    if item_2 in menu:
        total_order+=menu[item_2];
        print(f"Item {item_2} has been added to your order")
    else:
        print(f"Ordered item {item_2} is not available yet!")
        
print(f"The total amount of items to pay is {total_order}");
