/**
 * generated by Xtext 2.10.0
 */
package cz.lzaruba.modelx.modelX.impl;

import cz.lzaruba.modelx.modelX.AbstractElement;
import cz.lzaruba.modelx.modelX.DataType;
import cz.lzaruba.modelx.modelX.Entity;
import cz.lzaruba.modelx.modelX.Feature;
import cz.lzaruba.modelx.modelX.Import;
import cz.lzaruba.modelx.modelX.Interface;
import cz.lzaruba.modelx.modelX.Model;
import cz.lzaruba.modelx.modelX.ModelXFactory;
import cz.lzaruba.modelx.modelX.ModelXPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelXFactoryImpl extends EFactoryImpl implements ModelXFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModelXFactory init()
  {
    try
    {
      ModelXFactory theModelXFactory = (ModelXFactory)EPackage.Registry.INSTANCE.getEFactory(ModelXPackage.eNS_URI);
      if (theModelXFactory != null)
      {
        return theModelXFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModelXFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelXFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModelXPackage.MODEL: return createModel();
      case ModelXPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case ModelXPackage.INTERFACE: return createInterface();
      case ModelXPackage.ENUM: return createEnum();
      case ModelXPackage.DATA_TYPE: return createDataType();
      case ModelXPackage.IMPORT: return createImport();
      case ModelXPackage.PACKAGE: return createPackage();
      case ModelXPackage.ENTITY: return createEntity();
      case ModelXPackage.FEATURE: return createFeature();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public cz.lzaruba.modelx.modelX.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public cz.lzaruba.modelx.modelX.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelXPackage getModelXPackage()
  {
    return (ModelXPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModelXPackage getPackage()
  {
    return ModelXPackage.eINSTANCE;
  }

} //ModelXFactoryImpl
