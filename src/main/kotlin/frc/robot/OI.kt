// Reset Robotics 2019
package frc.robot

// Libraries
// Subsystems
// Miscellaneous Imports
import edu.wpi.first.wpilibj.GenericHID
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.XboxController
import frc.robot.data.OIData

class OI {
    val oiData: OIData = OIData()

    // Joysticks/Controllers
    val joystickLeft by lazy { Joystick((oiData.leftUSBID.id)) }
	val joystickRight by lazy { Joystick((oiData.rightUSBID.id)) }
    val xboxController by lazy { XboxController((oiData.xboxUSBID.id)) }
	val xboxJoystickLeft by lazy { Joystick((oiData.xboxLeftJoystickYAxis.id)) }
    val xboxJoystickRight by lazy { Joystick((oiData.xboxRightJoystickYAxis.id)) }

    // Setting default trigger variable values
    var leftTrigger: Double = 0.0
    var rightTrigger: Double = 0.0
    var kLeft: Int = 0
    var kRight: Int = 1

   fun OI() {
        //Driver 1
        //joystickLeft.whenActive(3, ToggleAngleLock())//Toggles angle lock for linging up --- Top-Button-Bottom-Left
        //joystickRight.toggleOnButtonPress(oiData.rightTrigger.id, ToggleFieldOriented()) // Toggle whether the drivetrain is field oriented or normal
        //joystickLeft.toggleOnButtonPress(oiData.leftTrigger.id, Deploy()) // Toggle whether the drivetrain is field oriented or normal

        //Driver 2
        //Ball intake Controls
        leftTrigger = xboxController.getTriggerAxis(GenericHID.Hand.kLeft) // 2
        rightTrigger = xboxController.getTriggerAxis(GenericHID.Hand.kRight) // 3
   }
}