package com.jwebmp.plugins.spectrum.colourpicker.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class SpectrumExclusionsModule
		implements IGuiceScanModuleExclusions<SpectrumExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.spectrum.colourpicker");
		return strings;
	}
}
