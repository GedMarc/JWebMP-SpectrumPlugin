module com.jwebmp.plugins.spectrum.colourpicker {

	exports com.jwebmp.plugins.spectrum.colourpicker;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.spectrum.colourpicker.JQSpectrumPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.spectrum.colourpicker.implementations.SpectrumExclusionsModule;

	opens com.jwebmp.plugins.spectrum.colourpicker to com.fasterxml.jackson.databind, com.jwebmp.core;
}
