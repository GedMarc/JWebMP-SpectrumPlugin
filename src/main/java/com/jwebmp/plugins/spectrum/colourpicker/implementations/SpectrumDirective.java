package com.jwebmp.plugins.spectrum.colourpicker.implementations;

import com.jwebmp.core.base.angular.directives.*;
import jakarta.validation.constraints.*;

import static com.jwebmp.core.FileTemplates.*;

public class SpectrumDirective extends AngularDirectiveBase<InitialisedDirective>
{
	public SpectrumDirective()
	{
		super("spectrumpicker");
	}
	
	
	@Override
	public boolean enabled()
	{
		return true;
	}
	
	/**
	 * Renders the right click directive from the JavaScript file
	 *
	 * @return
	 */
	@Override
	@NotNull
	public String renderFunction()
	{
		return getFileTemplate(getClass(),"Spectrum", "Spectrum.min.js")
				.toString();
	}
}
