package com.jwebmp.plugins.spectrum.colourpicker.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class SpectrumInclusionsModule implements IGuiceScanModuleInclusions<SpectrumInclusionsModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.spectrum.colourpicker");
		return set;
	}
}
