package com.personal.project.db2;

public class DbColumnsClient
{
    public static void main(String[] args)
    {
        DbColumns dbColumns =
                new DbColumns.Builder("i", new Db2DataTypesWithLength(Db2WithLengthEnum.CHAR, 10)).withNullablePK(false,
                        true)
                .withLength(10).build();
    }
}
