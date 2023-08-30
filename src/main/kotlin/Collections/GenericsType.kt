package Collections

fun main() {
    val footballPlayer = FootballPlayer("Football player 1")
    val footballPlayer2 = FootballPlayer("Football player 2")


    val baseballPlayer = BaseballPlayer("Baseball player 1")
    val baseballPlayer2 = BaseballPlayer("Baseball player 2")

    val footballTeam = Team<FootballPlayer>("Football team", mutableListOf(footballPlayer))
    footballTeam.addPlayers(footballPlayer)
    footballTeam.addPlayers(footballPlayer2)

    val baseballTeam = Team<BaseballPlayer>("Baseball team", mutableListOf(baseballPlayer2))
    baseballTeam.addPlayers(baseballPlayer)
    baseballTeam.addPlayers(baseballPlayer2)

}

class Team<T : Player>(val name: String, val players: MutableList<T>) {
    fun addPlayers(player: T) {
        if (players.contains(player)) {
            println("Player: ${player.name} is already in the team ${this.name}")
        } else {
            players.add(player)
            println("Player: ${player.name} was add in the team ${this.name}")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String) : Player(name)
class BaseballPlayer(name: String) : Player(name)
