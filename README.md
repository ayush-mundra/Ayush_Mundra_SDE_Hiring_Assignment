
# Automated Parking Lot Ticketing System

This repository contains the source code for an automated parking lot ticketing system implemented in Java. The system allows users to manage parking slots efficiently through a command-line interface.

## Features

- **Parking Lot Initialization**: Create a parking lot with a specified number of slots.
- **Car Parking**: Allocate a parking slot to a car, recording its registration number and color.
- **Car Leaving**: Mark a parking slot as available upon car exit.
- **Status Display**: View the current status of the parking lot, including occupied slots and car details.
- **Information Retrieval**:
  - Retrieve registration numbers of cars with a specified color.
  - Retrieve slot numbers of all slots where cars of a particular color are parked.
  - Retrieve the slot number where a car with a given registration number is parked.
- **Interactive Command Prompt**: Accept commands through the command line for easy interaction.

## Usage

1. Compile the `Main.java` file.
   ```bash
   javac Main.java
2. Run the compiled program.
   ```bash
   java Main


java Main

Follow the on-screen prompts to interact with the parking lot system. Use commands as described in the prompt.
Commands
create_parking_lot <num_slots>: Create a parking lot with the specified number of slots.  

park <registration_number> <color>: Allocate a parking slot to a car with the given registration number and color.  

leave <slot_number>: Mark the specified slot as available.  

status: Display the current status of the parking lot, including occupied slots and car details.  

registration_numbers_for_cars_with_colour <color>: Retrieve registration numbers of cars with the specified color.  

slot_numbers_for_cars_with_colour <color>: Retrieve slot numbers of all slots where cars of the specified color are parked.  

slot_number_for_registration_number <registration_number>: Retrieve the slot number where a car with the given registration number is parked.  

exit: Terminate the application and return control to the command line.
