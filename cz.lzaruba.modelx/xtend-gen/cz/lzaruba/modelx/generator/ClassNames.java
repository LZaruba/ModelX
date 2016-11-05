package cz.lzaruba.modelx.generator;

import com.google.inject.Inject;
import cz.lzaruba.modelx.modelX.AbstractElement;
import cz.lzaruba.modelx.modelX.Entity;
import cz.lzaruba.modelx.modelX.Interface;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ClassNames {
  @Inject
  @Extension
  private IQualifiedNameProvider qnp;
  
  public String getFileName(final Interface i) {
    String _qualifiedName = this.qualifiedName(i);
    String _replaceAll = _qualifiedName.replaceAll("\\.", "/");
    return (_replaceAll + ".java");
  }
  
  public String getFileName(final Entity i) {
    return null;
  }
  
  public String getFileName(final Enum<?> e) {
    return null;
  }
  
  public QualifiedName packageName(final AbstractElement e) {
    QualifiedName _fullyQualifiedName = this.qnp.getFullyQualifiedName(e);
    return _fullyQualifiedName.skipLast(1);
  }
  
  public String qualifiedName(final AbstractElement e) {
    QualifiedName _fullyQualifiedName = this.qnp.getFullyQualifiedName(e);
    return _fullyQualifiedName.toString();
  }
}
