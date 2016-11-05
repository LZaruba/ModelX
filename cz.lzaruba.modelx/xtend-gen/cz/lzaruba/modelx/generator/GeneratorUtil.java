package cz.lzaruba.modelx.generator;

import com.google.inject.Inject;
import cz.lzaruba.modelx.generator.ClassNames;
import cz.lzaruba.modelx.modelX.AbstractElement;
import cz.lzaruba.modelx.modelX.ElementWithFeatures;
import cz.lzaruba.modelx.modelX.Feature;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GeneratorUtil {
  @Inject
  @Extension
  private ClassNames _classNames;
  
  public CharSequence generateFeatures(final ElementWithFeatures e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature f : _features) {
        _builder.append("private ");
        AbstractElement _type = f.getType();
        String _qualifiedName = this._classNames.qualifiedName(_type);
        _builder.append(_qualifiedName, "");
        _builder.append(" ");
        String _name = f.getName();
        _builder.append(_name, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateGettersSettersHeaders(final ElementWithFeatures e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature f : _features) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* @return the value of \'<em><b>");
        String _name = f.getName();
        _builder.append(_name, " ");
        _builder.append("</b></em>\' feature");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("public ");
        AbstractElement _type = f.getType();
        String _qualifiedName = this._classNames.qualifiedName(_type);
        _builder.append(_qualifiedName, "");
        _builder.append(" get");
        String _name_1 = f.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper, "");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* @param ");
        String _name_2 = f.getName();
        _builder.append(_name_2, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*     the new value of the \'{@link ");
        String _name_3 = e.getName();
        _builder.append(_name_3, " ");
        _builder.append("#get");
        String _name_4 = f.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper_1, " ");
        _builder.append("() <em>");
        String _name_5 = f.getName();
        _builder.append(_name_5, " ");
        _builder.append("</em>}\' feature.");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("public void set");
        String _name_6 = f.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_6);
        _builder.append(_firstUpper_2, "");
        _builder.append("(");
        AbstractElement _type_1 = f.getType();
        String _qualifiedName_1 = this._classNames.qualifiedName(_type_1);
        _builder.append(_qualifiedName_1, "");
        _builder.append(" ");
        String _name_7 = f.getName();
        _builder.append(_name_7, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
