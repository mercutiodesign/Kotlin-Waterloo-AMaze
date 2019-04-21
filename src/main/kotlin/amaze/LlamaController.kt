package amaze

import amaze.LlamaState.*

data class Position(val column: Int, val row: Int)

interface LlamaController {
    fun getNextMove(maze: Maze): LlamaAction
}

enum class LlamaAction {
    MOVE_FORWARD,
    TURN_LEFT,
    TURN_RIGHT;

    fun toState() = when (this) {
        TURN_LEFT -> TURNING_LEFT
        TURN_RIGHT -> TURNING_RIGHT
        MOVE_FORWARD -> MOVING_FORWARD
    }
}
