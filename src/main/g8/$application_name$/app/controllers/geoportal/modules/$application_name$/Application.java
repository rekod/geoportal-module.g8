package controllers.geoportal.modules.$application_name$;

import controllers.Abstract;


import org.codehaus.jackson.node.ObjectNode;
import play.*;
import play.db.DB;
import play.libs.Json;
import play.mvc.*;

import utils.StringUtils;
import views.html.geoportal.modules.$application_name$.*;


public class Application extends Abstract {
	public static Result index() {
		return ok(index.render("GeoPortal"));
	}
}
