package com.personal.project.db2;

public class Db2DataTypesWithLength implements Db2DataTypes
{
    private Db2WithLengthEnum type;
    private int length;

    public Db2DataTypesWithLength(Db2WithLengthEnum type, int length)
    {
        this.type = type;
        this.length = length;
    }
}
