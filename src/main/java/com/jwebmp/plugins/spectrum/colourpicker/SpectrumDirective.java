package com.jwebmp.plugins.spectrum.colourpicker;

import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.annotations.components.*;
import com.jwebmp.core.base.angular.client.annotations.constructors.*;
import com.jwebmp.core.base.angular.client.annotations.references.*;
import com.jwebmp.core.base.angular.client.annotations.structures.*;
import com.jwebmp.core.base.angular.client.services.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;

import java.util.*;

@NgDirective(selector = "[spectrum]")
@NgImportReference(value = "HostListener", reference = "@angular/core")
@NgImportReference(value = "ViewChild", reference = "@angular/core")
@NgImportReference(value = "ElementRef", reference = "@angular/core")
@NgComponentReference(SocketClientService.class)
@NgConstructorParameter("private elementRef: ElementRef")
@NgInput("options")
public class SpectrumDirective implements INgDirective<SpectrumDirective>
{
	public SpectrumDirective()
	{
	}
	
	@Override
	public List<String> globalFields()
	{
		List<String> out = new ArrayList<>();
		out.add("declare var $:any;");
		return out;
	}
	
	@Override
	public List<String> afterViewInit()
	{
		List<String> strings = INgDirective.super.afterViewInit();
		strings.add("//element here make spectrum colour picker");
		return strings;
	}
	
	@Override
	public List<String> onInit()
	{
		List<String> strings = INgDirective.super.onInit();
		strings.add("""
		        let elementId: string = this.elementRef.nativeElement.id;
		            var optObject = $(elementId);
		            optObject.spectrum(this.options);""");
		return strings;
	}
	
	@Override
	public List<String> methods()
	{
		List<String> out = INgDirective.super.methods();
		
		return out;
	}
	
}
