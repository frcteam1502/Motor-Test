// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motorthing extends SubsystemBase {
  private final CANSparkMax Kitten;
  /** Creates a new Motorthing. */
  public Motorthing(CANSparkMax Kitten) {
    this.Kitten = Kitten;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void MotorTest(){
    Kitten.set(0.2);

  }
}
