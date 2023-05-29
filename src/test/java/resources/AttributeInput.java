package resources;

public class AttributeInput {
    private String inputName;
    private String className;
    private String attributeName;
    private String textValue;
    private boolean optionalAttribute;

    @Override
    public String toString() {
        return "AttributeInput{" +
                "inputName='" + inputName + '\'' +
                ", className='" + className + '\'' +
                ", attributeName='" + attributeName + '\'' +
                ", textValue='" + textValue + '\'' +
                ", optionalAttribute=" + optionalAttribute +
                '}';
    }

    public AttributeInput(String inputName, String className, String attributeName, String textValue, boolean optionalAttribute) {
        this.inputName = inputName;
        this.className = className;
        this.attributeName = attributeName;
        this.textValue = textValue;
        this.optionalAttribute = optionalAttribute;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public boolean isOptionalAttribute() {
        return optionalAttribute;
    }

    public void setOptionalAttribute(boolean optionalAttribute) {
        this.optionalAttribute = optionalAttribute;
    }
}
