package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.DriverConstants;

public class DriveSubsystem extends SubsystemBase {
    WPI_TalonSRX r1;
    WPI_TalonSRX r2;
    WPI_TalonSRX l1;
    WPI_TalonSRX l2;

    DifferentialDrive dT;

    public DriveSubsystem() {
        r1 = new WPI_TalonSRX(DriverConstants.right1);
        l1 = new WPI_TalonSRX(DriverConstants.left1);
        r2 = new WPI_TalonSRX(DriverConstants.right2);
        l2 = new WPI_TalonSRX(DriverConstants.left2);

        l1.follow(l2);
        r1.follow(r2);

        dT = new DifferentialDrive(r1, l1);
    }

    public void periodic () {}


    public void drive(CommandXboxController driveController, double kSpeed, double kTurnSpeed) {
        dT.arcadeDrive(driveController.getRawAxis(XboxController.Axis.kRightX.value) * kTurnSpeed, -driveController.getRawAxis(XboxController.Axis.kLeftY.value) * kSpeed);
    }
}

