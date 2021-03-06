package de.proteinms.xtandemparser.xtandem;

import de.proteinms.xtandemparser.interfaces.Modification;
import java.io.Serializable;

/**
 * This class implements modification and represents a fixed modification
 * object.
 *
 * @author Thilo Muth
 */
public class FixedModification implements Modification, Serializable {

    /**
     * This String holds the name of the modification.
     */
    private String iName;
    /**
     * This variable contains the mass of the modification.
     */
    private double iMass;
    /**
     * This variable contains the location of the modification.
     */
    private String iLocation;
    /**
     * This variable holds number of the modification from one peptide.
     */
    private int iNumber;
    /**
     * This variables holds the modified residue.
     */
    private String iModifiedResidue;
    /**
     * True if the modification is a substitution.
     */
    private boolean isSubstitution;
    /**
     * The substituted amino acid (if any). Null if the modification is not a
     * substitution.
     */
    private String substitutedAminoAcid;

    /**
     * Constructor for building a fixed modification.
     *
     * @param aName the modification name
     * @param aMass the modification mass
     * @param aLocation the modification location
     * @param aNumber aNumber the number of the modification
     * @param aIsSubstitution if the modification is a substitution or not
     * @param aSubstitutedAminoAcid the substituted amino acid (if any). Null if
     * the modification is not a substitution.
     */
    public FixedModification(String aName, double aMass, String aLocation, int aNumber,
            boolean aIsSubstitution, String aSubstitutedAminoAcid) {
        iName = aName;
        iMass = aMass;
        iLocation = aLocation;
        iNumber = aNumber;
        isSubstitution = aIsSubstitution;
        substitutedAminoAcid = aSubstitutedAminoAcid;
    }

    /**
     * Returns the modification name.
     *
     * @return the modification name
     */
    public String getName() {
        return iName;
    }

    /**
     * Sets the modification name.
     *
     * @param aName the modification name
     */
    public void setName(String aName) {
        iName = aName;
    }

    /**
     * Returns the modification mass.
     *
     * @return the modification mass
     */
    public double getMass() {
        return iMass;
    }

    /**
     * Sets the modification mass.
     *
     * @param aMass the modification mass
     */
    public void setMass(double aMass) {
        iMass = aMass;
    }

    /**
     * Returns the modification location.
     *
     * @return the modification location
     */
    public String getLocation() {
        return iLocation;
    }

    /**
     * Sets the modification location.
     *
     * @param aLocation the modification location
     */
    public void setLocation(String aLocation) {
        iLocation = aLocation;
    }

    /**
     * Always returns true because it's a fixed modification.
     *
     * @return true because it's a fixed modification
     */
    public boolean isFixed() {
        return true;
    }

    /**
     * Returns the domain id.
     *
     * @return the number of modification
     */
    public int getNumber() {
        return iNumber;
    }

    /**
     * Sets the domain id.
     *
     * @param aNumber the number of the modification
     */
    public void setNumber(int aNumber) {
        iNumber = aNumber;
    }

    public boolean isSubstitution() {
        return isSubstitution;
    }

    public String getSubstitutedAminoAcid() {
        return substitutedAminoAcid;
    }

    /**
     * Returns the modified residue (a peptide letter).
     *
     * @return iModifiedResidue
     */
    public String getModifiedResidue() {
        String[] values = iName.split("@");
        iModifiedResidue = values[1];
        return iModifiedResidue;
    }

    /**
     * Set if the modification is a substitution or not.
     *
     * @param isSubstitution if the modification is a substitution or not
     */
    public void setIsSubstitution(boolean isSubstitution) {
        this.isSubstitution = isSubstitution;
    }

    /**
     * Set the substituted amino acid.
     *
     * @param substitutedAminoAcid the substituted amino acid
     */
    public void setSubstitutedAminoAcid(String substitutedAminoAcid) {
        this.substitutedAminoAcid = substitutedAminoAcid;
    }
}
