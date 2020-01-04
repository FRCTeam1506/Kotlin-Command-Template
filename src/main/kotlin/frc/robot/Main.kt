// Reset Robotics 2019
package frc.robot

// Libraries
import edu.wpi.first.wpilibj.RobotBase

/**
  * Main initialization function. Do not perform any initialization here.
  *
  * <p>If you change your main robot class, change the parameter type.
  */
class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) { RobotBase.startRobot(::RobotName) }
    }
}