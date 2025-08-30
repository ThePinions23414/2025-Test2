package org.firstinspires.ftc.team23414;


import com.qualcomm.robotcore.hardware.DcMotor;

class DriveTraintg {
    private DcMotor leftFrontDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor leftBackDrive = null;
    private DcMotor rightBackDrive = null;

    DriveTraintg(DcMotor leftFront, DcMotor rightFront, DcMotor leftBack, DcMotor rightBack) {
        leftFrontDrive  = leftFront;
        rightFrontDrive = rightFront;
        leftBackDrive  = leftBack;
        rightBackDrive = rightBack;
    }
    public void moveDrive(double left, double right) {
        leftFrontDrive.setPower(left);
        rightFrontDrive.setPower(right);
        leftBackDrive.setPower(left);
        rightBackDrive.setPower(right);
    }
}
