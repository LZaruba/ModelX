package cz.lzaruba.modelx.designer.services;

import cz.lzaruba.modelx.modelX.AbstractElement;
import cz.lzaruba.modelx.modelX.DataType;
import cz.lzaruba.modelx.modelX.ElementWithFeatures;
import cz.lzaruba.modelx.modelX.Enum;
import cz.lzaruba.modelx.modelX.Feature;

public class FeatureService {
	
	public String getLabel(Feature f) {
		return f.getName() + " : " + getLabel(f.getType());
	}
	
	public String getLabel(AbstractElement element) {
		if (element instanceof ElementWithFeatures) {
			ElementWithFeatures ef = (ElementWithFeatures) element;
			return ef.getName();
		}
		if (element instanceof Enum) {
			Enum en = (Enum) element;
			return en.getName();
		}
		if (element instanceof DataType) {
			DataType dt = (DataType) element;
			return dt.getType().getSimpleName();
		}
		return "" + element;
	}

}
