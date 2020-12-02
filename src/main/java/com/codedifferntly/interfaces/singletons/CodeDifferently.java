package com.codedifferntly.interfaces.singletons;

public class CodeDifferently {
    private static CodeDifferently INSTANCE = new CodeDifferently();

    private CodeDifferently(){

    }
    public static CodeDifferently getInstance(){
        if (INSTANCE == null)
            INSTANCE = new CodeDifferently();
        return INSTANCE;
    }
}
