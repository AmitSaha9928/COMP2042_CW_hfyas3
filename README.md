# COMP2042_CW_hfyas3_AmitSaha
## Introduction
This is the README file for the coursework for COMP2042. The coursework involves performing maintenance on the provided JavaFx project for the game, Frogger, as well as adding extensions to improve the game.

##Requirements
Needs JavaFX installed and a compiler, for this project Eclipse was used.

## Installation
1. Download the whole ZIP file from GitHub onto your desktop.
2. Save your ZIP file into a new folder and right-click select Extract Here.
3. Import the project into Eclipse IDE.
4. Select TryFrog1 file folder then click Finish.
5. Click the Run drop down menu and click Run Configurations.
6. Put in --module-path "C:\Users\lawkh\Downloads\javafx-sdk-11.0.2\lib" --add-modules=ALL-MODULE-PATH in VM arguments.
7. Game is good to go.

##Credits
This game is improved and extended from https://github.com/hirish99/Frogger-Arcade-Game

##License
This Game is copyright Free

## Maintenence
1. Refactoring the code by putting all the image files and music files into separate different folders.
2. The main menu code is refactored into a new class from Main.java to avoid clutter in the Main.java file and to ensure it is readable.
3.  The help screen code is refactored into a new class from Main.java to avoid clutter in the Main.java file and to ensure it is readable.
4. Performed bugfix on background image not showing.

## Extentions
1. A Main Menu page has been added which will be displayed at the start of the program from which the user can press spacebar for going to the selection screen where the user can press h which triggers the help screen which tells the user about how to play the game and its controls, r for water level and t for water level
2. A High Score pop up has been added which shows the current score after finishing the level and also shows the all time high score. The all time high score is stored in scores.dat file.
3. A lives counter has also been added to keep track of how many times the player has died. The player has been given 3 lives by default. 
4. A new Sky Level has been added with all new obstacles

## Bug Fix
1. The background image path has been fixed. Now the background shows up correctly
2. The score was at an awkward position which blocked a bit of the "r" from ther frogger logo on the top

## Screenshots of Game
Start Menu

![new](https://user-images.githubusercontent.com/65004568/102677966-76142700-41cf-11eb-975e-ca4e8ddbd289.PNG)

Selection Menu

![new2](https://user-images.githubusercontent.com/65004568/102677983-8d531480-41cf-11eb-9f7a-8af84a05fc1c.PNG)

Water Level

![Capture2](https://user-images.githubusercontent.com/65004568/102628280-a1692880-4173-11eb-87af-ce45c9d67f9d.PNG)

Sky Level

![new 3](https://user-images.githubusercontent.com/65004568/102677934-47964c00-41cf-11eb-92bc-14c916ed687f.PNG)

High Score Popup

![Capture3](https://user-images.githubusercontent.com/65004568/102628464-eb520e80-4173-11eb-8ee5-fd32ac924014.PNG)

