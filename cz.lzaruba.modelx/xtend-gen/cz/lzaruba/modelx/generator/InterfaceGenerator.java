package cz.lzaruba.modelx.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import cz.lzaruba.modelx.generator.ClassNames;
import cz.lzaruba.modelx.generator.GeneratorUtil;
import cz.lzaruba.modelx.modelX.Interface;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class InterfaceGenerator {
  @Inject
  @Extension
  private ClassNames _classNames;
  
  @Inject
  @Extension
  private GeneratorUtil _generatorUtil;
  
  public void generate(final Interface i, final IFileSystemAccess fsa) {
    String _fileName = this._classNames.getFileName(i);
    String _content = this.getContent(i);
    fsa.generateFile(_fileName, _content);
  }
  
  public String getContent(final Interface i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    QualifiedName _packageName = this._classNames.packageName(i);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    {
      EList<String> _comment = i.getComment();
      boolean _notEquals = (!Objects.equal(_comment, null));
      if (_notEquals) {
        _builder.append("* ");
        EList<String> _comment_1 = i.getComment();
        _builder.append(_comment_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    {
      EList<XAnnotation> _annotations = i.getAnnotations();
      for(final XAnnotation a : _annotations) {
        XExpression _value = a.getValue();
        _builder.append(_value, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("public interface ");
    String _name = i.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    {
      EList<Interface> _supertypes = i.getSupertypes();
      boolean _hasElements = false;
      for(final Interface t : _supertypes) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("extends ", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _qualifiedName = this._classNames.qualifiedName(t);
        _builder.append(_qualifiedName, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateGettersSettersHeaders = this._generatorUtil.generateGettersSettersHeaders(i);
    _builder.append(_generateGettersSettersHeaders, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
