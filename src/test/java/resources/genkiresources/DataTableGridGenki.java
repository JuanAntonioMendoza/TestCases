package resources.genkiresources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DataTableGridGenki {
    private String section;
    private String label_name;
    private String class_input;
    private String text_value;
    private String optional;
    private String requirement;

    public DataTableGridGenki(String section, String label_name, String class_input, String text_value, String optional, String requirement) {
        this.section = section;
        this.label_name = label_name;
        this.class_input = class_input;
        this.text_value = text_value;
        this.optional = optional;
        this.requirement = requirement;
    }

    public String getText_value() {
        return text_value;
    }

    public void setText_value(String text_value) {
        this.text_value = text_value;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getLabel_name() {
        return label_name;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
    }

    public String getClass_input() {
        return class_input;
    }

    public void setClass_input(String class_input) {
        this.class_input = class_input;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    @Override
    public String toString() {
        return "DataTableGridGenki{" +
                "section='" + section + '\'' +
                ", label_name='" + label_name + '\'' +
                ", class_input='" + class_input + '\'' +
                ", text_value='" + text_value + '\'' +
                ", optional='" + optional + '\'' +
                ", requirement='" + requirement + '\'' +
                '}';
    }
}
