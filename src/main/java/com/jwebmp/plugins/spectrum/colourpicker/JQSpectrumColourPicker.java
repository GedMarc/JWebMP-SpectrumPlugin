/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.spectrum.colourpicker;

import com.jwebmp.core.base.html.inputs.*;
import com.jwebmp.core.plugins.*;

/**
 * The Spectrum Colour Picker Implementation
 * <p>
 * http://bgrins.github.com/spectrum
 * <p>
 *
 * @author GedMarc
 * @since 01 May 2015
 */
@ComponentInformation(name = "Spectrum Colour Picker",
                      description = "A full featured colour picker",
                      url = "https://bgrins.github.io/spectrum/")
public class JQSpectrumColourPicker<J extends JQSpectrumColourPicker<J>>
		extends InputTextType<J>
{
	/**
	 * The actual feature
	 */
	private final JQSpectrumColourPickerFeature feature;
	
	/**
	 * Constructs a new colour picker
	 */
	public JQSpectrumColourPicker()
	{
		feature = new JQSpectrumColourPickerFeature(this);
		addAttribute("spectrum", "");
		setInvertColonRender(true);
	}
	
	/**
	 * Returns any client side options available with this component
	 *
	 * @return Returns null currently
	 * @see com.jwebmp.core.base.interfaces.IComponentFeatureBase#getOptions()
	 */
	@Override
	public JQSpectrumColourPickerOptions getOptions()
	{
		return feature.getOptions();
	}
	
	@Override
	public void init()
	{
		if (isInitialized())
		{
			return;
		}
		addAttribute("options", getOptions().toString(true));
		super.init();
	}
	
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
