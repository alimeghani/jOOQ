/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.pg_catalog.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCollation extends TableImpl<Record> {

    private static final long serialVersionUID = 748348053;

    /**
     * The reference instance of <code>pg_catalog.pg_collation</code>
     */
    public static final PgCollation PG_COLLATION = new PgCollation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_collation.collname</code>.
     */
    public final TableField<Record, String> COLLNAME = createField("collname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collnamespace</code>.
     */
    public final TableField<Record, Long> COLLNAMESPACE = createField("collnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collowner</code>.
     */
    public final TableField<Record, Long> COLLOWNER = createField("collowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collencoding</code>.
     */
    public final TableField<Record, Integer> COLLENCODING = createField("collencoding", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collcollate</code>.
     */
    public final TableField<Record, String> COLLCOLLATE = createField("collcollate", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_collation.collctype</code>.
     */
    public final TableField<Record, String> COLLCTYPE = createField("collctype", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_collation</code> table reference
     */
    public PgCollation() {
        this(DSL.name("pg_collation"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_collation</code> table reference
     */
    public PgCollation(String alias) {
        this(DSL.name(alias), PG_COLLATION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_collation</code> table reference
     */
    public PgCollation(Name alias) {
        this(alias, PG_COLLATION);
    }

    private PgCollation(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgCollation(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgCollation(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_COLLATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollation as(String alias) {
        return new PgCollation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollation as(Name alias) {
        return new PgCollation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCollation rename(String name) {
        return new PgCollation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCollation rename(Name name) {
        return new PgCollation(name, null);
    }
}
