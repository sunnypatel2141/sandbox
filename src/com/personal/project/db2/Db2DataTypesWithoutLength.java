package com.personal.project.db2;

public class Db2DataTypesWithoutLength  implements Db2DataTypes
{
    private Db2NoLengthEnum type;

    public Db2DataTypesWithoutLength(Db2NoLengthEnum type)
    {
        this.type = type;
    }
}
