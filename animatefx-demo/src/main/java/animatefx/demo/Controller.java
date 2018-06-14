package animatefx.demo;

import animatefx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class Controller {


    @FXML
    Text text;


    public void initialize() {
    }


    @FXML
    public void HandleClick(ActionEvent actionEvent) {

        Button button = (Button) actionEvent.getSource();
        switch (button.getText()) {
            /*Attention seekers**/
            case "Bounce":
                new Bounce(text);
                break;
            case "Flash":
                new Flash(text);
                break;
            case "Pulse":
                new Pulse(text);
                break;
            case "RubberBand":
                new RubberBand(text);
                break;
            case "Shake":
                new Shake(text);
                break;
            case "Swing":
                new Swing(text);
                break;
            case "Tada":
                new Tada(text);
                break;
            case "Wobble":
                new Wobble(text);
                break;
            case "Jello":
                new Jello(text);
                break;


            /*Bounce Entrances**/
            case "BounceIn":
                new BounceIn(text);
                break;
            case "BounceInDown":
                new BounceInDown(text);
                break;
            case "BounceInLeft":
                new BounceInLeft(text);
                break;
            case "BounceInRight":
                new BounceInRight(text);
                break;
            case "BounceInUp":
                new BounceInUp(text);
                break;


            /*Bouncing exits**/
            case "BounceOut":
                new BounceOut(text);
                break;
            case "BounceOutDown":
                new BounceOutDown(text);
                break;
            case "BounceOutLeft":
                new BounceOutLeft(text);
                break;
            case "BounceOutRight":
                new BounceOutRight(text);
                break;
            case "BounceOutUp":
                new BounceOutUp(text);
                break;


            /*Fading entrances**/
            case "FadeIn":
                new FadeIn(text);
                break;
            case "FadeInDown":
                new FadeInDown(text);
                break;
            case "FadeInDownBig":
                new FadeInDownBig(text);
                break;
            case "FadeInLeft":
                new FadeInLeft(text);
                break;
            case "FadeInLeftBig":
                new FadeInLeftBig(text);
                break;
            case "FadeInRight":
                new FadeInRight(text);
                break;
            case "FadeInRightBig":
                new FadeInRightBig(text);
                break;
            case "FadeInUp":
                new FadeInUp(text);
                break;
            case "FadeInUpBig":
                new FadeInUpBig(text);


                /*Fading exits**/
            case "FadeOut":
                new FadeOut(text);
                break;
            case "FadeOutDown":
                new FadeOutDown(text);
                break;
            case "FadeOutDownBig":
                new FadeOutDownBig(text);
                break;
            case "FadeOutLeft":
                new FadeOutLeft(text);
                break;
            case "FadeOutLeftBig":
                new FadeOutLeftBig(text);
                break;
            case "FadeOutRight":
                new FadeOutRight(text);
                break;
            case "FadeOutRightBig":
                new FadeOutRightBig(text);
                break;
            case "FadeOutUp":
                new FadeOutUp(text);
                break;
            case "FadeOutUpBig":
                new FadeOutUpBig(text);
                break;


            /*Flipeprs**/
            case "Flip":
                new Flip(text);
                break;
            case "FlipInX":
                new FlipInX(text);
                break;
            case "FlipInY":
                new FlipInY(text);
                break;
            case "FlipOutX":
                new FlipOutX(text);
                break;
            case "FlipOutY":
                new FlipOutY(text);
                break;

            /*LightSpeed**/
            case "LightSpeedIn":
                new LightSpeedIn(text);
                break;
            case "LightSpeedOut":
                new LightSpeedOut(text);
                break;


            /*Rotating entrances**/
            case "RotateIn":
                new RotateIn(text);
                break;
            case "RotateInDownLeft":
                new RotateInDownLeft(text);
                break;
            case "RotateInDownRight":
                new RotateInDownRight(text);
                break;
            case "RotateInUpLeft":
                new RotateInUpLeft(text);
                break;
            case "RotateInUpRight":
                new RotateInUpRight(text);
                break;

            /*Rotating exits**/
            case "RotateOut":
                new RotateOut(text);
                break;
            case "RotateOutDownLeft":
                new RotateOutDownLeft(text);
                break;
            case "RotateOutDownRight":
                new RotateOutDownRight(text);
                break;
            case "RotateOutUpLeft":
                new RotateOutUpLeft(text);
                break;
            case "RotateOutUpRight":
                new RotateOutUpRight(text);
                break;


            /*Sliding entrances**/
            case "SlideInUp":
                new SlideInUp(text);
                break;
            case "SlideInDown":
                new SlideInDown(text);
                break;
            case "SlideInLeft":
                new SlideInLeft(text);
                break;
            case "SlideInRight":
                new SlideInRight(text);
                break;

            /*Sliding exits**/
            case "SlideOutUp":
                new SlideOutUp(text);
                break;
            case "SlideOutDown":
                new SlideOutDown(text);
                break;
            case "SlideOutLeft":
                new SlideOutLeft(text);
                break;
            case "SlideOutRight":
                new SlideOutRight(text);
                break;

            /*Zoom entrances**/
            case "ZoomIn":
                new ZoomIn(text);
                break;
            case "ZoomInDown":
                new ZoomInDown(text);
                break;
            case "ZoomInLeft":
                new ZoomInLeft(text);
                break;
            case "ZoomInRight":
                new ZoomInRight(text);
                break;
            case "ZoomInUp":
                new ZoomInUp(text);
                break;

            /*Zoom exits**/
            case "ZoomOut":
                new ZoomOut(text);
                break;
            case "ZoomOutDown":
                new ZoomOutDown(text);
                break;
            case "ZoomOutLeft":
                new ZoomOutLeft(text);
                break;
            case "ZoomOutRight":
                new ZoomOutRight(text);
                break;
            case "ZoomOutUp":
                new ZoomOutUp(text);
                break;

            /*Specials*/
            case "Hinge":
                new Hinge(text);
                break;
            case "JackInTheBox":
                new JackInTheBox(text);
                break;
            case "RollIn":
                new RollIn(text);
                break;
            case "RollOut":
                new RollOut(text);
                break;

            default:
                break;

        }


    }


}
