/**
 * This class is generated by jOOQ
 */
package com.ethercis.dao.jooq;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ehr extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1918297632;

	/**
	 * The reference instance of <code>ehr</code>
	 */
	public static final Ehr EHR = new Ehr();

	/**
	 * No further instances allowed
	 */
	private Ehr() {
		super("ehr");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.ethercis.dao.jooq.tables.Access.ACCESS,
			com.ethercis.dao.jooq.tables.AuditTrail.AUDIT_TRAIL,
			com.ethercis.dao.jooq.tables.Composition.COMPOSITION,
			com.ethercis.dao.jooq.tables.CompositionHistory.COMPOSITION_HISTORY,
			com.ethercis.dao.jooq.tables.Concept.CONCEPT,
			com.ethercis.dao.jooq.tables.Contribution.CONTRIBUTION,
			com.ethercis.dao.jooq.tables.ContributionHistory.CONTRIBUTION_HISTORY,
			com.ethercis.dao.jooq.tables.Ehr.EHR,
			com.ethercis.dao.jooq.tables.Entry.ENTRY,
			com.ethercis.dao.jooq.tables.EntryHistory.ENTRY_HISTORY,
			com.ethercis.dao.jooq.tables.EventContext.EVENT_CONTEXT,
			com.ethercis.dao.jooq.tables.EventContextHistory.EVENT_CONTEXT_HISTORY,
			com.ethercis.dao.jooq.tables.Identifier.IDENTIFIER,
			com.ethercis.dao.jooq.tables.Language.LANGUAGE,
			com.ethercis.dao.jooq.tables.Participation.PARTICIPATION,
			com.ethercis.dao.jooq.tables.ParticipationHistory.PARTICIPATION_HISTORY,
			com.ethercis.dao.jooq.tables.PartyIdentified.PARTY_IDENTIFIED,
			com.ethercis.dao.jooq.tables.Status.STATUS,
			com.ethercis.dao.jooq.tables.StatusHistory.STATUS_HISTORY,
			com.ethercis.dao.jooq.tables.System.SYSTEM,
			com.ethercis.dao.jooq.tables.TerminologyProvider.TERMINOLOGY_PROVIDER,
			com.ethercis.dao.jooq.tables.Territory.TERRITORY);
	}
}