package org.yesworkflow.db;

import static org.jooq.impl.DSL.table;

public class Table {

    public static org.jooq.Table<?> ANNOTATION  = table("annotation");
    public static org.jooq.Table<?> CODE        = table("code");
    public static org.jooq.Table<?> SOURCE      = table("source");
}
