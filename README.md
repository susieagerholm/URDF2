# URDF

TODO

Bindings:  

UIModule - Formatting on save  
https://www.eclipse.org/forums/index.php/t/282129/  
  
RuntimeModule - bind IDerivedStateComputer for Topology and Decoration  
https://www.eclipse.org/forums/index.php?t=rview&goto=1760288#msg_1760288  
disable warning by overriding LinkingDiagnosticMessageProvider#getUnresolvedProxyMessage  
customize IQualifiedNameProvider to get the name from the object's node (see 'NodeModelUtils')   

public class MyDslRuntimeModule extends org.xtext.example.mydsl.AbstractMyDslRuntimeModule {

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return MyDslNameProvider.class;
	}
	
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return MyDslResourceDescriptionStrategy.class;
	}
	
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
		.annotatedWith(com.google.inject.name.Names.named(
				org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
				.to(MyDslImportedNamespaceAwareLocalScopeProvider.class);
	}
	
}

public class MyDslNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	public QualifiedName qualifiedName(DeclaredAttribute attr) {
		return QualifiedName.create(attr.getName());
	}
	
}
  
Scope:
CustomScopeProvider - DotExpressions for Reuse  
https://christiandietrich.wordpress.com/2013/05/18/xtext-and-dot-expressions/  
https://www.eclipse.org/forums/index.php/m/1763845/#msg_1763845

Validations:  
Decoration - only one decorator pr link/joint  
Reuse - only reuse joint of same type?   
  
Update editor from AST?  
http://koehnlein.blogspot.dk/2010/06/semantic-model-access-in-xtext.html


