package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Claw extends SubsystemBase {
    ServoEx rightClaw;
    ServoEx leftClaw;

    public Claw(HardwareMap hmap) {
        rightClaw = new SimpleServo(hmap, "rightC", -90, 90);
        leftClaw = new SimpleServo(hmap, "leftC", -90, 90);
    }

    public void grab() {
        rightClaw.setPosition(90);
        leftClaw.setPosition(-90);
    }

    public void release() {
        rightClaw.setPosition(-90);
        leftClaw.setPosition(90);
    }

}
