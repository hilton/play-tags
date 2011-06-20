package controllers;

import play.Logger;
import play.data.validation.Error;
import play.data.validation.Required;
import play.mvc.Controller;

public class Tags extends Controller {

	public static void index() {
		final String html = "<h1>title</h1>";
		render(html);
	}

	public static void save(@Required String a, @Required String b, @Required String c) {
		if (validation.hasErrors()) {
			for (Error error : validation.errors()) {
				Logger.info(error.message());
			}
		}
		render("@index");
	}
}