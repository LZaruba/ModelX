package cz.lzaruba.modelx.designer.services;

import java.util.List;
import java.util.stream.Collectors;

import cz.lzaruba.modelx.modelX.DataType;
import cz.lzaruba.modelx.modelX.ElementWithFeatures;
import cz.lzaruba.modelx.modelX.Entity;
import cz.lzaruba.modelx.modelX.Enum;
import cz.lzaruba.modelx.modelX.Feature;
import cz.lzaruba.modelx.modelX.Interface;

public class ElementWithFeaturesService {
	
	public Boolean isAbstract(ElementWithFeatures e) {
		if (!(e instanceof Entity)) {
			return false;
		}
		Entity entity = (Entity) e;
		return entity.isAbstract();
	}
	
	public Boolean isInterface(ElementWithFeatures e) {
		return e instanceof Interface;
	}
	
	public List<Feature> getAttributes(ElementWithFeatures e) {
		List<Feature> result = e.getFeatures().stream()
			.filter(f -> {
				return (f.getType() instanceof DataType) || (f.getType() instanceof Enum); 
			}).collect(Collectors.toList());
		return result;
			
	}

}
