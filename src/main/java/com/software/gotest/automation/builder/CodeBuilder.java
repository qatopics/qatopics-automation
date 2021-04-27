package com.software.gotest.automation.builder;

public class CodeBuilder {
    public String beginningOfAutomation() {
        String code = CodeBuilderConstants.EXAMPLE_START_CODE;
        System.out.println(code);
        return code;
    }
    public String endOfAutomation() {
        String code = CodeBuilderConstants.EXAMPLE_END_CODE;
        System.out.println(code);
        return code;
    }
    public String samplePrint() {
        String code = CodeBuilderConstants.MAIN_CODE_INDENTATION
                + CodeBuilderConstants.EXAMPLE_PRINT_CODE;
        System.out.println(code);
        return code;
    }
}
