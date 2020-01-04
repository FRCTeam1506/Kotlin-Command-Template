// Reset Robotics 2019
package frc.robot

// Libraries
import org.sertain.*
// Subsystems
import frc.robot.subsystems.Drivetrain
import frc.robot.subsystems.Elevator

// Miscellaneous Imports
//import frc.robot.commands.Drive.ResetGyro
//import frc.robot.commands.Forklift.ResetForkliftSensor
//import frc.robot.commands.Drive.InertialGuidance

class RobotName : Robot() {
    fun main(args: String) {}

    // Miscellaneous objects/variables

    // Initialize subsystem instance objects for this script
    val drivetrain: Drivetrain = Drivetrain
    var elevator: Elevator = Elevator

    // OI Initialization
    var oi: OI = OI()

    // Runs on robot initialization; WPILib robotInit() equivalent
    override fun onCreate() {
        drivetrain.onCreate()
        elevator.onCreate()

        // put any data to dashboard here
    }

    // Runs periodically when the robot is disabled; WPILib disabledPeriodic() equivalent
    override fun executeDisabled() {
        drivetrain.unlockAngle()
        elevator.ResetEncoders()

        // any dashboard data population here too
    }

    // Runs on autonomous(sandstorm) initialization; WPILib autonomousInit() equivalent
    override fun onAutoStart() {
        drivetrain.onCreate()
        elevator.onCreate()
    }

    // Runs periodically during autonomous(sandstorm); WPILib autonomousPeriodic() equivalent
    override fun executeAuto() {
        // put any dashboard data
    }

    // Runs on teleop initialization; WPILib teleopInit() equivalent
    override fun onStart() {
        drivetrain.onCreate()
        elevator.onCreate()
        elevator.ResetEncoders()
    }

    // Runs periodically during teleop; WPILib teleopPeriodic() equivalent
    override fun executeTeleop() {
        oi.OI()

        // put dashboard data here
    }
}