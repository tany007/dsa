package org.example.nagarro;

public class ModifyVariableName {

    public String modifyVariableNameToJava(String variableName) {
        StringBuilder modifiedName = new StringBuilder();
        boolean nextUpperCase = false;

        for (char c : variableName.toCharArray()) {
            if (c == '_') {
                nextUpperCase = true;
            } else {
                if (nextUpperCase) {
                    modifiedName.append(Character.toUpperCase(c));
                    nextUpperCase = false;
                } else {
                    modifiedName.append(c);
                }
            }
        }

        return modifiedName.toString();
    }

    public String modifyVariableNameToCpp(String variableName) {
        StringBuilder modifiedName = new StringBuilder();

        for (char c : variableName.toCharArray()) {
            if (Character.isUpperCase(c)) {
                modifiedName.append('_').append(Character.toLowerCase(c));
            } else {
                modifiedName.append(c);
            }
        }

        return modifiedName.toString();
    }

    public static void main(String[] args) {
        String variableNameInCpp = "this_is_a_variable";
        String variableNameInJava = "thisIsAVariable";

        ModifyVariableName modifyVariableName = new ModifyVariableName();
        System.out.println("Variable name in Java: " + modifyVariableName.modifyVariableNameToJava(variableNameInCpp));
        System.out.println("Variable name in C++: " + modifyVariableName.modifyVariableNameToCpp(variableNameInJava));
    }
}
