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

import com.fasterxml.jackson.annotation.*;

/**
 * @author GedMarc
 * @since 02 May 2015
 */
public enum JQSpectrumaletteFormats
{
	
	Hex,
	Hex3,
	HSL,
	RGB,
	Name;
	
	public static JQSpectrumaletteFormats from(String value)
	{
		for (JQSpectrumaletteFormats jqSpectrumaletteFormats : values())
		{
			if (jqSpectrumaletteFormats.toString()
			                           .equalsIgnoreCase(value))
			{
				return jqSpectrumaletteFormats;
			}
		}
		return Hex;
	}
	
	@Override
	@JsonValue
	public String toString()
	{
		return super.toString()
		            .toLowerCase();
	}
}
