import random

subjects=[
    "Shahrukh khan",
    "Virat Kohli",
    "Nirmala sitharaman",
    "Ayush Sharma",
    "Sumit Upadhyay",
    "Akansha Solanki",
    "Narendra Modi",
]

actions=[
    "lauches",
    "cancels",
    "dances with",
    "eats",
    "declare war on",
    "orders",
    "celebrate with",
]

places_or_things=[
    "at red fort",
    "in mumbai local train",
    "a plate of samosa",
    "inside parliament",
    "at ganga Ghat",
    "During IPL matches",
    "at india Gate",
]

while True:
    subject=random.choice(subjects)
    action=random.choice(actions)
    places_or_thing = random.choice(places_or_things);
    
    headline=f" BREAKING NEWS: {subject} {action} {places_or_thing} "
    print("\n" + headline)
    
    user_input = input("\nDo you want to add another headline? (yes/no)").strip().lower()
    if user_input=="no":
        break
print("\nThanks for using Fake headline Generator.Have a fun day")
