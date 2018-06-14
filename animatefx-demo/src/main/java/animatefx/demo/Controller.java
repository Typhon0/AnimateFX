package animatefx.demo;

import animatefx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class Controller {


    @FXML
    Text text;



    @FXML
    public void HandleClick(ActionEvent actionEvent) {

        Button button = (Button) actionEvent.getSource();
        String s = button.getText();/*Attention seekers**/
        if ("Bounce".equals(s)) {
            new Bounce(text).play();

        } else if ("Flash".equals(s)) {
            new Flash(text).play();

        } else if ("Pulse".equals(s)) {
            new Pulse(text).play();

        } else if ("RubberBand".equals(s)) {
            new RubberBand(text).play();

        } else if ("Shake".equals(s)) {
            new Shake(text).play();

        } else if ("Swing".equals(s)) {
            new Swing(text).play();

        } else if ("Tada".equals(s)) {
            new Tada(text).play();

        } else if ("Wobble".equals(s)) {
            new Wobble(text).play();

        } else if ("Jello".equals(s)) {
            new Jello(text).play();



            /*Bounce Entrances**/
        } else if ("BounceIn".equals(s)) {
            new BounceIn(text).play();

        } else if ("BounceInDown".equals(s)) {
            new BounceInDown(text).play();

        } else if ("BounceInLeft".equals(s)) {
            new BounceInLeft(text).play();

        } else if ("BounceInRight".equals(s)) {
            new BounceInRight(text).play();

        } else if ("BounceInUp".equals(s)) {
            new BounceInUp(text).play();



            /*Bouncing exits**/
        } else if ("BounceOut".equals(s)) {
            new BounceOut(text).play();

        } else if ("BounceOutDown".equals(s)) {
            new BounceOutDown(text).play();

        } else if ("BounceOutLeft".equals(s)) {
            new BounceOutLeft(text).play();

        } else if ("BounceOutRight".equals(s)) {
            new BounceOutRight(text).play();

        } else if ("BounceOutUp".equals(s)) {
            new BounceOutUp(text).play();



            /*Fading entrances**/
        } else if ("FadeIn".equals(s)) {
            new FadeIn(text).play();

        } else if ("FadeInDown".equals(s)) {
            new FadeInDown(text).play();

        } else if ("FadeInDownBig".equals(s)) {
            new FadeInDownBig(text).play();

        } else if ("FadeInLeft".equals(s)) {
            new FadeInLeft(text).play();

        } else if ("FadeInLeftBig".equals(s)) {
            new FadeInLeftBig(text).play();

        } else if ("FadeInRight".equals(s)) {
            new FadeInRight(text).play();

        } else if ("FadeInRightBig".equals(s)) {
            new FadeInRightBig(text).play();

        } else if ("FadeInUp".equals(s)) {
            new FadeInUp(text).play();

        } else if ("FadeInUpBig".equals(s)) {
            new FadeInUpBig(text).play();


            /*Fading exits**/
        } else if ("FadeOut".equals(s)) {
            new FadeOut(text).play();

        } else if ("FadeOutDown".equals(s)) {
            new FadeOutDown(text).play();

        } else if ("FadeOutDownBig".equals(s)) {
            new FadeOutDownBig(text).play();

        } else if ("FadeOutLeft".equals(s)) {
            new FadeOutLeft(text).play();

        } else if ("FadeOutLeftBig".equals(s)) {
            new FadeOutLeftBig(text).play();

        } else if ("FadeOutRight".equals(s)) {
            new FadeOutRight(text).play();

        } else if ("FadeOutRightBig".equals(s)) {
            new FadeOutRightBig(text).play();

        } else if ("FadeOutUp".equals(s)) {
            new FadeOutUp(text).play();

        } else if ("FadeOutUpBig".equals(s)) {
            new FadeOutUpBig(text).play();



            /*Flipeprs**/
        } else if ("Flip".equals(s)) {
            new Flip(text).play();

        } else if ("FlipInX".equals(s)) {
            new FlipInX(text).play();

        } else if ("FlipInY".equals(s)) {
            new FlipInY(text).play();

        } else if ("FlipOutX".equals(s)) {
            new FlipOutX(text).play();

        } else if ("FlipOutY".equals(s)) {
            new FlipOutY(text).play();


            /*LightSpeed**/
        } else if ("LightSpeedIn".equals(s)) {
            new LightSpeedIn(text).play();

        } else if ("LightSpeedOut".equals(s)) {
            new LightSpeedOut(text).play();



            /*Rotating entrances**/
        } else if ("RotateIn".equals(s)) {
            new RotateIn(text).play();

        } else if ("RotateInDownLeft".equals(s)) {
            new RotateInDownLeft(text).play();

        } else if ("RotateInDownRight".equals(s)) {
            new RotateInDownRight(text).play();

        } else if ("RotateInUpLeft".equals(s)) {
            new RotateInUpLeft(text).play();

        } else if ("RotateInUpRight".equals(s)) {
            new RotateInUpRight(text).play();


            /*Rotating exits**/
        } else if ("RotateOut".equals(s)) {
            new RotateOut(text).play();

        } else if ("RotateOutDownLeft".equals(s)) {
            new RotateOutDownLeft(text).play();

        } else if ("RotateOutDownRight".equals(s)) {
            new RotateOutDownRight(text).play();

        } else if ("RotateOutUpLeft".equals(s)) {
            new RotateOutUpLeft(text).play();

        } else if ("RotateOutUpRight".equals(s)) {
            new RotateOutUpRight(text).play();



            /*Sliding entrances**/
        } else if ("SlideInUp".equals(s)) {
            new SlideInUp(text).play();

        } else if ("SlideInDown".equals(s)) {
            new SlideInDown(text).play();

        } else if ("SlideInLeft".equals(s)) {
            new SlideInLeft(text).play();

        } else if ("SlideInRight".equals(s)) {
            new SlideInRight(text).play();


            /*Sliding exits**/
        } else if ("SlideOutUp".equals(s)) {
            new SlideOutUp(text).play();

        } else if ("SlideOutDown".equals(s)) {
            new SlideOutDown(text).play();

        } else if ("SlideOutLeft".equals(s)) {
            new SlideOutLeft(text).play();

        } else if ("SlideOutRight".equals(s)) {
            new SlideOutRight(text).play();


            /*Zoom entrances**/
        } else if ("ZoomIn".equals(s)) {
            new ZoomIn(text).play();

        } else if ("ZoomInDown".equals(s)) {
            new ZoomInDown(text).play();

        } else if ("ZoomInLeft".equals(s)) {
            new ZoomInLeft(text).play();

        } else if ("ZoomInRight".equals(s)) {
            new ZoomInRight(text).play();

        } else if ("ZoomInUp".equals(s)) {
            new ZoomInUp(text).play();


            /*Zoom exits**/
        } else if ("ZoomOut".equals(s)) {
            new ZoomOut(text).play();

        } else if ("ZoomOutDown".equals(s)) {
            new ZoomOutDown(text).play();

        } else if ("ZoomOutLeft".equals(s)) {
            new ZoomOutLeft(text).play();

        } else if ("ZoomOutRight".equals(s)) {
            new ZoomOutRight(text).play();

        } else if ("ZoomOutUp".equals(s)) {
            new ZoomOutUp(text).play();


            /*Specials*/
        } else if ("Hinge".equals(s)) {
            new Hinge(text).play();

        } else if ("JackInTheBox".equals(s)) {
            new JackInTheBox(text).play();

        } else if ("RollIn".equals(s)) {
            new RollIn(text).play();

        } else if ("RollOut".equals(s)) {
            new RollOut(text).play();

        } else {
        }
    }

}
