/*
 * Copyright (C) 2017 Marc Magon
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

import com.jwebmp.core.Feature;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * An implementation of the Spectrum Colour Picker tool
 * <p>
 * <p>
 * http://bgrins.github.io/spectrum/#why
 * <p>
 *
 * @author MMagon
 * @version 1.0
 * @since 25 Jun 2013
 */
public class JQSpectrumColourPickerFeature
		extends Feature<JQSpectrumColourPickerOptions, JQSpectrumColourPickerFeature>
{

	private static final long serialVersionUID = 1L;
	private final JQSpectrumColourPicker picker;
	private JQSpectrumColourPickerOptions colourOptions;

	/**
	 * Constructs a new instance of the JW Colour Picker ComponentFeatureBase
	 */
	public JQSpectrumColourPickerFeature(JQSpectrumColourPicker picker)
	{
		super("JWColourPickerFeature");
		this.picker = picker;
		getJavascriptReferences().add(JQSpectrumColourPickerReferencePool.SpectrumColourPicker.getJavaScriptReference());
		getCssReferences().add(JQSpectrumColourPickerReferencePool.SpectrumColourPicker.getCssReference());

	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getPicker() != null ? getPicker().hashCode() : 0);
		result = 31 * result + (colourOptions != null ? colourOptions.hashCode() : 0);
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQSpectrumColourPickerFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQSpectrumColourPickerFeature that = (JQSpectrumColourPickerFeature) o;

		if (getPicker() != null ? !getPicker().equals(that.getPicker()) : that.getPicker() != null)
		{
			return false;
		}
		return colourOptions != null ? colourOptions.equals(that.colourOptions) : that.colourOptions == null;
	}

	/**
	 * Returns the options associated with the Spectrum Colour Picker
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQSpectrumColourPickerOptions getOptions()
	{
		if (colourOptions == null)
		{
			colourOptions = new JQSpectrumColourPickerOptions();
		}
		return colourOptions;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String s = picker.getJQueryID() + "spectrum(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine();
		addQuery(s);
	}

	/**
	 * Returns the JQUIColourPicker associated with this feature
	 * <p>
	 *
	 * @return
	 */
	public JQSpectrumColourPicker getPicker()
	{
		return picker;
	}
}
