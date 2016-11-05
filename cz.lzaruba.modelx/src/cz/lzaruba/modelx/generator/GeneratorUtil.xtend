package cz.lzaruba.modelx.generator

import cz.lzaruba.modelx.modelX.ElementWithFeatures
import com.google.inject.Inject

class GeneratorUtil {
	
	@Inject extension ClassNames
	
	def generateFeatures(ElementWithFeatures e) {
		'''
		«FOR f : e.features»
			private «f.type.qualifiedName» «f.name»;
		«ENDFOR»
		'''
	}
	
	def generateGettersSettersHeaders(ElementWithFeatures e) {
		'''
		«FOR f : e.features»
			/**
			 * @return the value of '<em><b>«f.name»</b></em>' feature
			 * @generated
			 */
			public «f.type.qualifiedName» get«f.name.toFirstUpper»();
			
			/**
			 * @param «f.name»
			 *     the new value of the '{@link «e.name»#get«f.name.toFirstUpper»() <em>«f.name»</em>}' feature.
			 * @generated
			 */
			public void set«f.name.toFirstUpper»(«f.type.qualifiedName» «f.name»);
		«ENDFOR»
		'''
	}
	
}