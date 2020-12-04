package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.People;

final public class CodeDifferently extends People {
    private static CodeDifferently INSTANCE = new CodeDifferently();

    private CodeDifferently(){


    }
    public static CodeDifferently getInstance(){
        if (INSTANCE == null)
            INSTANCE = new CodeDifferently();
        return INSTANCE;
    }
}
