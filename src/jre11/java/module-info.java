import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.angular.services.*;
import com.jwebmp.plugins.spectrum.colourpicker.*;
import com.jwebmp.plugins.spectrum.colourpicker.implementations.SpectrumInclusionsModule;

module com.jwebmp.plugins.spectrum.colourpicker {

	exports com.jwebmp.plugins.spectrum.colourpicker;

	requires com.jwebmp.core;
	
	requires com.jwebmp.core.angular;
	
	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.spectrum.colourpicker.JQSpectrumPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with SpectrumInclusionsModule;
	provides INgDirective with SpectrumDirective;
	
	opens com.jwebmp.plugins.spectrum.colourpicker to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.spectrum.colourpicker.implementations to com.fasterxml.jackson.databind, com.jwebmp.core,com.google.guice;
}
