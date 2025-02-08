// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.commands.ArcadeDrive;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
 
  
  CommandXboxController driver = new CommandXboxController(0);
  

  //subsystems
  private final DriveSubsystem m_driveTrain = new DriveSubsystem();
  

  //commands
  //drive commands
  private final ArcadeDrive m_arcadeDefault = new ArcadeDrive(m_driveTrain, 0.8, 0.6, driver);


  public RobotContainer() {
    m_driveTrain.setDefaultCommand(m_arcadeDefault);

    
    configureButtonBindings();
    
  }


  private void configureButtonBindings() {
  }

  public Command getAutonomousCommand() {
    return null;
  }
}