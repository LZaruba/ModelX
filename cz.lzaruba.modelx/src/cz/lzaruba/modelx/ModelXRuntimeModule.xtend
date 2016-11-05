/*
 * generated by Xtext 2.10.0
 */
package cz.lzaruba.modelx

import com.google.inject.Binder
import com.google.inject.name.Names
import cz.lzaruba.modelx.generator.ModelXGenerator
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ModelXRuntimeModule extends AbstractModelXRuntimeModule {

	override configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider).annotatedWith(
			Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
		).to(ImportedNamespaceAwareLocalScopeProvider);
	}
	
	override bindIGenerator() {
		ModelXGenerator
	}

}
