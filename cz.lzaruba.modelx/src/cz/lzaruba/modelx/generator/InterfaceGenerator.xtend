package cz.lzaruba.modelx.generator

import com.google.inject.Inject
import cz.lzaruba.modelx.modelX.Interface
import org.eclipse.xtext.generator.IFileSystemAccess

class InterfaceGenerator {
	
	@Inject extension ClassNames
	@Inject extension GeneratorUtil
	
	def generate(Interface i, IFileSystemAccess fsa) {
		fsa.generateFile(getFileName(i), getContent(i));
	}
	
	
	
	def String getContent(Interface i) {
		'''
		package «i.packageName»;
		
		/**
		«IF i.comment != null»
		* «i.comment»
		«ENDIF»
		* @generated
		*/
		«FOR a : i.annotations»
			«a.value»
		«ENDFOR»
		public interface «i.name» 
		«FOR t : i.supertypes BEFORE 'extends ' SEPARATOR ', ' »
			«t.qualifiedName»
		«ENDFOR»
		{
			
			«generateGettersSettersHeaders(i)»
		}
		'''
	}
	
}