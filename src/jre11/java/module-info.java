import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.spectrum.colourpicker.JQSpectrumPageConfigurator;
import com.jwebmp.plugins.spectrum.colourpicker.implementations.SpectrumExclusionsModule;

module com.jwebmp.plugins.spectrum.colourpicker {

	exports com.jwebmp.plugins.spectrum.colourpicker;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with JQSpectrumPageConfigurator;
	provides IGuiceScanJarExclusions with SpectrumExclusionsModule;
	provides IGuiceScanModuleExclusions with SpectrumExclusionsModule;

	opens com.jwebmp.plugins.spectrum.colourpicker to com.fasterxml.jackson.databind, com.jwebmp.core;
}
