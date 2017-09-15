package controllers;

import controllers.annotation.AnonymousCheck;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.devfarm.*;

@AnonymousCheck
public class DfUsageApp extends Controller {

    public static Result usageList() {
        return ok(members.render(DevFarm.ORGANIZATION_NAME));
    }
}
