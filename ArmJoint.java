package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArmJoint extends SubsystemBase {
    DcMotorEx joint;

    public ArmJoint(HardwareMap hmap) {
        joint = hmap.get(DcMotorEx.class, "joint");
    }

    public void moveUp() {
        joint.setPower(1);
    }

    public void moveDown() {
        joint.setPower(-1);
    }

    public void stop() {
        joint.setPower(0);
    }

    public double getPos() {
        return joint.getCurrentPosition();
    }


}
