/**
 * generated by Xtext 2.10.0
 */
package cz.lzaruba.modelx.modelX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cz.lzaruba.modelx.modelX.Interface#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link cz.lzaruba.modelx.modelX.Interface#getSupertypes <em>Supertypes</em>}</li>
 * </ul>
 *
 * @see cz.lzaruba.modelx.modelX.ModelXPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends ElementWithFeatures
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see cz.lzaruba.modelx.modelX.ModelXPackage#getInterface_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<XAnnotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Supertypes</b></em>' reference list.
   * The list contents are of type {@link cz.lzaruba.modelx.modelX.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supertypes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supertypes</em>' reference list.
   * @see cz.lzaruba.modelx.modelX.ModelXPackage#getInterface_Supertypes()
   * @model
   * @generated
   */
  EList<Interface> getSupertypes();

} // Interface
