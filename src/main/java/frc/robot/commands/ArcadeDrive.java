package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandStadiaController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.DriveSubsystem;


public class ArcadeDrive extends Command{
        
        private final DriveSubsystem m_driveTrain;
        double speed;
        double turnSpeed;
        CommandXboxController driveControl;

        public ArcadeDrive(DriveSubsystem subsystem, double kSpeed, double kTurnSpeed, CommandXboxController driver) {
            m_driveTrain = subsystem;
            addRequirements(m_driveTrain);
            speed = kSpeed;
            turnSpeed = kTurnSpeed;
            driveControl = driver;
          }
         
        @Override
          public void initialize(){
            //ramping
          }

          // Called when the command is initially scheduled.
          @Override
          public void execute() {
            m_driveTrain.drive(driveControl, speed, turnSpeed);
          }
        
          @Override
          public boolean isFinished() {
            return false;
          }
        }

  