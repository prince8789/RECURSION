def water_jug(jug1, jug2, target):
    x, y = 0, 0   # start with empty jugs

    while (x != target and y != target):
        print(f"Jug1: {x}, Jug2: {y}")

        # Rule 1: If jug1 is empty, fill it
        if x == 0:
            x = jug1

        # Rule 2: If jug2 is full, empty it
        elif y == jug2:
            y = 0

        # Rule 3: Pour water from jug1 -> jug2
        else:
            transfer = min(x, jug2 - y)
            x -= transfer
            y += transfer

    print(f"Final State -> Jug1: {x}, Jug2: {y}")
    print("Target achieved!")


# Driver code
jug1 = int(input("Enter capacity of Jug1: "))
jug2 = int(input("Enter capacity of Jug2: "))
target = int(input("Enter target amount: "))

water_jug(jug1, jug2, target)
