/**
 * This class is generated by jOOQ
 */
package org.yesworkflow.db.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.yesworkflow.db.jooq.tables.Annotation;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AnnotationRecord extends UpdatableRecordImpl<AnnotationRecord> implements Record8<Integer, Integer, Integer, Integer, String, String, String, String> {

	private static final long serialVersionUID = -1472462095;

	/**
	 * Setter for <code>annotation.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>annotation.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>annotation.source_file_id</code>.
	 */
	public void setSourceFileId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>annotation.source_file_id</code>.
	 */
	public Integer getSourceFileId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>annotation.qualifies</code>.
	 */
	public void setQualifies(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>annotation.qualifies</code>.
	 */
	public Integer getQualifies() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>annotation.line_number</code>.
	 */
	public void setLineNumber(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>annotation.line_number</code>.
	 */
	public Integer getLineNumber() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>annotation.tag</code>.
	 */
	public void setTag(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>annotation.tag</code>.
	 */
	public String getTag() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>annotation.keyword</code>.
	 */
	public void setKeyword(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>annotation.keyword</code>.
	 */
	public String getKeyword() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>annotation.value</code>.
	 */
	public void setValue(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>annotation.value</code>.
	 */
	public String getValue() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>annotation.description</code>.
	 */
	public void setDescription(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>annotation.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Integer, Integer, Integer, String, String, String, String> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Integer, Integer, Integer, String, String, String, String> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Annotation.ANNOTATION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Annotation.ANNOTATION.SOURCE_FILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Annotation.ANNOTATION.QUALIFIES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Annotation.ANNOTATION.LINE_NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Annotation.ANNOTATION.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Annotation.ANNOTATION.KEYWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Annotation.ANNOTATION.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Annotation.ANNOTATION.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getSourceFileId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getQualifies();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getLineNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getKeyword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnnotationRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnnotationRecord value2(Integer value) {
		setSourceFileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnnotationRecord value3(Integer value) {
		setQualifies(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnnotationRecord value4(Integer value) {
		setLineNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnnotationRecord value5(String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnnotationRecord value6(String value) {
		setKeyword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnnotationRecord value7(String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnnotationRecord value8(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnnotationRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, String value7, String value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AnnotationRecord
	 */
	public AnnotationRecord() {
		super(Annotation.ANNOTATION);
	}

	/**
	 * Create a detached, initialised AnnotationRecord
	 */
	public AnnotationRecord(Integer id, Integer sourceFileId, Integer qualifies, Integer lineNumber, String tag, String keyword, String value, String description) {
		super(Annotation.ANNOTATION);

		setValue(0, id);
		setValue(1, sourceFileId);
		setValue(2, qualifies);
		setValue(3, lineNumber);
		setValue(4, tag);
		setValue(5, keyword);
		setValue(6, value);
		setValue(7, description);
	}
}