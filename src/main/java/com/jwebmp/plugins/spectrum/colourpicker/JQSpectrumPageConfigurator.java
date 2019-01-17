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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "Spectrum Colour Picker",
		pluginUniqueName = "spectrum",
		pluginDescription = "I wanted a colorpicker that didn't require images, and that had an API that made sense to me as a developer who has worked with color in a number of applications. I had tried a number of existing plugins, but decided to try and make a smaller, simpler one.",
		pluginVersion = "1.8.0",
		pluginDependancyUniqueIDs = "jquery,jquery-ui",
		pluginCategories = "ui, web, colour picker, spectrum, drop down",
		pluginSubtitle = "A straight forward and simple colour picker with a wide range of options and tools ",
		pluginGitUrl = "http://github.com/bgrins/spectrum",
		pluginSourceUrl = "https://github.com/GedMarc/JWebMP-SpectrumPlugin",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-SpectrumPlugin/wiki",
		pluginOriginalHomepage = "https://bgrins.github.io/spectrum/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/SpectrumPlugin.jar/download",
		pluginIconUrl = "bower_components/spectrum/icon.png",
		pluginIconImageUrl = "bower_components/spectrum/example.png",
		pluginLastUpdatedDate = "2017/03/04")
public class JQSpectrumPageConfigurator
		implements IPageConfigurator<JQSpectrumPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return JQSpectrumPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQSpectrumPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQSpectrumPageConfigurator.enabled;
	}

}
