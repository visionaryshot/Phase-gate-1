#Create a list  with 20 elements, all set to 0
#Function for Show Parking Status :
#Function for Park a Car, 
#Function for Remove a Car
#Then Main Loop to repeat forever until you exist



my_slots = [0 for _ in range(20)]

def show_status():
    print("Our Parking Status:")
    for count, slot in enumerate (my_slots):
        print(f"Slot {count + 1}: {'Occupied' if my_slots == 1 else 'Empty'}")

def park_car():
    for counter in range(len(my_slots)):
        if my_slots[counter] == 0:
            my_slots[counter] = 1
            print(f"You dey park for slot: {counter + 1}")
            return
    print("Our Parking lot is full. \nApply for regular.")

def remove_car(slot_number):
    count = slot_number - 1
    if 0 <= count < len(slots):
        if my_slots[count] == 1:
            my_slots[count] = 0
            print(f"Car removed from slot {slot_number}")
        else:
            print("Slot is empty.")
    else:
        print("Invalid slot number.")


while True:
    print("""
 WELCOME TO OUR VVIP PARKING SERVICE
  
Our Parking Lot Menu:
    1->   Park a car
    2->   Remove a car
    3->   Show parking status
    4->   Exit
    """)
    userinput = input("Select any number: ")

    if userinput == '1':
        park_car()
    elif userinput == '2':
        slot = int(input("Enter any slot number to remove car (1-20): "))
        remove_car(slot)
    elif userinput == '3':
        show_status()
    elif userinput == '4':
        print("bye - bye")
        break
    else:
        print("Invalid life de.")
