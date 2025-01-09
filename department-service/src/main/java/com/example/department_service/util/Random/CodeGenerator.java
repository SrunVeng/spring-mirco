package com.example.department_service.util.Random;

import com.example.department_service.common.constance.DepartmentConstance;



public class CodeGenerator {

    public static String departmentCodeGenerator(String departmentType) {
        // Generate department code based on the department type (Head Office or Branch)
            // Validate if the department type is valid
            if (!departmentType.equals(DepartmentConstance.HEAD_OFFICE) &&
                    !departmentType.equals(DepartmentConstance.BRANCH)) {
                throw new IllegalArgumentException("Invalid department type: " + departmentType);
            }

            // Generate a random department code with the selected prefix (H or B)
            return departmentType + "-" + String.format("%03d", getRandomNumber());
        }

        // Helper method to generate a random number
        private static int getRandomNumber() {
            return (int)(Math.random() * 1000);  // Generates a random number between 0 and 999
        }




}
