/**
 * @author Mehmet
 *
 * 6 Eki 2018
 *
 * 22:38:37
 */

package tr.com.sbf;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	private static final int MAX_UPLOAD_SIZE = 10000;

	// private static Class<SbfApplication> applicationClass = SbfApplication.class;

	private final String TMP_FOLDER = "/tmp";

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SbfApplication.class);
	}

	// @Override
	// public void onStartup(ServletContext servletContext) throws ServletException
	// {
	// final ServletRegistration.Dynamic appServlet =
	// servletContext.addServlet("mvc",
	// new DispatcherServlet(new GenericWebApplicationContext()));
	//
	// appServlet.setLoadOnStartup(1);
	//
	// final MultipartConfigElement multipartConfigElement = new
	// MultipartConfigElement(this.TMP_FOLDER,
	// this.MAX_UPLOAD_SIZE, this.MAX_UPLOAD_SIZE * 2, this.MAX_UPLOAD_SIZE / 2);
	//
	// appServlet.setMultipartConfig(multipartConfigElement);
	// }

}
