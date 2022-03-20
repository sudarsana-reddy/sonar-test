package com.sud.sonar;

import com.sud.sonar.model.Person;

public class NullArgument {

    public Boolean containsString(Person person, String b){
        return person.nameMatches(b);
    }
}