package controllers;

import cn.bran.play.JapidController;
import play.mvc.Result;

public class Application extends JapidController {

    public static Result index() {
        return renderJapidWith("@helloworld.html","Hello Earth!");
    }
}
