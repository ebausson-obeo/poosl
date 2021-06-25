/**
 */
package nl.esi.poosl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import nl.esi.poosl.PooslPackage;
import nl.esi.poosl.Statement;
import nl.esi.poosl.StatementSequence;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Statement Sequence</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link nl.esi.poosl.impl.StatementSequenceImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementSequenceImpl extends StatementImpl implements StatementSequence {
    /**
     * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStatements()
     * @generated
     * @ordered
     */
    protected EList<Statement> statements;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected StatementSequenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PooslPackage.Literals.STATEMENT_SEQUENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, PooslPackage.STATEMENT_SEQUENCE__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case PooslPackage.STATEMENT_SEQUENCE__STATEMENTS:
            return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case PooslPackage.STATEMENT_SEQUENCE__STATEMENTS:
            return getStatements();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case PooslPackage.STATEMENT_SEQUENCE__STATEMENTS:
            getStatements().clear();
            getStatements().addAll((Collection<? extends Statement>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case PooslPackage.STATEMENT_SEQUENCE__STATEMENTS:
            getStatements().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case PooslPackage.STATEMENT_SEQUENCE__STATEMENTS:
            return statements != null && !statements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // StatementSequenceImpl
