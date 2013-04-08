package conf;

import ninja.Router;
import ninja.application.ApplicationRoutes;
import controllers.ApplicationController;
import controllers.I18nController;

public class Routes implements ApplicationRoutes {
	@Override
	public void init(Router router) {
		router.GET().route("/").with(ApplicationController.class, "index");
		router.GET().route("/i18n").with(I18nController.class, "index");
		router.GET().route("/i18n/{language}")
				.with(I18nController.class, "indexWithLanguage");
	}
}
