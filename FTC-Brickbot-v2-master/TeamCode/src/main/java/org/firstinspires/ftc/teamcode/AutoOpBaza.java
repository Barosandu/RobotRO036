package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.robot.Arm;
import org.firstinspires.ftc.teamcode.robot.Drive;
import org.firstinspires.ftc.teamcode.robot.Lift;
import org.firstinspires.ftc.teamcode.robot.Robot;
import org.firstinspires.ftc.teamcode.robot.Sample;

/**
 * Created by andu,adi,pila on 2/2/19.
 */
@Autonomous(name="AutoOp Baza", group="Linear Opmode")
public class AutoOpBaza extends AutoOp {
    @Override
    public void runOpMode() {
        super.runOpMode();
        /** Robotul se duce la baza, lasa totemul acolo si apoi merge unde da Domnu'
         *  /!\ Functia "rotateArmAuto" e tot ce inseamna a lasa totemul
         */
        Drive.move(Drive.Direction.BACKWARD, DistanceUnit.CM, 125);
        Arm.rotateArmAuto(Arm.Direction.FORWARD,1500);
        //Drive.rotate(AngleUnit.DEGREES, -45);
        //Drive.move(Drive.Direction.BACKWARD, DistanceUnit.CM, 115);
        //Arm.rotateArmAuto(Arm.Direction.FORWARD, 1500);
        //Drive.move(Drive.Direction.FORWARD, DistanceUnit.CM,50);
        //Arm.rotateArmAuto(Arm.Direction.BACKWARD,1500);

    }

}
