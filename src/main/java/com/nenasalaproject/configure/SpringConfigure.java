package com.nenasalaproject.configure;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.accept.PathExtensionContentNegotiationStrategy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
import org.springframework.web.servlet.view.tiles2.TilesView;

import com.nenasalaproject.converter.CivilStatusConverter;
import com.nenasalaproject.converter.DateConverter;
import com.nenasalaproject.converter.GenderConverter;;

@Configuration	// Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime
@EnableWebMvc		// to imports the Spring MVC configuration from WebMvcConfigurationSupport
@ComponentScan("com.nenasalaproject.configure")	// specify to define specific packages to scan. If specific packages are not defined, scanning will occur from the package of the class that declares this annotation.
@Import({SecurityConfig.class})
public class SpringConfigure extends WebMvcConfigurerAdapter {

	@Bean
	public UrlBasedViewResolver setViewResolver(){
		
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
//		resolver.setPrefix("/WEB-INF/");	// Starting folder path
//		resolver.setSuffix(".jsp");		// End of the file name (Extension)
		resolver.setOrder(1);
		resolver.setViewClass(TilesView.class);		// View Class
		return resolver;
	}
	
	
	@Bean
	public TilesConfigurer tilesConfigurer() {

		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer
				.setDefinitions(new String[] { "WEB-INF/tile-defs/templates.xml", "WEB-INF/tile-defs/definitions.xml", "WEB-INF/tile-defs/testdefinitions.xml" });
		return tilesConfigurer;
	}

	@Bean
	public ContentNegotiatingViewResolver getContentNegotiatingViewResolve() {
		ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
		resolver.setOrder(org.springframework.core.Ordered.HIGHEST_PRECEDENCE);
		// resolver.setFavorPathExtension(true);
		resolver.setContentNegotiationManager(getContentNegotiationManager());
		return resolver;
	}

	private ContentNegotiationManager getContentNegotiationManager() {
		ContentNegotiationManager manager = new ContentNegotiationManager(getPathExtensionContentNegotiationStrategy());
		return manager;
	}

	private PathExtensionContentNegotiationStrategy getPathExtensionContentNegotiationStrategy() {
		Map<String, MediaType> mediaTypes = new HashMap<String, MediaType>();
		mediaTypes.put("html", MediaType.TEXT_HTML);
		mediaTypes.put("xml", MediaType.APPLICATION_XML);
		mediaTypes.put("json", MediaType.APPLICATION_JSON);
		mediaTypes.put("atom", MediaType.APPLICATION_XML);
		// mediaTypes.put("atom", MediaType.);

		PathExtensionContentNegotiationStrategy strategy = new PathExtensionContentNegotiationStrategy(mediaTypes);

		return strategy;
	}

	@Bean
	public MatrixVariableMethodArgumentResolver setupMatrixVariableMethodArgumentResolver() {
		MatrixVariableMethodArgumentResolver argumentResolver = new MatrixVariableMethodArgumentResolver();

		return argumentResolver;
	}
	
	@Autowired
	@Qualifier(value="civilstatus")
	private CivilStatusConverter civilStatusConverter;
	
	@Bean(name="civilstatus")
	public CivilStatusConverter getCivilStatusConverter(){
		return new CivilStatusConverter();
	}
	
	
	@Autowired
	@Qualifier(value = "gender")
	private GenderConverter genderConverter;

	@Bean(name = "gender")
	public GenderConverter getGenderConverter() {
		return new GenderConverter();
	}
	
	@Autowired
	@Qualifier(value = "date")
	private DateConverter dateConverter;

	@Bean(name = "date")
	public DateConverter getDateConverter() {
		return new DateConverter();
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
		registry.addConverter(genderConverter);
		registry.addConverter(civilStatusConverter);
		registry.addConverter(dateConverter);
	}
	
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");	// This is used in jsp files to link css, js files.

	}
	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/login").setViewName("login");
//		registry.setOrder(1);
//		super.addViewControllers(registry);
//	}
	
//	 @Override
//	    public void addViewControllers(ViewControllerRegistry registry) {
//	        registry.addViewController("/login").setViewName("login");
//	        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//	    }
	
}
