package org.firstinspires.ftc.teamcode.Mechinisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ClawArm {
    Servo armServo;
    public float currentPos = 0;

    public void init(HardwareMap hardwareMap) {
        armServo = hardwareMap.get(Servo.class, "clawArm");
    }

    public void move(float change) {
        currentPos += change*0.1;
        armServo.setPosition((double)currentPos);
    }
}
