package com.personal.project.db2;

public class DbColumns {

    private String columnName;
    private Db2DataTypes dataType;

    private boolean isNullable;
    private boolean isPK;

    private int length;

    private DbColumns()
    {

    }

    public static class Builder
    {
        private String columnName;
        private Db2DataTypes dataType;
        private int length;

        private boolean isNullable;
        private boolean isPK;

        Builder(String columnName, Db2DataTypes dataType)
        {
            this.columnName = columnName;
            this.dataType = dataType;
        }

        public Builder withNullablePK(boolean isNullable, boolean isPK)
        {
            this.isNullable = isNullable;
            this.isPK = isPK;
            return this;
        }

        public Builder withLength(int length)
        {
            this.length = length;
            return this;
        }

        public DbColumns build()
        {
            DbColumns dbColumns = new DbColumns();
            dbColumns.columnName = this.columnName;
            dbColumns.dataType = this.dataType;
            dbColumns.isNullable = this.isNullable;
            dbColumns.isPK = this.isPK;
            dbColumns.length = this.length;
            return dbColumns;
        }

    }
}
