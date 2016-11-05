package cz.lzaruba.modelx.generator

import com.google.inject.Inject
import cz.lzaruba.modelx.modelX.AbstractElement
import cz.lzaruba.modelx.modelX.Entity
import cz.lzaruba.modelx.modelX.Interface
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider

class ClassNames {
	
	@Inject extension IQualifiedNameProvider qnp
	
	def String getFileName(Interface i) {
		i.qualifiedName.replaceAll("\\.","/") + ".java"
	}
	
	def String getFileName(Entity i) {
		
	}
	
	def String getFileName(Enum<?> e) {
		
	}
	
	def packageName(AbstractElement e) {
		qnp.getFullyQualifiedName(e).skipLast(1);
	}
	
	def qualifiedName(AbstractElement e) {
		qnp.getFullyQualifiedName(e).toString;
	}
	
}