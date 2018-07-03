<p align="center">
   <a href="https://travis-ci.org/hsamoht/yatzy">
      <img src="https://travis-ci.org/hsamoht/yatzy.svg?branch=master" alt="TravisCI" />
   </a>
   <a href="https://coveralls.io/github/hsamoht/yatzy?branch=master">
      <img src="https://coveralls.io/repos/github/hsamoht/yatzy/badge.svg?branch=master" alt="Coveralls" />
   </a>
   <a href="https://github.com/hsamoht/yatzy/releases">
      <img src="https://img.shields.io/badge/release-v0.1.0-blue.svg" alt="Releases" />
   </a>
   <a href="LICENSE">
      <img src="https://img.shields.io/badge/license-MIT-blue.svg" alt="License" />
   </a>
</p>

# Yatzy!
<img align="right" width="50%" height="50%" src="https://i.imgur.com/D8lmqYY.gif">

A simple JavaFX application to play the game of Yatzy!

## Gameplay
[Yatzy](https://en.wikipedia.org/wiki/Yatzy) is a dice game where one to any number of players take turn rolling five dice. 

After each roll, the player chooses which dice to keep, and which to reroll. A player may reroll some or all of the dice up to two times each turn.

A score must be put on the score board when the player has no more re-rolls; if the roll yielded a score of zero points one of the options must me sacrificed. The game ends when there are no more options on the score card.

The score board is divided into an upper and lower section. If the player manages to score a total of 64 points* in the upper section the player is awarded a bonus of 50 points.

The player with the highest total score wins the game.

| Category  | Description | Score | Example | Max
| ------------- | ------------- | ------------- | ------------- | ------------- |
| Ones | Any combination of ones  | Sum of ones | <img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/> = 3 | 5
| Twos | Any combination of twos| Sum of twos |<img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die6.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="6"/> = 6 | 10
| Threes | Any combination of threes | Sum of threes |<img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/> = 12 | 15
| Fours | Any combination of fours |  Sum of fours |<img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/> = 8 | 20
| Fives | Any combination of fives |  Sum of fives |<img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/> = 5 | 25
| Sixes | Any combination of sixes | Sum of sixes |<img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die6.png" width="30" height="30" alt="6"/><img src="/src/main/resources/yatzy/images/die6.png" width="30" height="30" alt="6"/><img src="/src/main/resources/yatzy/images/die6.png" width="30" height="30" alt="6"/> = 18 | 30
| 1 Pair | Two dice of the same type | Sum of the pair | <img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/> = 10 | 12
| 2 Pair | Two different pairs | Sum of the pairs | <img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/> = 14 | 22
| 3 of a kind | Three dice of the same type | Sum of the three dice | <img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/><img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/> = 12 | 18
| 4 of a kind | Four dice of the same type | Sum of the four dice | <img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die6.png" width="30" height="30" alt="6"/> = 4 | 24
| Small straight | The combination 1-2-3-4-5 | 15 | <img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/> = 15 | 15
| Large straight | The combination 2-3-4-5-6 | 20 | <img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die6.png" width="30" height="30" alt="6"/> = 20 | 20
| Full house | A pair and three of a kind | Sum of all dice | <img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/> = 21 | 28
| Chance | Any combination of dice | Sum of all dice | <img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die5.png" width="30" height="30" alt="5"/><img src="/src/main/resources/yatzy/images/die3.png" width="30" height="30" alt="3"/><img src="/src/main/resources/yatzy/images/die1.png" width="30" height="30" alt="1"/><img src="/src/main/resources/yatzy/images/die4.png" width="30" height="30" alt="4"/> = 18 | 30
| Yatzy | All dice being the same | 50 | <img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/><img src="/src/main/resources/yatzy/images/die2.png" width="30" height="30" alt="2"/> = 50 | 50

### Alternative mode
An alternative mode is playing with forced sequence. Here players **must** place the scores in the same sequence as they appear on the board. If the player is unable to throw a valid dice combination the score must be sacrificed. * In this mode the players only need to reach 42 points in the upper section to be awarded the bonus.

## Getting started

### Installation
There is no installation required! Simply download the fat-jar from latest [releases](https://github.com/hsamoht/yatzy/releases) and run it as an executable. 

Requirements:
- JRE 1.8 or later.

### Development setup
Clone the project to your local machine. Open it in your IDE as an existing Gradle project and build the root module.

Requirements:
- JDK 1.8 or later.
- Gradle 4.0 or later.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
