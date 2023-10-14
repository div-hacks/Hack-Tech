import random

# Initialize the game state
pacman = (0, 0)
ghosts = [(random.randint(0, 29), random.randint(0, 29)) for i in range(4)]
food = (random.randint(0, 29), random.randint(0, 29))

# Start the game loop
while True:

  # Get the player's input
  direction = input("Enter a direction (w, a, s, or d): ")

  # Move pacman
  if direction == "w":
    pacman = (pacman[0], pacman[1] - 1)
  elif direction == "a":
    pacman = (pacman[0] - 1, pacman[1])
  elif direction == "s":
    pacman = (pacman[0], pacman[1] + 1)
  elif direction == "d":
    pacman = (pacman[0] + 1, pacman[1])

  # Check if pacman hit a ghost
  for ghost in ghosts:
    if ghost == pacman:
      print("Game over!")
      break

  # Check if pacman ate the food
  if pacman == food:
    food = (random.randint(0, 29), random.randint(0, 29))
  else:
    pass

  # Display the game state
  print("\n".join([" ".join(str(x) for x in row) for row in screen]))
