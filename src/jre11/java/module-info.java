module com.jwebmp.plugins.spectrum.colourpicker {

	exports com.jwebmp.plugins.spectrum.colourpicker;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.spectrum.colourpicker.JQSpectrumPageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.spectrum.colourpicker.implementations.SpectrumExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.spectrum.colourpicker.implementations.SpectrumExclusionsModule;

	opens com.jwebmp.plugins.spectrum.colourpicker to com.fasterxml.jackson.databind, com.jwebmp.core;
}
