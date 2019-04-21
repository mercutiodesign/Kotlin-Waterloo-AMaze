# Kotlin-Waterloo-AMaze
Forked from a game for a coding session of the [Kotlin Waterloo P2P Group].

![picture](/src/main/resources/images/Capture.PNG)

### Setup Instructions:
1. Ensure that you have a [Java SDK] installed (the JRE is not enough, should be at least version 8)
2. Install a recent version of [IntelliJ Idea] (the free community edition is fine).
    * If you already have IntelliJ installed, ensure that you have Kotlin plugin 1.3 or newer
3. Clone this repo, start IntelliJ and choose **Import Project**
4. Click **Next** and **Finish**
5. Open `Puzzle1.kt` (in the package amaze.puzzles) and run it
6. Fix the **getNextMove()** method to make the llama go forward and move on to the next puzzle
7. To speed up or slow down the game you can edit the `MILLIS_PER_MOVE` constant in `Maze.kt`

### Design Choices:
* Primary goal was to simplify the setup process since we only have 10 minutes to get everyone running
    * Avoid any dependencies to eliminate the potential for setup issues
    * Avoid dependency on JUnit.  We removed unit tests but we strongly encourage unit tests for regular projects

   [Kotlin Waterloo P2P Group]: https://www.meetup.com/Kotlin-Waterloo-P2P/
   [Java SDK]: https://adoptopenjdk.net/
   [IntelliJ Idea]: https://www.jetbrains.com/idea/
   
