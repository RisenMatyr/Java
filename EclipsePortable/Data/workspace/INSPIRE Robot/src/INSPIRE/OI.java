package org.usfirst.frc.team5709.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
    Joystick Driver = new Joystick(0);
    
    public OI(){
    	
    }
    
    public Joystick getJoystick(){
		return Driver;
	}
}

