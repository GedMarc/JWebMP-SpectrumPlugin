import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.spectrum.colourpicker.JQSpectrumPageConfigurator;

module com.jwebmp.plugins.spectrum.colourpicker {

	exports com.jwebmp.plugins.spectrum.colourpicker;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with JQSpectrumPageConfigurator;

}
